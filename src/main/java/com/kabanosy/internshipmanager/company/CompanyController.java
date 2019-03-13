package com.kabanosy.internshipmanager.company;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @GetMapping
    public ResponseEntity<String> getSimpleCompany() {

        String response = "Ja jestem prostą firmą. Dzień dobry.";
        return ResponseEntity.ok().body(response);
    }

    @GetMapping(value = "/complex")
    public ComplexCompany getComplexCompany() {
        return ComplexCompany.builder().budget(new BigDecimal(10)).employeesCount(10L).name("complexName").build();
    }

}
