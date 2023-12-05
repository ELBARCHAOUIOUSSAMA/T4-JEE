package org.sid.orderservice.service;

import org.sid.orderservice.entities.Customer;

public interface CustomerRestClientService {
    public Customer customerById(Long id);

}
