package students;

import java.util.ArrayList;

public class TechStudent extends AbstarctStudent {


    public TechStudent(String name, String surname, String dateOfBirth, ArrayList<Integer> marksList) {
        super(name, surname, dateOfBirth, marksList);
    }

    public boolean isLeapYear(){
        SpecializationLogic st = new SpecializationLogic();
        st.DateOfBirth = getDateOfBirth();
        return st.isLeapYear();
    }

    @Override
    public String Specialization() {
        return "Student technického oboru";
    }
}