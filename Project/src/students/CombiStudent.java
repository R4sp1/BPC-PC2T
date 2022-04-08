package students;

import java.util.ArrayList;

public class CombiStudent extends AbstarctStudent{


    public CombiStudent(String name, String surname, String dateOfBirth, ArrayList<Integer> marksList) {
        super(name, surname, dateOfBirth, marksList);
    }


    public boolean isLeapYear(){
        SpecializationLogic st = new SpecializationLogic();
        st.DateOfBirth = getDateOfBirth();
        return st.isLeapYear();
    }


    public String getZodiacSign(){
        SpecializationLogic st = new SpecializationLogic();
        st.DateOfBirth = getDateOfBirth();
        return st.getZodiacSign();
    }

    @Override
    public String Specialization() {
        return "Student kombinovaneho oboru";
    }
}
