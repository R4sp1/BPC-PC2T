package students.operations;

import database.DeleteFromMongo;
import main.App;
import students.CombiStudent;
import students.HumaStudent;
import students.TechStudent;

import java.util.List;

public class DeleteStudent {
    public static void deleteStudent(int ID, List<TechStudent> techStudents, List<HumaStudent> humaStudents, List<CombiStudent> combiStudents) {
        App.ts = techStudents;
        App.hs = humaStudents;
        App.cs = combiStudents;
        int tsID = 0;
        int hsID = 0;
        int csID = 0;
        int check = 0;


        for (int i = 0; i < App.ts.size(); i++) {
            TechStudent A = App.ts.get(i);
            if (ID == A.getIdx()) {
                tsID = i;
                check = 1;
                break;
            }
        }
        for (int i = 0; i < App.hs.size(); i++) {
            HumaStudent B = App.hs.get(i);
            if (ID == B.getIdx()) {
                hsID = i;
                check = 2;
                break;
            }
        }
        for (int i = 0; i < App.cs.size(); i++) {
            CombiStudent C = App.cs.get(i);
            if (ID == C.getIdx()) {
                csID = i;
                check = 3;
                break;
            }
        }
        if (check == 1) {
            App.ts.remove(tsID);
            DeleteFromMongo.deleteFromMongo(ID);
            System.out.println("Student smazan");
        } else if (check == 2) {
            App.hs.remove(hsID);
            DeleteFromMongo.deleteFromMongo(ID);
            System.out.println("Student smazan");
        } else if (check == 3) {
            App.cs.remove(csID);
            DeleteFromMongo.deleteFromMongo(ID);
            System.out.println("Student smazan");
        } else {
            System.out.println("Student s id: " + ID + " neexistuje!\n");
        }

    }
}
