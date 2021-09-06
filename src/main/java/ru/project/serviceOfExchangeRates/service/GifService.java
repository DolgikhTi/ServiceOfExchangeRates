package ru.project.serviceOfExchangeRates.service;

import org.springframework.http.ResponseEntity;

import ru.project.serviceOfExchangeRates.DTO.GifDTO;

public interface GifService {
    ResponseEntity<GifDTO> getGifResponse(String tag);
}
