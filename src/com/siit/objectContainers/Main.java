package com.siit.objectContainers;

import java.util.*;

public class Main {
    public static void main ( String args[] ) {

        Persoana tina = new Student ( "Tina" , 35 );
        Persoana mara = new Angajat ( "Mara" , 24 );
        Persoana mari = new Angajat ( "Mari" , 25 );
        Persoana ioana = new Somer ( "Ioana" , 30 );

        Set<Persoana> persoanaSet = new TreeSet<> ( new NameComparator ( ).thenComparing ( new AgeComparator ( ) ) );

        persoanaSet.add ( tina );
        persoanaSet.add ( mari );
        persoanaSet.add ( ioana );
        persoanaSet.add ( mara );


        Iterator<Persoana> persoanaIterator = persoanaSet.iterator ( );
        while (persoanaIterator.hasNext ( )) {
            Persoana person = persoanaIterator.next ( );
            System.out.println ( person.getName ( ) + " " + person.getAge ( ) );
        }
        System.out.println ( );


        List<String> hobbies = new ArrayList<> ( );
        hobbies.add ( "running" );
        hobbies.add ( "singing" );
        hobbies.add ( "reading" );
        mara.setHobbies ( hobbies );

        Map<Persoana, List<String>> persoanaMap = new HashMap<> ( );
        persoanaMap.put ( mara , hobbies );
        persoanaMap.put ( ioana , hobbies );
        persoanaMap.put ( mari , hobbies );
        persoanaMap.put ( tina , hobbies );

        System.out.println ( "Hobbies" );
        for ( List<String> hobby : persoanaMap.values ( ) ) {
            System.out.println ( hobby );
        }


    }


}








