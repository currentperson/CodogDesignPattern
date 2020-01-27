package composite_pattern;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Province {

    private String name;

    private List<City> cities = new ArrayList<>();

    public Province(String name) {
        this.name = name;
    }

    public void killVirus() {
        cities.forEach(City::killVirus);
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public void removeCity(City city) {
        cities.remove(city);
    }
}
