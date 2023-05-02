package advancedOOP;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String bvn, double grossSales, double commissionRate,
                                      double baseSalary) {
      super(firstName,lastName,bvn,grossSales,commissionRate);
      this.baseSalary=baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;

        }
    public double earnings(){
        return baseSalary+(super.earnings);
    }
    public String toString() {
        return "CommissionEmployee{" +
                "firstName='" + getFirstName()+ '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", bvn='" + getBvn() + '\'' +
                ", grossSales=" + getGrossSales() +
                ", commissionRate=" + getCommissionRate() +
                ", baseSalary=" + getBaseSalary() +
                ", earnings=" + earnings()+
                '}';
}
}
