package be.thomasmore.party.controllers;

import be.thomasmore.party.model.Venue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.AttributedString;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
    @GetMapping("/pay")
    public String pay(Model model){
        // haal de huidige datum en tijd op
        LocalDateTime nu = LocalDateTime.now();

        // Berkenen de datum over 30 dagen
        LocalDateTime vervaldatum = nu.plusDays(30);

        //Definieer een formaat
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //Formatteer de datum naar een String
        String geformatteerdeDatum = nu.format(formatter);
        String geformatteerdeVervalDatum = vervaldatum.format(formatter);

        // Variabelen toevoegen aan het model
        model.addAttribute("vandaag", geformatteerdeDatum);
        model.addAttribute("Uiterstedatum", geformatteerdeVervalDatum);
        return "pay";
    }


}
