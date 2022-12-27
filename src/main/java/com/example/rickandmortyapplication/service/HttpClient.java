package com.example.rickandmortyapplication.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

@Component
public class HttpClient {
    private final CloseableHttpClient httpClient = HttpClients.createDefault();
    private final ObjectMapper objectMapper;

    public HttpClient(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public <T> T get(String url, Class<T> clazz) {
        HttpGet request = new HttpGet(url);
        try (CloseableHttpResponse response = httpClient.execute(request)) {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                String result = EntityUtils.toString(entity);
                return objectMapper.readValue(result, clazz);
            }
        } catch (IOException e) {
            throw new RuntimeException("Can't fetch info from URL " + url, e);
        }
        return null;
    }
}
