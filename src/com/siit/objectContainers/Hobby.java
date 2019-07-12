package com.siit.objectContainers;

import java.util.*;

public class Hobby  {
    private String hobyName;
    private int hobbyFrequency;

    private List<Adresa> hobbyAdress ;
    private List<String> hobbies = new ArrayList<> ();



    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }



}
