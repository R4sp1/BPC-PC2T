package students;

import java.util.ArrayList;

public class HumaStudent extends AbstarctStudent {

    public HumaStudent(String name, String surname, String dateOfBirth, int idx, StudentType studentType, double studyAverage) {
        super(name, surname, dateOfBirth, idx, studentType, studyAverage);
    }

    public HumaStudent(String name, String surname, String dateOfBirth, int idx, StudentType studentType, double studyAverge,ArrayList<Integer> marksList) {
        super(name, surname, dateOfBirth, idx, studentType, studyAverge, marksList);
    }

    public HumaStudent(String name, String surname, String dateOfBirth, int idx, StudentType studentType) {
        super(name, surname, dateOfBirth, idx, studentType);
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
                "Index='" + getIdx() + '\'' +
                ", name='" + getName() + '\'' +
                ", Surname='" + getSurname() + '\'' +
                ", DateOfBirth='" + getDateOfBirth() + '\'' +
                ", StudyAverage=" + getStudyAverage() +
                ", Obor=" + Specialization() +
                ", Dovednost=" + getZodiacSign() +
                '}';
    }
}
