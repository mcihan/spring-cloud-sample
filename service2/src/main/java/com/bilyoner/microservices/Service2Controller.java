package com.bilyoner.microservices;


import com.bilyoner.microservices.contracts.Service2Contract;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller implements Service2Contract {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/service-2/{consumerName}")
    @Override
    public String service2Controller(@PathVariable String consumerName) {
        return "Service-2 running on port: " + serverPort + " consumerName: " + consumerName;
    }
}
