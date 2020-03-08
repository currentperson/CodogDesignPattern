package composite.better;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCompositePlace implements Place {

    private List<Place> list = new ArrayList<>();

    @Override
    public void add(Place place) {
        list.add(place);
    }

    @Override
    public void remove(Place place) {
        list.remove(place);
    }

    @Override
    public void killVirus() {
        list.forEach(Place::killVirus);
    }
}
