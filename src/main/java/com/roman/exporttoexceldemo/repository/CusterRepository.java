package com.roman.exporttoexceldemo.repository;

import com.roman.exporttoexceldemo.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CusterRepository extends JpaRepository<Customer, Integer> {
}
