package composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class City {

    private String name;

    private List<Mall> malls = new ArrayList<>();
    private List<School> schools = new ArrayList<>();

    public City(String name) {
        this.name = name;
    }

    public void killVirus() {
        malls.forEach(Mall::killVirus);
        schools.forEach(School::killVirus);
    }

    public void addMall(Mall mall) {
        malls.add(mall);
    }

    public void removeMall(Mall mall) {
        malls.remove(mall);
    }

    public void addSchool(School school) {
        schools.add(school);
    }

    public void removeSchool(School school) {
        schools.remove(school);
    }
}
