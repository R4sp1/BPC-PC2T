package database;

import students.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDatabase {

    List<TechStudent> ts = new ArrayList<>();
    List<HumaStudent> hs = new ArrayList<>();
    List<CombiStudent> cs = new ArrayList<>();

    public FileDatabase(List<TechStudent> techStudents, List<HumaStudent> humaStudents, List<CombiStudent> combiStudents){
        ts = techStudents;
        hs = humaStudents;
        cs = combiStudents;
    }

    public boolean SaveToFile(String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter out = new BufferedWriter(fw);
            for (int i = 0; i < ts.size(); i++) {
                TechStudent A = ts.get(i);
                out.write(A.getIdx() + ";" + A.getName() + ";" + A.getSurname() + ";" + A.getDateOfBirth() + ";" + A.getStudyAverage() + ";" + A.getStudentType());
                out.newLine();
            }
            for (int i = 0; i < hs.size(); i++) {
                HumaStudent B = hs.get(i);
                out.write(B.getIdx() + ";" + B.getName() + ";" + B.getSurname() + ";" + B.getDateOfBirth() + ";" + B.getStudyAverage() + ";" + B.getStudentType());
                out.newLine();
            }
            for (int i = 0; i < cs.size(); i++) {
                CombiStudent C = cs.get(i);
                out.write(C.getIdx() + ";" + C.getName() + ";" + C.getSurname() + ";" + C.getDateOfBirth() + ";" + C.getStudyAverage() + ";" + C.getStudentType());
                out.newLine();
            }
            out.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Soubor nelze vytvorit\n");
            return false;
        }
        return true;
    }
}
