package advancedOOP;

public class CustomerInfo {
    /**
     * e) Many programs written with inheritance
     * could be written with composition instead, and vice versa.
     * Rewrite class BasePlusCommissionEmployee (Fig. 9.11) of the
     * CommissionEmployee–BasePlusCommissionEmployee hierarchy to use
     * composition rather than inheritance.
     */
    private String firstName;
    private String lastName;
    private String bvn;
    private double grossSales;
    private double commissionRate;
    private double baseSalary;

    public CustomerInfo(String firstName, String lastName, String bvn, double grossSales, double commissionRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bvn = bvn;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBvn() {
        return bvn;
    }

    public void setBvn(String bvn) {
        this.bvn = bvn;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "CustomerInfo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bvn='" + bvn + '\'' +
                ", grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                ", baseSalary=" + baseSalary +
                '}';
    }
    public void displayCustomerInfo(){
        System.out.printf("""
                first name is: %s
                last name is: %s
                bvn is : %s
                gross sales is: %f
                commission rate is: %f
                base salary is: %f""",
                getFirstName(),getLastName(),getBvn(),getGrossSales(),getCommissionRate(),getBaseSalary());
    }
}
