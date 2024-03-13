package com.currencyexchange.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.currencyexchange.model.ConverterModel;

@RestController
public class CurrencyExchangeController {

    private ConverterModel converter = new ConverterModel();
    
     @GetMapping("/currency-exchange/test")
        public String test() {
        	            return "Test route";
        }

    @GetMapping("/currency-exchange-app/from/{from}/to/{to}")
    public String getExchangeRate(@PathVariable String from, @PathVariable String to) {
        double taux = converter.getTaux(from, to);
        return "rate : " + taux;
    }
}
