package com.example.address_service.service;

import com.example.address_service.repository.AddressRepo;
import com.example.address_service.entity.Address;
import com.example.address_service.response.AddressResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private AddressRepo addressRepo;

    @Autowired
    private ModelMapper mapper;

    public AddressResponse findAddressByEmployeeId(int employeeId) {
        Optional<Address> addressByEmployeeId = addressRepo.findAddressByEmployeeId(employeeId);
        return mapper.map(addressByEmployeeId,AddressResponse.class);
    }

}