package com.example.autozone.Controller;
import com.example.autozone.Model.Country;
import com.example.autozone.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/")
    public List<String> getCountries(@RequestParam("currency") String currency) {
        return countryService.fetchCountriesByCurrency(currency);
    }
}

