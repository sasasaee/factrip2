package application;

import java.time.LocalDate;
import java.time.LocalTime;

public class TripEvent {
    private String id;
    private String name;
    private LocalDate date;
    private LocalTime time;
    private String location;
    private String description;
    private String category; // New field for category
    
    // Default constructor
    public TripEvent() {}
    
    // Constructor with all fields
    public TripEvent(String id, String name, LocalDate date, LocalTime time, String location, String description, String category) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.time = time;
        this.location = location;
        this.description = description;
        this.category = category;
    }
    
    // Getters and Setters
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public LocalDate getDate() {
        return date;
    }
    
    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    public LocalTime getTime() {
        return time;
    }
    
    public void setTime(LocalTime time) {
        this.time = time;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() { // Getter for category
        return category;
    }

    public void setCategory(String category) { // Setter for category
        this.category = category;
    }
    
    @Override
    public String toString() {
        return "TripEvent{" +
                "id=\'" + id + '\'' +
                ", name=\'" + name + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", location=\'" + location + '\'' +
                ", description=\'" + description + '\'' +
                ", category=\'" + category + '\'' +
                '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        TripEvent tripEvent = (TripEvent) obj;
        return id != null ? id.equals(tripEvent.id) : tripEvent.id == null;
    }
    
    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}