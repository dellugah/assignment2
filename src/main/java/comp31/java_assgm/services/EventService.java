package comp31.java_assgm.services;

import comp31.java_assgm.model.Event;
import comp31.java_assgm.model.EventList;
import comp31.java_assgm.model.EventTypes;
import org.springframework.stereotype.Service;

@Service
public class EventService {



    EventList eventList;
    EventTypes eventTypes;

    public EventList getEventList() {
        return eventList;
    }

    public EventTypes getEventTypes() {
        return eventTypes;
    }

    EventService(EventList eventList, EventTypes eventTypes) {
        this.eventList = eventList;
        this.eventTypes = eventTypes;
    }

    public void addEventList(Event event){
        eventList.add(event);
    }


}
