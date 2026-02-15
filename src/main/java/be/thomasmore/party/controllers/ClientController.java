package be.thomasmore.party.controllers;

import be.thomasmore.party.model.Client;
import be.thomasmore.party.repositories.ClientRepository;
import be.thomasmore.party.repositories.VenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalTime;
import java.util.Optional;

@Controller
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping ("/clientgreeting")
    public String clientgreeting(Model model) {
        Optional<Client> clientOptional = clientRepository.findById(1);
        if (clientOptional.isPresent()) {
            Client client = clientOptional.get();
            String greeting = getGreetingBasedOnTime();
            String personalizedGreeting = getPersonalizedMessage(client, greeting);

            model.addAttribute("greeting", greeting);
            model.addAttribute("client", client);
        }
        return "clientgreeting";
    }
    private String getGreetingBasedOnTime() {
        LocalTime now = LocalTime.now();
        int hour = now.getHour();

        if(hour >= 22 || hour < 6) return "Goedenacht";
        if (hour >= 17) return "Goedenavond";
        if (hour >= 12) return "Goedemiddag";
        return "Goedemorgen";
    }

    private String getPersonalizedMessage(Client client, String greeting) {
        int orders = client.getNrOfOrders();
        String name = client.getName();

        if (orders >= 80) return String.format("%s allerliefste %s, jij bent een topper!", greeting, name);
        if (orders >= 50) return  String.format("%s allerliefste %s", greeting, name);
        if (orders >= 10) return  String.format("%s beste %s", greeting, name);
        if (orders == 0) return  String.format("%s %s, en welkom!", greeting, name);

        return String.format("%s %s", greeting, name);
    }

    private double calculateDiscount(Client client) {
        double totalAmount = client.getTotalAmount();
        if (totalAmount < 50) {
            return 0.0;
        } else {
            return totalAmount * 0.005; // 5% korting
        }
    }
    @GetMapping("/clientdetails")
    public String clientdetails(Model model) {
        Optional<Client> clientOptional = clientRepository.findById(1);
        if (clientOptional.isPresent()) {
            Client client = clientOptional.get();
            double discount = calculateDiscount(client);

            model.addAttribute("client", client);
            model.addAttribute("discount", discount);
        }
        return "clientdetails";
    }
    @GetMapping("/clienthome")
    public String home(){
        return "clienthome";
    }
}
