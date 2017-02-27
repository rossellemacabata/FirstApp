package com.example.rosselle.firstapp;

import java.sql.Time;
import java.util.Date;

/**
 * Created by apps on 2/26/17.
 */

public class Event extends Priority {
    Time startTime;
    Time endTime;


    public Event(String name, /*Date date,*/ String description /*Time startTime, Time endTime*/){
        super( name,/* date,*/ description);
       // this.startTime = startTime;
       // this.endTime = endTime;
    }


}
