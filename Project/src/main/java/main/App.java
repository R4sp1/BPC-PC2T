package main;

import com.mongodb.client.FindIterable;
import database.*;
import org.bson.Document;
import students.*;

import javax.print.Doc;
import java.util.*;

public class App {

    public static int justInt(Scanner sc) {
        int num = 0;
        try {
            num = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Nastala vyjimka typu " + e.toString());
            System.out.println("Zadejte prosim cele cislo ");
            sc.nextLine();
            num = justInt(sc);
        }
        return num;
    }

    public static Students s = new Students();
    public static List<TechStudent> ts = new ArrayList<>();
    public static List<HumaStudent> hs = new ArrayList<>();
    public static List<CombiStudent> cs = new ArrayList<>();


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int idx = 0;
        String name;
        String surname;
        String date;
        StudentType st;
        int volba;
        boolean run = true;
        boolean caseRun;
        while (run) {
            System.out.println("\nVyberte pozadovanou cinnost:");
            System.out.println("1 .. vlozeni noveho studenta");
            System.out.println("2 .. nastaveni znamek studentu");
            System.out.println("3 .. vypis studentu");
            System.out.println("4 .. mazani studentu");
            System.out.println("5 .. Vypis informaci o konketnim studentovi");
            System.out.println("6 .. spusteni dovednosti konkretniho studenta");
            System.out.println("7 .. Vypis obecneho studujniho prumeru v oborech");
            System.out.println("8 .. Vypis celkoveho poctu studentu v oborech");
            System.out.println("9 .. Ulozeni listu studentu do souboru");
            System.out.println("10 .. nacist soubor");
            System.out.println("11 .. nacist MongoDB");
            System.out.println("12 .. ulozit do MongoDB");
            System.out.println("13 .. ukonceni aplikace");
            System.out.println();
            volba = sc.nextInt();
            switch (volba) {
                case 1:
                    caseRun = true;
                    while (caseRun){
                        System.out.println("Jakeho studenta chcete pridat? 1 = Technickeho oboru, 2 = Humanitniho oboru, 3 = Kombinovaneho oboru");
                        volba = justInt(sc);
                        System.out.println("Zadejte JMENO PRIJMENI DATUM studenta! (DATUM urcuje datum narozeni ve formatu: dd.mm.rrrr)");
                        name = sc.next();
                        surname = sc.next();
                        date = sc.next();
                        idx += 1;
                        switch (volba){
                            case 1:
                                st = StudentType.TECH;
                                TechStudent tStudent = new TechStudent(name, surname, date, idx, st);
                                ts.add(tStudent);
                                break;
                            case 2:
                                st = StudentType.HUMA;
                                HumaStudent hStudent = new HumaStudent(name, surname, date, idx, st);
                                hs.add(hStudent);
                                break;
                            case 3:
                                st = StudentType.COMBI;
                                CombiStudent cStudent = new CombiStudent(name, surname, date, idx, st);
                                cs.add(cStudent);
                                break;
                        }
                        System.out.println("Student pridan! Chcete pridat dalsiho studenta? 1 = ano, 0 = ne");
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

                    s.setListOfTechStudent(ts);
                    s.setListOfHumaStudents(hs);
                    s.setListOfCombiStudents(cs);
                    break;

                case 2:
                    int ID;
                    ArrayList<Integer> m1 = new ArrayList<>();
                    caseRun = true;
                    System.out.println("Zadejte ID studenta kteremu chcete udelit znamku. ");
                    ID = justInt(sc);
                    int mark;
                    while (caseRun) {
                        System.out.println("Zadejte znamku: ");
                        mark = justInt(sc);
                        m1.add(mark);
                        System.out.println("Znamka zadana! Chcete zadat dalsi znamku? 1 = ano, 0 = ne");
                        volba = justInt(sc);
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
                            A = ts.get(ID);
                            TechStudent upStudent = new TechStudent(A.getName(),A.getSurname(), A.getDateOfBirth(), A.getIdx(), A.getStudentType(), A.getStudyAverage(), m1);
                            ts.set(ID, upStudent);
                            break;
                        }
                    }

                    for (int i = 0; i < hs.size(); i++) {
                        HumaStudent B = hs.get(i);
                        if(ID == B.getIdx()){
                            ID = i;
                            B = hs.get(ID);
                            HumaStudent upStudent = new HumaStudent(B.getName(),B.getSurname(), B.getDateOfBirth(), B.getIdx(), B.getStudentType(), B.getStudyAverage(), m1);
                            hs.set(ID, upStudent);
                            break;
                        }
                    }

                    for (int i = 0; i < cs.size(); i++) {
                        CombiStudent C = cs.get(i);
                        if(ID == C.getIdx()){
                            ID = i;
                            C = cs.get(ID);
                            CombiStudent upStudent = new CombiStudent(C.getName(),C.getSurname(), C.getDateOfBirth(), C.getIdx(), C.getStudentType(), C.getStudyAverage(), m1);
                            cs.set(ID, upStudent);
                            break;
                        }
                    }

                    break;

                case 3:
                    Collections.sort(ts);
                    Collections.sort(hs);
                    Collections.sort(cs);
                    s.printAll();
                    break;

                case 4:
                    System.out.println("Zadejte ID studenta ktereho chcete vymazat: ");
                    ID = justInt(sc);
                    for (int i = 0; i < ts.size(); i++) {
                        TechStudent A = ts.get(i);
                        if(ID == A.getIdx()){
                            ts.remove(i);
                            break;
                        }
                    }

                    for (int i = 0; i < hs.size(); i++) {
                        HumaStudent B = hs.get(i);
                        if(ID == B.getIdx()){
                            hs.remove(i);
                            break;
                        }
                    }

                    for (int i = 0; i < cs.size(); i++) {
                        CombiStudent C = cs.get(i);
                        if(ID == C.getIdx()){
                            cs.remove(i);
                            break;
                        }
                    }

                    System.out.println("Student smazan!");
                    break;

                case 5:
                    System.out.println("Zadejte ID studenta");
                    ID = justInt(sc);
                    for (int i = 0; i < ts.size(); i++) {
                        TechStudent A = ts.get(i);
                        if(ID == A.getIdx()){
                            System.out.println(ts.get(i));
                            break;
                        }
                    }

                    for (int i = 0; i < hs.size(); i++) {
                        HumaStudent B = hs.get(i);
                        if(ID == B.getIdx()){
                            System.out.println(hs.get(i));
                            break;
                        }
                    }

                    for (int i = 0; i < cs.size(); i++) {
                        CombiStudent C = cs.get(i);
                        if(ID == C.getIdx()){
                            System.out.println(cs.get(i));
                            break;
                        }
                    }
                    break;

                case 6:
                    System.out.println("Zadejte ID studenta");
                    ID = justInt(sc);
                    for (int i = 0; i < ts.size(); i++) {
                        TechStudent A = ts.get(i);
                        if(ID == A.getIdx()){
                            System.out.println("Je rok ve kterem se student narodil prestupny? " + A.isLeapYear());
                            break;
                        }
                    }

                    for (int i = 0; i < hs.size(); i++) {
                        HumaStudent B = hs.get(i);
                        if(ID == B.getIdx()){
                            System.out.println("V jakem znameni zverokruhu se student narodil: " + B.getZodiacSign());
                            break;
                        }
                    }

                    for (int i = 0; i < cs.size(); i++) {
                        CombiStudent C = cs.get(i);
                        if(ID == C.getIdx()){
                            System.out.println("Je rok ve kterem se studennt narodil prestuny? " + C.isLeapYear());
                            System.out.println("V jakem znameni zverokruhu se student narodil: " + C.getZodiacSign());
                            break;
                        }
                    }
                    break;

                case 7:
                    double techPrumer = 0;
                    int techPocet = 0;
                    double humaPrumer = 0;
                    int humaPocet = 0;
                    double combiPrumer = 0;
                    int combiPocet = 0;

                    for (int i = 0; i < ts.size(); i++) {
                        TechStudent A = ts.get(i);
                        techPrumer += A.getStudyAverage();
                        techPocet++;
                    }

                    for (int i = 0; i < hs.size(); i++) {
                        HumaStudent B = hs.get(i);
                        humaPrumer += B.getStudyAverage();
                        humaPocet++;
                    }

                    for (int i = 0; i < cs.size(); i++) {
                        CombiStudent C = cs.get(i);
                        combiPrumer += C.getStudyAverage();
                        combiPocet++;
                    }

                    System.out.println("Obecny studijni prumer v techicekem oboru je: " + techPrumer/techPocet);
                    System.out.println("Obecny studijni prumer v humanitnim oboru je: " + humaPrumer/humaPocet);
                    System.out.println("Obecny studijni prumer v kobinovanem oboru je: " + combiPrumer/combiPocet);
                    break;

                case 8:
                    techPocet = 0;
                    humaPocet = 0;
                    combiPocet = 0;

                    for (int i = 0; i < ts.size(); i++) {
                        TechStudent A = ts.get(i);
                        techPocet++;
                    }

                    for (int i = 0; i < hs.size(); i++) {
                        HumaStudent B = hs.get(i);
                        humaPocet++;
                    }

                    for (int i = 0; i < cs.size(); i++) {
                        CombiStudent C = cs.get(i);
                        combiPocet++;
                    }

                    System.out.println("Studentu v techicekem oboru je: " + techPocet);
                    System.out.println("Studentu v humanitnim oboru je: " + humaPocet);
                    System.out.println("Studentu v kobinovanem oboru je: " + combiPocet);
                    break;
                case 9:
                    FileDatabase fds = new FileDatabase(ts, hs, cs);
                    fds.SaveToFile("ProsimFunguj.txt");
                    break;

                case 10:
                    FileDatabase fdl = new FileDatabase();
                    fdl.LoadFromFile("ProsimFunguj.txt");
                    break;

                case 11:
                    ReadFromMongo.FetchDataFromMongo(ts, hs, cs);
                    //System.out.println(ReadFromMongo.getName(0));
                break;

                case 12:
                    run = false;
                    break;

                case 13:
                    run = false;
                    break;
            }
        }

    }

}
