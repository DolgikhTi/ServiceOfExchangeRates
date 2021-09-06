package ru.project.serviceOfExchangeRates.service.Impl;

import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.project.serviceOfExchangeRates.client.DownloadClient;
import ru.project.serviceOfExchangeRates.service.DownloadService;

import java.net.URI;

@Service
@Data
public class DownloadServiceImpl implements DownloadService {
    private final DownloadClient downloadClient;

    @Override
    public ResponseEntity<byte[]> getGifByUrl(URI uri) {
        return downloadClient.getGifByUrl(uri);
    }
}
