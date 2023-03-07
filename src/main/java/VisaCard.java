public class VisaCard extends CreditCard{
    public VisaCard(int debt) {
        super(debt);
    }

    @Override
    void pay(int amount) {
//        System.out.println("override used");
//        System.out.println("amount override " + amount);
//        double newAmount = 0.9 * amount;

        super.pay((int)(.9*amount));
    }
}
