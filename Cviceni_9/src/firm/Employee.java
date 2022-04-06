package firm;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

    private String nickname;
    private String email;
    private char[] password;
    private EmployeeType employeeType;

    public Employee() {}

    public Employee(String nickname, String email, char[] password, EmployeeType employeeType) {
        this.nickname = nickname;
        this.email = email;
        this.password = password;
        this.employeeType = employeeType;
    }


    public String getNickname() {
        return nickname;
    }


    public String getEmail() {
        return email;
    }


    public char[] getPassword() {
        return password;
    }


    public EmployeeType getEmployeeType() {
        return employeeType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return email.equals(employee.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "Jmeno: " + nickname + ", email: " + email + ", heslo: " + new String(password) + ", status zamestnance: " + employeeType;
    }

    @Override
    public int compareTo(Employee o) {
        return this.email.compareTo(o.getEmail());
    }

}
