package students;

import java.util.ArrayList;

public class HumaStudent extends AbstarctStudent {


    public HumaStudent(String name, String surname, String dateOfBirth, ArrayList<Integer> marksList) {
        super(name, surname, dateOfBirth, marksList);
    }

    public String getZodiacSign(){
        SpecializationLogic st = new SpecializationLogic();
        st.DateOfBirth = getDateOfBirth();
        return st.getZodiacSign();
    }

    @Override
    public String Specialization() {
        return "Student humanitniho oboru";
    }
}
