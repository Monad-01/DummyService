package dev.monad01.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepostitory customerRepostitory) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        customerRepostitory.save(customer);

    }
}
