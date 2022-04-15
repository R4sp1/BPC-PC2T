package students;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static students.StudentType.TECH;
import students.Students.*;


public class TechStudent extends AbstarctStudent{

    public TechStudent(){
    }

    public TechStudent(String name, String surname, String dateOfBirth, int idx, StudentType studentType, double studyAverage) {
        super(name, surname, dateOfBirth, idx, studentType, studyAverage);
    }

    public TechStudent(String name, String surname, String dateOfBirth, int idx, StudentType studentType, double studyAverge, ArrayList<Integer> marksList) {
        super(name, surname, dateOfBirth, idx, studentType, studyAverge ,marksList);
    }



    public TechStudent(String name, String surname, String dateOfBirth, int idx, StudentType studentType) {
        super(name, surname, dateOfBirth, idx, studentType);
    }

    public boolean isLeapYear(){
        SpecializationLogic st = new SpecializationLogic();
        st.dateOfBirth = getDateOfBirth();
        return st.isLeapYear();
    }



    @Override
    public String Specialization() {
        return TECH.getInternalName();
    }

    @Override
    public String SpecializationInfo() {
        return TECH.getDescription();
    }


    @Override
    public String toString() {
        return "TechStudent{" +
                "Index='" + getIdx() + '\'' +
                ", Name='" + getName() + '\'' +
                ", Surname='" + getSurname() + '\'' +
                ", DateOfBirth='" + getDateOfBirth() + '\'' +
                ", StudyAverage=" + getStudyAverage() +
                ", Obor=" + Specialization() +
                ", Dovednost=" + isLeapYear() +
                '}';
    }



}
