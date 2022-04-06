package firm;


public class Secretarian extends Employee {

    private final int age;

    public Secretarian(String nickName, String email, char[] password, EmployeeType employeeType, int age) {
        super(nickName, email, password, employeeType);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Sekretarka [vek: " + age + ", jmeno: " + getNickname() + ", email: " + getEmail() + ", heslo: " + new String(getPassword()) + ", zamestnanec: "
                + getEmployeeType() + "]";
    }
}
