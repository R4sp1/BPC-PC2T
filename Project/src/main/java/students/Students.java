package students;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Students extends AbstarctStudent {

    private List<TechStudent> listOfTechStudent;
    private List<HumaStudent> listOfHumaStudents;
    private List<CombiStudent> listOfCombiStudents;

    public Students(){
        listOfTechStudent = new ArrayList<>();
        listOfHumaStudents = new ArrayList<>();
        listOfCombiStudents = new ArrayList<>();
    }

    public Students(List<TechStudent> listOfTechStudent, List<HumaStudent> listOfHumaStudents, List<CombiStudent> listOfCombiStudents) {
        super();
        this.listOfTechStudent = listOfTechStudent;
        this.listOfHumaStudents = listOfHumaStudents;
        this.listOfCombiStudents = listOfCombiStudents;
    }

    public List<TechStudent> getListOfTechStudent() {
        return listOfTechStudent;
    }


    public void setListOfTechStudent(List<TechStudent> listOfTechStudent) {
        this.listOfTechStudent = listOfTechStudent;
    }

    public void addTechStudent(TechStudent student) {
        this.listOfTechStudent.add(student);
    }

    public List<HumaStudent> getListOfHumaStudents() {
        return listOfHumaStudents;
    }

    public void setListOfHumaStudents(List<HumaStudent> listOfHumaStudents) {
        this.listOfHumaStudents = listOfHumaStudents;
    }

    public void addHumaStudent(HumaStudent student) {
        this.listOfHumaStudents.add(student);
    }

    public List<CombiStudent> getListOfCombiStudents() {
        return listOfCombiStudents;
    }

    public void setListOfCombiStudents(List<CombiStudent> listOfCombiStudents) {
        this.listOfCombiStudents = listOfCombiStudents;
    }



    public void printAll() {
        System.out.println("List of Tech students");
        listOfTechStudent.forEach(System.out::println);

        System.out.println("\nList of Huma students");
        listOfHumaStudents.forEach(System.out::println);

        System.out.println("\nList of Combi students");
        listOfCombiStudents.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Students{" +
                "listOfTechStudent=" + listOfTechStudent +
                '}';
    }

    @Override
    public String Specialization() {
        return null;
    }

    @Override
    public String SpecializationInfo() {
        return null;
    }
}
