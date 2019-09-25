package br.com.livelo.droolsprocessor.controllers;

import br.com.livelo.droolsprocessor.services.DroolsProcessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DroolsProcessorController {

    @Autowired
    private DroolsProcessorService droolsProcessorService;

    @PostMapping(value = "/v1/drools-processor")
    public void test(@RequestBody String body){
        droolsProcessorService.test(body);
    }
}
