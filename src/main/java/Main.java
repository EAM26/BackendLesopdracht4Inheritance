public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Emile", "Muller", new VisaCard(1234));

        Customer customer2 = new Customer("Piet", "de Vries", 12345, new MasterCard(2000));
        customer.printName();
        customer2.printName();
        Customer customer3 = new Customer("Frodo", "Balings", new VisaCard(100));
        customer3.getCreditCard().pay(20);Customer customer4 = new Customer("Bilbo", "Balings", new MasterCard(100));
        customer4.getCreditCard().pay(20);
        System.out.println(customer3.getCreditCard().getDebt());
    }
}
