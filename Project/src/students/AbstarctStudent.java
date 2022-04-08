package students;

import java.util.ArrayList;
import java.util.Objects;

public abstract class AbstarctStudent implements Comparable<AbstarctStudent>{

    private String Name;
    protected String Surname;
    private String DateOfBirth;
    private double StudyAverage;
    private ArrayList<Integer> marksList = new ArrayList<Integer>();

    public StudentType studentType;


    public abstract String Specialization();
    public abstract String SpecializationInfo();

    public AbstarctStudent(){}

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

    public StudentType getStudentType() {
        return studentType;
    }

    public void setStudentType(StudentType studentType) {
        this.studentType = studentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstarctStudent that = (AbstarctStudent) o;
        return Surname.equals(that.Surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Surname);
    }

    @Override
    public int compareTo(AbstarctStudent o) {
        return this.Surname.compareTo(o.getSurname());
    }
}
