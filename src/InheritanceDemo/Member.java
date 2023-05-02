package InheritanceDemo;

/**
 * Create a class named 'Member' having the following members:
 * Data members
 * 1 - Name
 * 2 - Age
 * 3 - Phone number
 * 4 - Address
 * 5 - Salary
 * It also has a method named 'printSalary' which prints the salary of the members.
 * Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members
 * 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee
 * and a manager by making an object of both of these classes and print the same.
 */
public class Member {
    private String name;
    private int age;
    private String phone_number;
    private String address;
    private String salary;

    public Member(String name, int age, String phone_number, String address, String salary) {
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void printSalary(){
        System.out.printf("The salary of the members are %s", salary);
    }

}
