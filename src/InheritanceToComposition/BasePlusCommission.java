package InheritanceToComposition;

public class BasePlusCommission {
    private CommissionEmployee customerInfo;
    private double baseSalary;

    public BasePlusCommission(CommissionEmployee customerInfo, double baseSalary) {
        this.customerInfo = customerInfo;
        this.baseSalary = baseSalary;
    }

    public CommissionEmployee getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(CommissionEmployee customerInfo) {
        this.customerInfo = customerInfo;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double earnings() {
        return customerInfo.earnings();
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "firstName='" + customerInfo.getFirstName() + '\'' +
                ", lastName='" + customerInfo.getLastName() + '\'' +
                ", bvn='" + customerInfo.getBvn() + '\'' +
                ", grossSales=" + customerInfo.getGrossSales() +
                ", commissionRate=" + customerInfo.getCommissionRate() +
                ", baseSalary=" + baseSalary +
                ", earnings=" + earnings() +
                '}';
    }
}
