package InheritanceToComposition;

public class BasePlusCommissionTest{
        public static void main(String[] args) {
            CommissionEmployee moses = new CommissionEmployee("Moses", "Hunsu", "12345",
                    500, 0.9);
            BasePlusCommission mosesplus = new BasePlusCommission(moses, 5000);

            System.out.println(mosesplus);

        }
}
