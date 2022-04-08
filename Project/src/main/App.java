package main;


import students.*;

import java.util.ArrayList;
import java.util.Collections;

public class App {


    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(1);
        marks.add(2);
        marks.add(3);
        marks.add(4);


        AbstarctStudent[] field = new AbstarctStudent[3];
        field[0] = new TechStudent("Tech", "Student", "01.01.1988", marks);
        field[1] = new HumaStudent("Huma", "Student", "30.01.2001", marks);
        field[2] = new CombiStudent("Kombi", "Student", "30.01.1988", marks);


        for(int i = 0; i < field.length; i++){

            if(field[i] instanceof TechStudent){

                System.out.println(field[i].getName() + " " + field[i].getSurname() + " Je rok narozeni prestupny? " + ((TechStudent) field[i]).isLeapYear());

            }else if(field[i] instanceof HumaStudent){
                System.out.println(field[i].getName() + " " + field[i].getSurname() + " Znameni: " + ((HumaStudent) field[i]).getZodiacSign());
            }else{
                System.out.println(field[i].getName() + " " + field[i].getSurname() + " Znameni: " + ((CombiStudent) field[i]).getZodiacSign() + " Je rok narozeni prestupny? " + ((CombiStudent) field[i]).isLeapYear());
            }
        }
    }
}
