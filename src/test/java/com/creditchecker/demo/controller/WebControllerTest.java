package com.creditchecker.demo.controller;

import com.creditchecker.demo.dto.CompanyResponseDTO;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class WebControllerTest {

    @Mock
    private Model model;

    @InjectMocks
    private WebController webController;

    public WebControllerTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetCreditScore_Success() {
        // Arrange
        String companyNumber = "12345678";
        CompanyResponseDTO mockResponse = new CompanyResponseDTO();
        mockResponse.setCompanyNumber(companyNumber);

        // Assert
        verify(model, times(1)).addAttribute("companyNumber", companyNumber);
    }

    @Test
    void testGetCreditScore_Error() {
        // Arrange
        String companyNumber = "12345678";

        // Act
        String viewName = webController.getCreditScore(companyNumber, model);

        // Assert
        assertEquals("error", viewName);
        verify(model, times(1)).addAttribute("message", "Company not found");
    }
}
