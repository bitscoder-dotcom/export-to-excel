package com.roman.exporttoexceldemo.controller;

import com.roman.exporttoexceldemo.service.CustomerService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;
    @GetMapping("/export-to-excel")
    public void exportToExcel(HttpServletResponse response) {
        response.setContentType("application/octet-stream");
        String headerKey = "Content-Disposition";
        String headerValue = "Attachment: filename=Customers_Information.xlsx";

        response.setHeader(headerKey, headerValue);
        customerService.exportCustomerToExcel(response);
    }
}
