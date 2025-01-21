package com.example.employee_srvice.Service;
import com.example.employee_srvice.Repository.EmployeeRepo;
import com.example.employee_srvice.entity.Employee;
import com.example.employee_srvice.response.AddressResponse;
import com.example.employee_srvice.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private WebClient webClient;

    public EmployeeResponse getEmployeeById(int id) {

        Optional<Employee> employee = employeeRepo.findById(id);

        EmployeeResponse employeeResponse = mapper.map(employee, EmployeeResponse.class);

        // Using WebClient
        AddressResponse addressResponse1 =
                webClient.get().uri("/address/" + id).retrieve().bodyToMono(AddressResponse.class).block();
        employeeResponse.setAddressResponse(addressResponse1);

        return employeeResponse;
    }

}