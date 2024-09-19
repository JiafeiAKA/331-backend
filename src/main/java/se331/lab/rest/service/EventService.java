package se331.lab.rest.service;

import se331.lab.rest.entity.Event;
import org.springframework.data.domain.Page;


public interface EventService {
    Integer getEventSize();
    Page<Event> getEvents(Integer pageSize, Integer page);
    Event getEvent(Long id);
}
