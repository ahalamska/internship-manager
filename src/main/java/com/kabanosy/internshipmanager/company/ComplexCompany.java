package com.kabanosy.internshipmanager.company;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
class ComplexCompany {

    private String name;

    private Long employeesCount;

    private BigDecimal budget;

    private CompanyHeadquarters companyHeadquarters;

}
