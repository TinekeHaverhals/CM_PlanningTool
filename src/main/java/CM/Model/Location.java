package CM.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Tineke Haverhals
 * 7/04/21.
 */
@Entity
public class Location {
    @Id
    @GeneratedValue
    private int id;
    private String locationName;

    public Location(){

    }

    public Location(String locationName){
        this.locationName = locationName;
    }

    public int getId() {
        return id;
    }

    public Location setId(int id) {
        this.id = id;
        return this;
    }

    public String getLocationName() {
        return locationName;
    }

    public Location setLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }
}
