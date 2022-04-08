package students;

import java.util.ArrayList;

public class CombiStudent extends AbstarctStudent{


    public CombiStudent(String name, String surname, String dateOfBirth, ArrayList<Integer> marksList) {
        super(name, surname, dateOfBirth, marksList);
    }


    public boolean isLeapYear(){
        SpecializationLogic st = new SpecializationLogic();
        st.dateOfBirth = getDateOfBirth();
        return st.isLeapYear();
    }


    public String getZodiacSign(){
        SpecializationLogic st = new SpecializationLogic();
        st.dateOfBirth = getDateOfBirth();
        return st.getZodiacSign();
    }

    @Override
    public String Specialization() {
        return StudentType.COMBI.getInternalName();
    }
    @Override
    public String SpecializationInfo() {
        return StudentType.COMBI.getDescription();
    }
    @Override
    public String toString() {
        return "TechStudent{" +
                "Name='" + getName() + '\'' +
                ", Surname='" + getSurname() + '\'' +
                ", DateOfBirth='" + getDateOfBirth() + '\'' +
                ", StudyAverage=" + getStudyAverage() +
                ", Obor=" + Specialization() +
                ", Dovednost1=" + isLeapYear() +
                ", Dovednost2=" + getZodiacSign() +
                '}';
    }

}
