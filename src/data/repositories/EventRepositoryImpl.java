package data.repositories;

import data.model.Event;

import java.util.ArrayList;
import java.util.List;

public class EventRepositoryImpl implements EventRepository{
    private int count;

    private List<Event> events = new ArrayList<>();

    @Override
    public Event save(Event event) {
        boolean isSaved = event.getId()!= 0;
        if (isSaved) update(event);else saveNewEvent(event);

        return event;
    }
    private void update(Event event){
        Event savedEvent = findById(event.getId());
        int indexOfSavedPackage = events.indexOf(savedEvent);
        events.set(indexOfSavedPackage, event);

    }

    private void saveNewEvent(Event event){
        event.setId(generateId());
        events.add(event);
        count++;

    }

    private int generateId() {
        return count+1;
    }

    @Override
    public void delete(Event event) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Event> findAll() {
        return null;
    }

    @Override
    public Event findById(int id) {
        for (Event event: events){
            if (event.getId() == id){
                return event;
            }
        }
        return null;
    }

    @Override
    public long count() {
        return count;
    }
}
