package team.perseo.Controllers;


import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("views")
public class LlamarApi {

    @GetMapping("/")
    private String index(){
        return  "index";

    }

    @GetMapping("/agentes")
    private String getAgentes(){
        return  "views/agentes";

    }

    @GetMapping ("/listar")
    public String listar(Model model){
        String url = "https://mqjl9s6vf4.execute-api.eu-west-1.amazonaws.com/prod/v1/hackday/public/event";
        RestTemplate salida = new RestTemplate();
        String agentes = salida.getForObject(url,String.class);
        //System.out.println("Salidadddd"+ agentes);
        JSONObject jsonObject = new JSONObject(agentes);
        model.addAttribute("data", jsonObject.get("payload"));
        //System.out.println("OBJECT : "+jsonObject.get("payload"));

        return  "views/agentes";
    }

}
