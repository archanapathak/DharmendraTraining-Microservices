package com.example.currency_conversion_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.HashMap;


import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
@RestController
public class CurrencyConversionController {
    @Autowired
    private CurrencyExchangeProxy proxy;
    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion calculateCurrencyConversion(
            @PathVariable String from,@PathVariable String to,
            @PathVariable BigDecimal quantity)
    {
        HashMap<String,String> urivariables = new HashMap<>();
        urivariables.put("from",from);
        urivariables.put("to",to);
        ResponseEntity<CurrencyConversion> responseEntity = new RestTemplate().getForEntity("http://localhost:8002/currency-exchange/from/{from}/to/{to}",
                CurrencyConversion.class, urivariables);
        CurrencyConversion currencyConversion = responseEntity.getBody();
        return new CurrencyConversion(currencyConversion.getId(),
                from, to, quantity,currencyConversion.getConversionMultiple(),quantity.multiply(currencyConversion.getConversionMultiple()),
                currencyConversion.getEnvironment());
      //  return new CurrencyConversion(1000L, from, to, quantity,  BigDecimal.ONE, BigDecimal.ONE, "");
    }

    @GetMapping("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion calculateCurrencyConversionFeign(
            @PathVariable String from,@PathVariable String to,
            @PathVariable BigDecimal quantity)
    {
        CurrencyConversion currencyConversion = proxy.retrieveExchangeValue(from, to);
        return new CurrencyConversion(currencyConversion.getId(),
                from, to, quantity,currencyConversion.getConversionMultiple(),quantity.multiply(currencyConversion.getConversionMultiple()),
                currencyConversion.getEnvironment()+" "+"feign");
        //  return new CurrencyConversion(1000L, from, to, quantity,  BigDecimal.ONE, BigDecimal.ONE, "");
    }
}
