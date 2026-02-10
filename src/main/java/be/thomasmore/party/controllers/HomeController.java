package be.thomasmore.party.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.AttributedString;

@Controller
public class HomeController {
    @GetMapping({"/","/home"})
    public String home(Model model){
        int myCalculatedValue = 34 * 62;
        model.addAttribute("myCalculatedValue", myCalculatedValue);
        String appName = "Albania lover";
        model.addAttribute("appName", appName);
        return "home";
    }
    @GetMapping("/about")
    public String about(Model model){
        String myName = "Christian Mathias Vollstedt";
        String myStreet = "Kloosterstraat";
        String myCity = "Antwerpen";
        model.addAttribute("myName", myName);
        model.addAttribute("myStreet", myStreet);
        model.addAttribute("myCity", myCity);
        return "about";
    }

}
