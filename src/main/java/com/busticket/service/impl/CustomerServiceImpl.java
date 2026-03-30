package com.busticket.service.impl;

import com.busticket.dto.response.CustomerResponse;
import com.busticket.entity.Address;
import com.busticket.entity.Customer;
import com.busticket.exception.ResourceNotFoundException;
import com.busticket.mapper.response.CustomerResponseMapper;
import com.busticket.respository.ICustomerRepo;
import com.busticket.service.interfaces.ICustomerService;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerServiceImpl implements ICustomerService {

    private final ICustomerRepo customerRepository;


    @Override
    @Transactional(readOnly = true)
    public CustomerResponse getCustomerWithAddress(Integer customerId) {
        Customer customer = customerRepository.findByIdWithAddress(customerId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Customer", "id", customerId));

        if (customer.getAddress() == null) {
            customer.setAddress(new Address()); // avoids NPE
        }

        return CustomerResponseMapper.entityToResponse(customer);
    }
}
