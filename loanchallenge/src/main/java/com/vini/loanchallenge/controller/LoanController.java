package com.vini.loanchallenge.controller;

import com.vini.loanchallenge.services.LoanService;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping
    public Map<String, Object> getAvailableLoans (@RequestBody Map<String, Object> request) {

    }


}
