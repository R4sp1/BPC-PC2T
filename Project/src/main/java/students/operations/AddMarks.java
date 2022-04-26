package students.operations;

import main.App;
import students.CombiStudent;
import students.HumaStudent;
import students.TechStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddMarks {
    public static void addMarks(int ID, List<TechStudent> techStudents, List<HumaStudent> humaStudents, List<CombiStudent> combiStudents) {
        App.ts = techStudents;
        App.hs = humaStudents;
        App.cs = combiStudents;

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> m1 = new ArrayList<>();
        boolean caseRun = true;
        boolean test = true;
        int mark;
        while (caseRun) {
            System.out.println("Zadejte znamku: ");
            while (test) {
                mark = App.justInt(sc);
                if (mark < 5 || mark > 1) {
                    m1.add(mark);
                    test = false;
                } else {
                    System.out.println("Zadejte znaku od 1 do 5! ");
                    test = true;
                }
            }
            System.out.println("Znamka zadana! Chcete zadat dalsi znamku? 1 = ano, 0 = ne");
            int volba = App.justInt(sc);
            switch (volba) {
                case 1:
                    caseRun = true;
                    test = true;
                    break;
                case 0:
                    caseRun = false;
                    break;
            }
        }

        for (int i = 0; i < App.ts.size(); i++) {
            TechStudent A = App.ts.get(i);
            if (ID == A.getIdx()) {
                ID = i;
                A = App.ts.get(ID);
                TechStudent upStudent = new TechStudent(A.getName(), A.getSurname(), A.getDateOfBirth(), A.getIdx(), A.getStudentType(), A.getStudyAverage(), m1);
                App.ts.set(ID, upStudent);
                break;
            }
        }
        for (int i = 0; i < App.hs.size(); i++) {
            HumaStudent B = App.hs.get(i);
            if (ID == B.getIdx()) {
                ID = i;
                B = App.hs.get(ID);
                HumaStudent upStudent = new HumaStudent(B.getName(), B.getSurname(), B.getDateOfBirth(), B.getIdx(), B.getStudentType(), B.getStudyAverage(), m1);
                App.hs.set(ID, upStudent);
                break;
            }
        }
        for (int i = 0; i < App.cs.size(); i++) {
            CombiStudent C = App.cs.get(i);
            if (ID == C.getIdx()) {
                ID = i;
                C = App.cs.get(ID);
                CombiStudent upStudent = new CombiStudent(C.getName(), C.getSurname(), C.getDateOfBirth(), C.getIdx(), C.getStudentType(), C.getStudyAverage(), m1);
                App.cs.set(ID, upStudent);
                break;
            }
        }
    }
}
