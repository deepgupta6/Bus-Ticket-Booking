package com.busticket.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.busticket.entity.Customer;

public interface ICustomerRepo extends JpaRepository<Customer, Long>{

}
