public abstract class CreditCard {

    public int debt;

    public CreditCard(int debt) {
        this.debt = debt;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    void pay(int amount) {
        System.out.println("super amount: " + amount);
        this.debt += amount;
        System.out.println("Your debt has increased with " + amount + " to " + this.getDebt());
    }
}
