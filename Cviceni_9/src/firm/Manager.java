package firm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Manager<T> extends Employee {

    private List<Employee> listOfEmployees;
    private final List<T> listOfRelationships;

    public Manager() {
        listOfEmployees = new ArrayList<>();
        listOfRelationships = new ArrayList<>();
    }

    public void setListOfEmployees(List<Employee> listOfEmployees) {
        Objects.requireNonNull(listOfEmployees, "List zamesntancu nemuze byt prazdny!");
        this.listOfEmployees = listOfEmployees;
    }

    public void addRelationship(T t) {
        Objects.requireNonNull(t, "Vztah nemuze zustat nevyplneny!");
        this.listOfRelationships.add(t);
    }

    public void printAll() {
        System.out.println("List zamestnancu: ");
        listOfEmployees.forEach(System.out::println);
        System.out.println(System.lineSeparator() + "List vztahu: ");
        listOfRelationships.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Manazer [zamestnanci: " + listOfEmployees + ", vztahy: " + listOfRelationships + "]";
    }

}
