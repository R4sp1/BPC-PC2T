package students;

import java.util.ArrayList;

public class HumaStudent extends AbstarctStudent {


    public HumaStudent(String name, String surname, String dateOfBirth) {
        super(name, surname, dateOfBirth);
    }



    public String getZodiacSign(){
        SpecializationLogic st = new SpecializationLogic();
        st.dateOfBirth = getDateOfBirth();
        return st.getZodiacSign();
    }

    @Override
    public String Specialization() {
        return StudentType.HUMA.getInternalName();
    }
    @Override
    public String SpecializationInfo() {
        return StudentType.HUMA.getDescription();
    }

    @Override
    public String toString() {
        return "TechStudent{" +
                "Name='" + getName() + '\'' +
                ", Surname='" + getSurname() + '\'' +
                ", DateOfBirth='" + getDateOfBirth() + '\'' +
                ", StudyAverage=" + getStudyAverage() +
                ", Obor=" + Specialization() +
                ", Dovednost=" + getZodiacSign() +
                '}';
    }
}
