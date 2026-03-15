package be.thomasmore.party.model;

import jakarta.persistence.*;

import java.util.List;

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

    @Column(name = "VenueName")
    private String venueName;
    @Column(name = "LinkMoreInfo")
    private String linkMoreInfo;
    private int capacity;
    private boolean foodProvided;
    private boolean indoor;
    private boolean outdoor;
    private boolean freeParkingAvailable;
    private String city;
        private int distanceFromPublicTransportInKm;
    private String imageUrl;

    @OneToMany(mappedBy = "venue")
    private List<Party> parties;

    public List<Party> getParties() {
        return parties;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFoodProvided() {
        return foodProvided;
    }

    public void setFoodProvided(boolean foodProvided) {
        this.foodProvided = foodProvided;
    }

    public boolean isIndoor() {
        return indoor;
    }

    public void setIndoor(boolean indoor) {
        this.indoor = indoor;
    }

    public boolean isOutdoor() {
        return outdoor;
    }

    public void setOutdoor(boolean outdoor) {
        this.outdoor = outdoor;
    }

    public boolean isFreeParkingAvailable() {
        return freeParkingAvailable;
    }

    public void setFreeParkingAvailable(boolean freeParkingAvailable) {
        this.freeParkingAvailable = freeParkingAvailable;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDistanceFromPublicTransportInKm() {
        return distanceFromPublicTransportInKm;
    }

    public void setDistanceFromPublicTransportInKm(int distanceFromPublicTransportInKm) {
        this.distanceFromPublicTransportInKm = distanceFromPublicTransportInKm;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

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
