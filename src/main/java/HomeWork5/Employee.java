package HomeWork5;

public class Employee {

    private String email;
    private long phoneNumber;
    private int salary;
    private int age;

    public Employee(String email, long phoneNumber, int salary, int age) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployeeInfo() {
        System.out.println("Employee email is " + email + ", his phone number is " + phoneNumber
        + ", his salary is " + salary + " his age is " + age + ".");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
