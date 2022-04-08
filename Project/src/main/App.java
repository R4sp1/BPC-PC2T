package main;


import students.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {


    public static void main(String[] args) {
        List<TechStudent> listOfTech = createTech();
        List<HumaStudent> listOfHuma = createHuma();
        List<CombiStudent> listOfCombi = createCombi();

        Collections.sort(listOfTech);
        Collections.sort(listOfHuma);
        Collections.sort(listOfCombi);

        Students s = new Students();
        s.setListOfTechStudent(listOfTech);
        s.setListOfHumaStudents(listOfHuma);
        s.setListOfCombiStudents(listOfCombi);
        s.printAll();
        /*
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(1);
        marks.add(2);
        marks.add(3);
        marks.add(4);


        AbstarctStudent[] field = new AbstarctStudent[3];
        field[0] = new TechStudent("Tech", "Student", "01.01.1988", marks, StudentType.TECH);
        field[1] = new HumaStudent("Huma", "Student", "30.01.2001", marks, StudentType.HUMA);
        field[2] = new CombiStudent("Kombi", "Student", "30.01.1988", marks, StudentType.COMBI);


        for(int i = 0; i < field.length; i++){

            if(field[i] instanceof TechStudent){

                System.out.println(field[i].getName() + " " + field[i].getSurname() + " Je rok narozeni prestupny? " + ((TechStudent) field[i]).isLeapYear() + " Typ: " + field[i].Specialization());

            }else if(field[i] instanceof HumaStudent){
                System.out.println(field[i].getName() + " " + field[i].getSurname() + " Znameni: " + ((HumaStudent) field[i]).getZodiacSign() + " Typ: " + field[i].SpecializationInfo());
            }else{
                System.out.println(field[i].getName() + " " + field[i].getSurname() + " Znameni: " + ((CombiStudent) field[i]).getZodiacSign() + " Je rok narozeni prestupny? " + ((CombiStudent) field[i]).isLeapYear());
            }
        }

         */
    }

    public static List<TechStudent> createTech() {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(1);
        marks.add(2);
        marks.add(3);
        marks.add(4);

        TechStudent e1 = new TechStudent("Tech", "B", "01.01.1988", marks);
        TechStudent e2 = new TechStudent("Tech", "C", "01.01.2001", marks);
        TechStudent e3 = new TechStudent("Tech", "A", "01.01.1988", marks);
        return Arrays.asList(e1, e2, e3);
    }

    public static List<HumaStudent> createHuma() {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(1);
        marks.add(2);
        marks.add(3);
        marks.add(4);

        HumaStudent h1 = new HumaStudent("Huma", "C", "01.01.1988", marks);
        HumaStudent h2 = new HumaStudent("Huma", "B", "01.01.2001", marks);
        HumaStudent h3 = new HumaStudent("Huma", "A", "01.01.1988", marks);
        return Arrays.asList(h1, h2, h3);
    }

    public static List<CombiStudent> createCombi() {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(1);
        marks.add(2);
        marks.add(3);
        marks.add(4);

        CombiStudent e1 = new CombiStudent("Combi", "C", "01.01.1988", marks);
        CombiStudent e2 = new CombiStudent("Combi", "B", "01.01.2001", marks);
        CombiStudent e3 = new CombiStudent("Combi", "A", "01.01.1988", marks);
        return Arrays.asList(e1, e2, e3);
    }
}
