package com.kabanosy.internshipmanager.company;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
class CompanyHeadquarters {
    private String name;

    private String address;

    private String postalCode;
}
