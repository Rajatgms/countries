package com.example.autozone.Service;

import com.example.autozone.Model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryService {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${restCountriesURL}")
    private String url;

    public List<String> fetchCountriesByCurrency(String currency) {
        Country[] countries = restTemplate.getForObject(url, Country[].class);
        return Arrays.stream(countries)
                .filter(country -> country.getCurrencies() != null && country.getCurrencies().containsKey(currency))
                .map(country -> country.getName().getCommon())
                .collect(Collectors.toUnmodifiableList());
    }
}
