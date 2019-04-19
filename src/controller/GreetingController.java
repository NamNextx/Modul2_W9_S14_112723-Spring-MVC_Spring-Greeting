package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    //@RequestMapping(value = "/greeting" , method = RequestMethod.GET)
    @GetMapping("greeting")
    public String greeting(@RequestParam String name, Model modle){
        modle.addAttribute("name", name);
        return "greeting";
    }
}
