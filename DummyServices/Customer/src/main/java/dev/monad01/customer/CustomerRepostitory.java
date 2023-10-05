package dev.monad01.customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepostitory extends JpaRepository<Customer, Integer> {
}
