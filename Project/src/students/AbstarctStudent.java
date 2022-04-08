package students;

import java.util.ArrayList;

public abstract class AbstarctStudent {

    private String Name;
    private String Surname;
    private String DateOfBirth;
    private double StudyAverage;
    private ArrayList<Integer> marksList = new ArrayList<Integer>();


    public abstract String Specialization();

    public AbstarctStudent(String name, String surname, String dateOfBirth, ArrayList<Integer> marksList) {
        Name = name;
        Surname = surname;
        DateOfBirth = dateOfBirth;
        this.marksList = marksList;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public void setMarksList(ArrayList<Integer> marksList) {
        this.marksList = marksList;
    }

    public double getStudyAverage() {
        double ConStudyAverage = 0;
        for (int i = 0; i < marksList.size(); i++) {
            ConStudyAverage += marksList.get(i);
        }
        StudyAverage = ConStudyAverage/marksList.size();
        return StudyAverage;
    }
}
