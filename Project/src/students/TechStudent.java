package students;

import javax.sql.rowset.spi.TransactionalWriter;
import java.util.ArrayList;
import java.util.Objects;

import static students.StudentType.TECH;

public class TechStudent extends AbstarctStudent{


    public TechStudent(String name, String surname, String dateOfBirth, ArrayList<Integer> marksList) {
        super(name, surname, dateOfBirth, marksList);
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
                "Name='" + getName() + '\'' +
                ", Surname='" + getSurname() + '\'' +
                ", DateOfBirth='" + getDateOfBirth() + '\'' +
                ", StudyAverage=" + getStudyAverage() +
                ", Obor=" + Specialization() +
                ", Dovednost=" + isLeapYear() +
                '}';
    }



}
