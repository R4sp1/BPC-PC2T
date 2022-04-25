package students;

import java.util.ArrayList;
import java.util.Objects;

public abstract class AbstarctStudent implements Comparable<AbstarctStudent>{

    private String Name;
    protected String Surname;
    private String DateOfBirth;
    private double studyAverage;
    protected ArrayList<Integer> marksList = new ArrayList<>();
    protected int idx;
    public StudentType studentType;

    public abstract String Specialization();
    public abstract String SpecializationInfo();
    public AbstarctStudent(){}

    public AbstarctStudent(String name, String surname, String dateOfBirth, int idx, StudentType studentType) {
        Name = name;
        Surname = surname;
        DateOfBirth = dateOfBirth;
        this.idx = idx;
        this.studentType = studentType;
    }

    public AbstarctStudent(String name, String surname, String dateOfBirth, int idx, StudentType studentType, double studyAverage,ArrayList<Integer> marksList) {
        Name = name;
        Surname = surname;
        DateOfBirth = dateOfBirth;
        this.idx = idx;
        this.studentType = studentType;
        this.studyAverage = studyAverage;
        this.marksList = marksList;
    }

    public AbstarctStudent(String name, String surname, String dateOfBirth, int idx, StudentType studentType, double studyAverage) {
        Name = name;
        Surname = surname;
        DateOfBirth = dateOfBirth;
        this.idx = idx;
        this.studentType = studentType;
        this.studyAverage = studyAverage;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public double getStudyAverage() {
        double conStudyAverage = 0;
        if (marksList.size() != 0) {
            for (Integer integer : marksList) {
                conStudyAverage += integer;
            }
            conStudyAverage = conStudyAverage / marksList.size();
            studyAverage = (studyAverage + conStudyAverage) / 2;
        }
        return studyAverage;
    }

    public StudentType getStudentType() {
        return studentType;
    }

    public int getIdx() {
        return idx;
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
