package org.example.Week4_people;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void printDepartment(List<Person> people) {
        for(Person person:people){
            System.out.println(person);
        }
    }
    public static void main(String[] args) {
        /*Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
        System.out.println(pekka);
        System.out.println(esko);

        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.credits());
        olli.study();
        System.out.println("credits " + olli.credits());*/

        /*Teacher pekka = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
        System.out.println( pekka );
        System.out.println( esko );


        Student olli = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
        for ( int i=0; i < 25; i++ ) {
            olli.study();
        }
        System.out.println( olli );*/

        /*List<Person> people = new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );
        printDepartment(people);

        Person p1 = new Person("Adi Beća", "123 Main St, Springfield", 56, "United States");
        System.out.println(p1);
        p1.setAge(19);
        p1.setCountry("Bosnia");
        System.out.println(p1);
        */

        Student s1 = new Student("Adi", "456 Oak St, Maple Town", 20, "Bosnia",0,1);
        System.out.println(s1);
        s1.addGrade(5);
        s1.addGrade(7);
        s1.addGrade(9);
        s1.addGrade(54);
        System.out.println(s1);
    }
}