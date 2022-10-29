package team.perseo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("views")
public class Consumo {


    @GetMapping("/")
    private String index(){
        return  "index";

    }

    @GetMapping("/agentes")
    private String getAgentes(){
        return  "views/agentes";

    }
}
