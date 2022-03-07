package com.dev.borges.projapp.repositories;

import com.dev.borges.projapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
