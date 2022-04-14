package database;

import students.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileDatabase {

    Students s = new Students();
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
            int numOfEntries = ts.size() + hs.size() + cs.size();
            out.write(new String("Pocet;" + numOfEntries));
            out.newLine();
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

    public boolean LoadFromFile(String fileName) {
        FileReader fr = null;
        BufferedReader in = null;

        try {
            fr = new FileReader(fileName);
            in = new BufferedReader(fr);
            String line = in.readLine();
            String separator = "[;]+";
            String[] data = line.split(separator);
            int numOfEntries = Integer.parseInt(data[0]);
            for (int i = 0; i < numOfEntries; i++) {
                line = in.readLine();
                data = line.split(separator);
                if(data[5] == "TECH"){
                    TechStudent tStudent = new TechStudent(name, surname, date, idx, st);
                    ts.add(tStudent);
                }
                    prvkyDatabaze[i] = new Student(castiTextu[0], Integer.parseInt(castiTextu[1]));
                    prvkyDatabaze[i].setStudijniPrumer(Float.parseFloat(castiTextu[2]));

            }
        } catch (IOException e) {
            System.out.println("Soubor  nelze otevrit\n");
            return false;
        } catch (NumberFormatException e) {
            System.out.println("Chyba integrity dat v souboru\n");
            return false;
        } catch (prumerException e) {
            System.out.println("Nespravna data v souboru\n");
            return false;
        } finally {
            try {
                if (in != null) {
                    in.close();
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println("Soubor  nelze zavrit\n");
                return false;
            }
        }
        return true;
    }
}
