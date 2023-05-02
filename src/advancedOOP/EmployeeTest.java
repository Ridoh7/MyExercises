package advancedOOP;

public class EmployeeTest {
    public static void main(String[] args) {
        Date birthDate=new Date(2,5,1983);
        Date hireDate =new Date();
        hireDate.setDay(31);
        hireDate.setMonth(9);
        hireDate.setDay(2023);
        Date weddingDate=new Date(3,5,2016);
        Employee sarah=new Employee("sarah","Adeolu","22145674848","Female", birthDate, hireDate, weddingDate);

        sarah.displayEmployeeInfo();
    }
}
