package main;


import students.AbstarctStudent;
import students.TechStudent;

import java.util.ArrayList;

public class App {


    public static void main(String[] args) {

        ArrayList<Integer> cars = new ArrayList<Integer>();
        cars.add(1);
        cars.add(2);
        cars.add(3);
        cars.add(4);


        AbstarctStudent[] field = new AbstarctStudent[1];
        field[0] = new TechStudent("Jan", "Hruska", 1988, cars);


        for(int i = 0; i < field.length; i++){

            if(field[i] instanceof TechStudent){

                System.out.println("Jmeno: " + field[i].getName() + " Prijmeni: " + field[i].getSurname() + " Prumer: " + field[i].getStudyAverage() + " " + ((TechStudent) field[i]).isLeapYear());

            }else{
                System.out.println(field[i].getName() + " cena: " + field[i].getName());
            }
        }
    }
}
