package com.example.autozone.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {
    Name name;
    Map<String, Currency> currencies;

    public Country(Name name, Map<String, Currency> currencies) {
        this.name = name;
        this.currencies = currencies;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Map<String, Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(Map<String, Currency> currencies) {
        this.currencies = currencies;
    }
}
