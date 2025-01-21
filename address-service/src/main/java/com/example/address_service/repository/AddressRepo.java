package com.example.address_service.repository;

import com.example.address_service.entity.Address;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepo extends JpaRepository<Address,Integer> {
    @Query(
            nativeQuery = true,
            //value = "SELECT ea.id, ea.city, ea.state FROM microservice-demo.address ea join microservice-demo.employee e on e.id = ea.employeeid where ea.employeeid=:employeeId"
            value = "SELECT ea.id, ea.city, ea.state FROM address ea join employee e on e.id = ea.employeeid where ea.employeeid=:employeeId"
    )
    Optional<Address> findAddressByEmployeeId(@Param("employeeId") int employeeId);


}

