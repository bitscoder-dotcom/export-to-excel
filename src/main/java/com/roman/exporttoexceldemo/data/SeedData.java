package com.roman.exporttoexceldemo.data;

import com.roman.exporttoexceldemo.domain.Address;
import com.roman.exporttoexceldemo.domain.Customer;
import com.roman.exporttoexceldemo.repository.CusterRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class SeedData {
    private CusterRepository custerRepository;

    public SeedData(CusterRepository custerRepository) {
        this.custerRepository = custerRepository;
    }

    private List<Customer> customers = Arrays.asList(
            new Customer("Sam", "Jefferson", "samj@email.com", new Address("Afghanistan", "Combina", "Forex", "12 Street")),
            new Customer("Godwin", "Jefferson", "samj@email.com", new Address("Afghanistan", "Combina", "Forex", "12 Street")),
            new Customer("Sam", "Gabbage", "samj@email.com", new Address("Afghanistan", "Combina", "Forex", "12 Street")),
            new Customer("Samuel", "John", "samj@email.com", new Address("Afghanistan", "Combina", "Forex", "12 Street")),
            new Customer("Samantha", "Jefferson", "samj@email.com", new Address("Afghanistan", "Combina", "Forex", "12 Street")),
            new Customer("Pius", "Sunday", "samj@email.com", new Address("Afghanistan", "Combina", "Forex", "12 Street")),
            new Customer("Victoria", "Ingrid", "samj@email.com", new Address("Afghanistan", "Combina", "Forex", "12 Street")),
            new Customer("Martha", "Kennedy", "samj@email.com", new Address("Afghanistan", "Combina", "Forex", "12 Street")),
            new Customer("Amanda", "Collins", "samj@email.com", new Address("Afghanistan", "Combina", "Forex", "12 Street"))
            );

//    @PostConstruct
    public void saveCustomers() {
        custerRepository.saveAll(customers);
    }
}
