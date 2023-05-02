package InheritanceDemo;

public class Manager extends Member{
    private String department;


    public Manager(String name, int age, String phone_number, String address, String salary, String department) {
        super(name, age, phone_number, address, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static void main(String[] args) {
        Manager manager=new Manager("Ridoh", 35,"08106057848","1, Afolabi str","7000000",
                "Java Backend Software developer");

        System.out.printf("""
                                Manager's name is: %s
                                Manager's age is: %s,
                                Manager's phone number is %s,
                                Manager's address is: %s,
                                Manager's salary is: %s,
                                Manager's department is: %s
                                """, manager.getName(),manager.getAge(),manager.getPhone_number(),manager.getAddress(),
                                manager.getSalary(),manager.getDepartment());
    }


}
