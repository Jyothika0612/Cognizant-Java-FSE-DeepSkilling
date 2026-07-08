package com.cognizant.ormlearn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional(readOnly = true)
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Country findCountryByCode(String countryCode)
            throws CountryNotFoundException {

        Optional<Country> result = countryRepository.findById(countryCode);

        if (result.isEmpty()) {
            throw new CountryNotFoundException("Country Not Found");
        }

        return result.get();
    }

    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    @Transactional
    public void deleteCountry(String countryCode) {
        countryRepository.deleteById(countryCode);
    }

    // Query Method 1
    @Transactional(readOnly = true)
    public List<Country> searchCountries(String text) {
        return countryRepository.findByNameContainingIgnoreCase(text);
    }

    // Query Method 2
    @Transactional(readOnly = true)
    public List<Country> searchCountriesSorted(String text) {
        return countryRepository
                .findByNameContainingIgnoreCaseOrderByNameAsc(text);
    }

    // Query Method 3
    @Transactional(readOnly = true)
    public List<Country> getCountriesStartingWith(String alphabet) {
        return countryRepository
                .findByNameStartingWithIgnoreCase(alphabet);
    }
}