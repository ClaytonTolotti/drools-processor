package br.com.livelo.droolsprocessor.services;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DroolsProcessorService {

    @Autowired
    private Gson gson;

    public void test(String json){
        JsonElement jsonElement = gson.fromJson(json, JsonElement.class);
        log.info("jsonElement: {}", jsonElement);
    }
}
