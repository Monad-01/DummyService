package dev.monad01.customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepostitory customerRepostitory;
    private final RestTemplate restTemplate;
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        customerRepostitory.saveAndFlush(customer);

        restTemplate.getForObject(
                "http:localhost:8081/api/v1/fraud-check{customerId}",

        )


    }
}
