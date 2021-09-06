package ru.project.serviceOfExchangeRates.service;

import org.springframework.http.ResponseEntity;
import ru.project.serviceOfExchangeRates.DTO.CurrencyDTO;

public interface CurrencyService {
    ResponseEntity<CurrencyDTO> getCurrency(String date, String base);
}
