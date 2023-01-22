package com.learn.payment.repository;

import org.springframework.data.repository.CrudRepository;
import com.learn.payment.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
