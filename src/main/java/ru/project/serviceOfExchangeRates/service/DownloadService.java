package ru.project.serviceOfExchangeRates.service;

import org.springframework.http.ResponseEntity;

import java.net.URI;


public interface DownloadService {
    ResponseEntity<byte[]> getGifByUrl(URI url);
}
