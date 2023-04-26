package data.repositories;

import data.model.Event;

import java.util.List;

public interface EventRepository {

    Event save(Event event);
    long count();
    void delete(Event event);
    void delete(int id);
    List<Event> findAll();
    Event findById(int id);

}
