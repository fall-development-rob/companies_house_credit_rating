package com.creditchecker.demo.dto;

import java.time.LocalDate;

public class CompanyResponseDTO {

    private String companyNumber;
    private String companyName;
    private String companyStatus;
    private LocalDate incorporationDate;

    // Getters and Setters
    public String getCompanyNumber() {
        return this.companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStatus() {
        return this.companyStatus;
    }

    public void setStatus(String status) {
        this.companyStatus = status;
    }

    public LocalDate getIncorporationDate() {
        return this.incorporationDate;
    }

    public void setIncorporationDate(LocalDate incorporationDate) {
        this.incorporationDate = incorporationDate;
    }

}
