package com.busticket.service.interfaces;

import com.busticket.dto.response.CustomerResponse;

public interface ICustomerService {
    CustomerResponse getCustomerWithAddress(Long customerId);
}
