package team.perseo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Consumo {

    @RequestMapping("/prueba")
    public String prueba(){
        return "prueba";
    }

    @GetMapping(value = "getPrueba")
    private String getPrueba(){
        String uri = "http://localhost:8080/prueba";
        RestTemplate prueba = new RestTemplate();
        String result = prueba.getForObject(uri, String.class);
        return  result;

    }
}
