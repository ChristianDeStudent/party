package be.thomasmore.party.model;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
public class Party {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private int pricePresaleInEur;
    private int priceInEur;
    private String extraInfo;
    private LocalTime date,doors;
    private String imageUrl;
    @ManyToOne
    @JoinColumn(name = "venue_id")
    private Venue venue;

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPricePresaleInEur() {
        return pricePresaleInEur;
    }

    public void setPricePresaleInEur(int pricePresaleInEur) {
        this.pricePresaleInEur = pricePresaleInEur;
    }

    public int getPriceInEur() {
        return priceInEur;
    }

    public void setPriceInEur(int priceInEur) {
        this.priceInEur = priceInEur;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public LocalTime getDate() {
        return date;
    }

    public void setDate(LocalTime date) {
        this.date = date;
    }

    public LocalTime getDoors() {
        return doors;
    }

    public void setDoors(LocalTime doors) {
        this.doors = doors;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
