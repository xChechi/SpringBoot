package com.projectone.runner;

import com.projectone.entity.Customer;
import com.projectone.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandRunner implements CommandLineRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {

        Customer customer = Customer.builder()
                .firstName("Just")
                .lastName("Che")
                .age(22)
                .build();

        Customer savedCustomer = customerRepository.save(customer);
        System.out.println(savedCustomer);

    }
}
