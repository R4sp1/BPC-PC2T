package main;


import students.*;

import java.util.*;

public class App {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Students s = new TechStudent();
        int idx;
        float prumer;
        int volba;
        boolean run = true;
        while (run) {
            System.out.println("Vyberte pozadovanou cinnost:");
            System.out.println("1 .. vlozeni noveho studenta");
            System.out.println("2 .. nastaveni prumeru studenta");
            System.out.println("3 .. ukonceni aplikace");
            switch (volba) {
                case 1:
                    mojeDatabaze.setStudent();
                    break;
                case 2:
                    System.out.println("Zadejte index a prumer studenta");
                    idx = pouzeCelaCisla(sc);
                    prumer = pouzeCisla(sc);
                    mojeDatabaze.setPrumer(idx, prumer);
                    break;

                case 3:
                    run = false;
                    break;
            }



        /*
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
         */
    }

    public static List<TechStudent> createTech() {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(1);
        marks.add(2);
        marks.add(3);
        marks.add(4);

        TechStudent e1 = new TechStudent("Tech", "B", "01.01.1988");
        TechStudent e2 = new TechStudent("Tech", "C", "01.01.2001");
        TechStudent e3 = new TechStudent("Tech", "A", "01.01.1988");
        return Arrays.asList(e1, e2, e3);
    }

    public static List<HumaStudent> createHuma() {

        HumaStudent h1 = new HumaStudent("Huma", "C", "01.01.1988");
        HumaStudent h2 = new HumaStudent("Huma", "B", "01.01.2001");
        HumaStudent h3 = new HumaStudent("Huma", "A", "01.01.1988");
        return Arrays.asList(h1, h2, h3);
    }

    public static List<CombiStudent> createCombi() {


        CombiStudent e1 = new CombiStudent("Combi", "C", "01.01.1988");
        CombiStudent e2 = new CombiStudent("Combi", "B", "01.01.2001");
        CombiStudent e3 = new CombiStudent("Combi", "A", "01.01.1988");
        return Arrays.asList(e1, e2, e3);
    }
}
