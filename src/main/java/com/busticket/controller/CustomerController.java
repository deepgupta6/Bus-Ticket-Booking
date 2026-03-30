package com.busticket.controller;

import com.busticket.dto.response.CustomerResponse;
import com.busticket.service.interfaces.ICustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final ICustomerService customerService;

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> getCustomerById(@PathVariable Integer id) {

        CustomerResponse response = customerService.getCustomerWithAddress(id);

        return ResponseEntity.ok(response);
    }
}