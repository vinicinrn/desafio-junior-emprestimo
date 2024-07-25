package com.vini.loanchallenge.services;


import com.vini.loanchallenge.dto.CustomerRequestDTO;
import com.vini.loanchallenge.dto.LoanResponseDTO;

import java.util.ArrayList;
import java.util.List;

//todo: passar objetos do DTO

public class LoanService {

    public List<LoanResponseDTO> defineLoan(CustomerRequestDTO customerRequestDTO){

        int age = customerRequestDTO.getAge();
        double income = customerRequestDTO.getIncome();
        String location = customerRequestDTO.getLocation();



        List<LoanResponseDTO> loans = new ArrayList<>();
        //todo: passar regras negociais


        return null;
    }
}
