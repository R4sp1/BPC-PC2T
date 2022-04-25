package database;

import main.App;
import students.*;

import java.io.*;
import java.util.List;
import java.util.Objects;

public class FileDatabase {

    public FileDatabase(){}

    public FileDatabase(List<TechStudent> techStudents, List<HumaStudent> humaStudents, List<CombiStudent> combiStudents){
        App.ts = techStudents;
        App.hs = humaStudents;
        App.cs = combiStudents;

    }

    public boolean SaveToFile(String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter out = new BufferedWriter(fw);
            int numOfEntries = App.ts.size() + App.hs.size() + App.cs.size();
            out.write(new String("numOfEntries;" + numOfEntries));
            out.newLine();
            for (int i = 0; i < App.ts.size(); i++) {
                TechStudent A = App.ts.get(i);
                out.write(A.getIdx() + ";" + A.getName() + ";" + A.getSurname() + ";" + A.getDateOfBirth() + ";" + A.getStudyAverage() + ";" + A.getStudentType());
                out.newLine();
            }
            for (int i = 0; i < App.hs.size(); i++) {
                HumaStudent B = App.hs.get(i);
                out.write(B.getIdx() + ";" + B.getName() + ";" + B.getSurname() + ";" + B.getDateOfBirth() + ";" + B.getStudyAverage() + ";" + B.getStudentType());
                out.newLine();
            }
            for (int i = 0; i < App.cs.size(); i++) {
                CombiStudent C = App.cs.get(i);
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
            int numOfEntries = Integer.parseInt(data[1]);
            for (int i = 0; i < numOfEntries; i++) {
                line = in.readLine();
                data = line.split(separator);
                int idx = Integer.parseInt(data[0]);
                String name = data[1];
                String surname = data[2];
                String date = data[3];
                double studyAverage = Double.parseDouble(data[4]);
                if(Objects.equals(data[5], "TECH")){
                    StudentType studentType = StudentType.TECH;
                    TechStudent tStudent = new TechStudent(name, surname, date, idx, studentType, studyAverage);
                    App.ts.add(tStudent);
                }else if(Objects.equals(data[5], "HUMA")){
                    StudentType studentType = StudentType.HUMA;
                    HumaStudent hStudent = new HumaStudent(name, surname, date, idx, studentType, studyAverage);
                    App.hs.add(hStudent);
                }else if(Objects.equals(data[5], "COMBI")){
                    StudentType studentType = StudentType.COMBI;
                    CombiStudent cStudent = new CombiStudent(name, surname, date, idx, studentType, studyAverage);
                    App.cs.add(cStudent);
                }

            App.s.setListOfTechStudent(App.ts);
            App.s.setListOfHumaStudents(App.hs);
            App.s.setListOfCombiStudents(App.cs);

            }
        } catch (IOException e) {
            System.out.println("Soubor  nelze otevrit\n");
            return false;
        } catch (NumberFormatException e) {
            System.out.println("Chyba integrity dat v souboru\n");
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
