package com.busticket.mapper.request;

import com.busticket.dto.request.CustomerRequest;
import com.busticket.entity.Customer;
import com.busticket.entity.Address;
import org.springframework.stereotype.Component;

@Component
public class CustomerRequestMapper {

    private final AddressRequestMapper addressMapper;

    public CustomerRequestMapper(AddressRequestMapper addressMapper) {
        this.addressMapper = addressMapper;
    }

    public Customer requestToEntity(CustomerRequest dto) {
        if (dto == null) return null;

        Customer customer = new Customer();
        customer.setName(dto.getName());
        customer.setEmail(dto.getEmail());
        customer.setPhone(dto.getPhone());

        Address address = addressMapper.requestToEntity(dto.getAddress());
        customer.setAddress(address);

        return customer;
    }

    public CustomerRequest entityToRequest(Customer entity) {
        if (entity == null) return null;

        CustomerRequest dto = new CustomerRequest();
        dto.setName(entity.getName());
        dto.setEmail(entity.getEmail());
        dto.setPhone(entity.getPhone());
        dto.setAddress(addressMapper.entityToRequest(entity.getAddress()));

        return dto;
    }
}