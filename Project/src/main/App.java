package main;


import students.*;

import java.util.*;

public class App {


    public static void main(String[] args) {

        Students s = new Students();
        TechStudent tss = new TechStudent();
        List<TechStudent> ts = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int idx = 0;
        String name;
        String surname;
        String date;
        StudentType st;
        int volba;
        boolean run = true;
        while (run) {
            System.out.println("Vyberte pozadovanou cinnost:");
            System.out.println("1 .. vlozeni noveho studenta technickeho oboru");
            System.out.println("2 .. Nastaveni znamek studentu");
            System.out.println("3 .. vypis studentu");
            System.out.println("4 .. ukonceni aplikace");
            volba = sc.nextInt();
            switch (volba) {
                case 1:
                    System.out.println("Zadejte JMENO PRIJMENI DATUM studenta! (DATUM urcuje datum narozeni ve formatu: dd.mm.rrrr)");
                    name = sc.next();
                    surname = sc.next();
                    date = sc.next();
                    idx += 1;
                    st = StudentType.TECH;
                    TechStudent k = new TechStudent(name, surname, date, idx, st);
                    ts.add(idx-1, k);
                    s.setListOfTechStudent(ts);
                    break;
                case 2:
                    System.out.println("Zadejte ID studenta kteremu chcete udelit znamku. ");
                    int ID;
                    int IDs;
                    ArrayList<Integer> m1 = new ArrayList<>();
                    ID = sc.nextInt();
                    int mark;
                    boolean caseRun = true;
                    while (caseRun) {
                        System.out.println("Zadejte znamku: ");
                        mark = sc.nextInt();
                        m1.add(mark);
                        System.out.println("Znamka zadana! Chcete zadat dalsi znamku? 1 = ano, 0 = ne");
                        volba = sc.nextInt();
                        switch (volba) {
                            case 1:
                                caseRun = true;
                                break;
                            case 0:
                                caseRun = false;
                                break;
                        }
                    }

                    for (int i = 0; i < ts.size(); i++) {
                        TechStudent A = ts.get(i);
                        if(ID == A.getIdx()){
                            ID = i;
                            break;
                        }
                    }
                    TechStudent A = ts.get(ID);
                    TechStudent upStudent = new TechStudent(A.getName(),A.getSurname(), A.getDateOfBirth(), A.getIdx(), A.getStudentType(), m1);
                    ts.set(ID, upStudent);
                    break;

                case 3:
                    Collections.sort(ts);
                    s.printAll();
                    break;

                case 4:
                    run = false;
                    break;
            }
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

    /*
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

     */
}
