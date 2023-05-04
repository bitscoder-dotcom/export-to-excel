package com.roman.exporttoexceldemo.service;

import com.roman.exporttoexceldemo.domain.Customer;
import com.roman.exporttoexceldemo.repository.CusterRepository;
import com.roman.exporttoexceldemo.util.ExcelExportUtils;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {
     private CusterRepository custerRepository;

     public List<Customer> exportCustomerToExcel(HttpServletResponse response) {
         List<Customer> customers = custerRepository.findAll();
         ExcelExportUtils exportUtils = new ExcelExportUtils(customers);
         try {
             exportUtils.exportDataToExcel(response);
             return customers;
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
     }
}
