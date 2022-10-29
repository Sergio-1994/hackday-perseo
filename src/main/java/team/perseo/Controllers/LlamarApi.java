package team.perseo.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class LlamarApi {

    @RequestMapping("/hello")
    public String Hello(){
        return "Hello world";
    }

    @GetMapping(value ="callhello")
    private String getcallhello(){
        String uri ="http://localhost:8080/hello";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }

    @GetMapping (value = "/callclientehello")
    public List<Object> getAgent (){
        String uri = "https://mqjl9s6vf4.execute-api.eu-west-1.amazonaws.com/prod/v1/hackday/public/event";
        RestTemplate restTemplate = new RestTemplate();
        Object[] callclientehello  = restTemplate.getForObject(uri, Object[].class);
        return Arrays.asList(callclientehello);

    }
}
