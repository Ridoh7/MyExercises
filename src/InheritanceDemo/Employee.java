package InheritanceDemo;

public class Employee extends Member{
    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Employee(String name, int age, String phone_number, String address, String salary, String specialization) {
        super(name, age, phone_number, address, salary);
        this.specialization=specialization;
    }

    public static void main(String[] args) {
        Employee employee=new Employee("Ridoh",34,"08123282335","4, Giwa Str", "5000000",
                "Senior Software Engineer");

        System.out.printf("""
                Employee's Name is: %s,
                Employee's age is: %s,
                Employee's phone number is %s,
                Employee's address is: %s,
                Employee's salary is: %s,
                Employee's specialization is: %s
                """, employee.getName(),employee.getAge(),employee.getPhone_number(),employee.getAddress(),
                employee.getSalary(),employee.getSpecialization());
    }
}
