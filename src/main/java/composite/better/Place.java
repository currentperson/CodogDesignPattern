package composite.better;

public interface Place {
    void add(Place place);
    void remove(Place place);
    void killVirus();
}
