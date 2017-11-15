package com.example.statisticsService.controllers;

import com.example.statisticsService.models.Transaction;
import com.example.statisticsService.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping("/transactions")
    ResponseEntity<String> addTransaction(@RequestBody Transaction transaction) {
        transactionService.add(transaction);
        return new ResponseEntity<>(CREATED);
    }
}
