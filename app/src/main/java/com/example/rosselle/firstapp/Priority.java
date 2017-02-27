package com.example.rosselle.firstapp;

import java.util.Date;

/**
 * Created by apps on 2/25/17.
 */

public abstract class Priority {

    public String name;
   // public Date date;
    public String description;

    public Priority(String name,/* Date date, */String description){
        this.name = name;
        //this.date = date;
        this.description = description;
    }

    public String getName(){
        return name;
    }


}
