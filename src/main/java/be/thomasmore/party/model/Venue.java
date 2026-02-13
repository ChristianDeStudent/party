package be.thomasmore.party.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Dit is niet zomaar een klas, dit is een database-tabel
//Standaard maakt JPA een tabel aan met de naam Venue
//Elke keer dat jij een nieuw Venue object aanmaakt in java, kan dit als een rij in die tabel worden opgeslagen
@Entity
public class Venue {
    // Elk tabel in een database heeft een primary key nodig
    //@Id markeert private integer id als de unieke sleutel
    //Hier mee kan de database exact een specifieke venue terugvinden, zelf asl ze dezelfde naam hebben
    @Id
    // Dit is de "automaat" van je database
    //Zonder dit zou ik altijd zelf een nummer moeten bedenken
    //Identityt zegt:"Regel jij het nummeren maar." de database telt dan zelf telkens +1 bij elke nieuwe rij
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String venueName;
    private String linkMoreInfo;

    public Integer getId() {
        return id;
    }
    //we maken GEEN setId, want de database GenerationType.IDENTITY bepaalt de waarde, niet wij

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getLinkMoreInfo() {
        return linkMoreInfo;
    }

    public void setLinkMoreInfo(String linkMoreInfo) {
        this.linkMoreInfo = linkMoreInfo;
    }
}
