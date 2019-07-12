package com.siit.objectContainers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Persoana/* implements Comparable<Persoana>*/ extends Hobby{
    private String name;
    private int age;



    public Persoana ( String name , int age ) {
        this.name = name;
        this.age = age;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoana person = (Persoana) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(age, person.age);    }


    @Override
    public void setHobbies ( List<String> hobbies ) {
        super.setHobbies ( hobbies );
    }

    @Override
    public void addHobby ( String hobby ) {
        super.addHobby ( hobby );
    }



    @Override
    public String toString () {
        return "Persoana{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



   /* @Override
    public int compareTo ( Persoana o ) {
        return name.compareTo ( o.getName () );
    } */


}
