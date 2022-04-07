package students;

import java.util.ArrayList;

public class TechStudent extends AbstarctStudent {

    private boolean LeapYear;

    public TechStudent(String name, String surname, int YearOfBirth, ArrayList<Integer> marksList) {
        super(name, surname, YearOfBirth, marksList);
    }

    public boolean isLeapYear() {
        if (getYearOfBirth() % 4 == 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String Specialization() {
        return "Student technického oboru";
    }
}
