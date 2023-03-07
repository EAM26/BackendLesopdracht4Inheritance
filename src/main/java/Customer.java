public class Customer {
    String name;
    String lastName;
    int customerNumber;
    CreditCard creditCard;

    public Customer(String name, String lastName, int customerNumber, CreditCard creditCard) {
        this.name = name;
        this.lastName = lastName;
        this.customerNumber = customerNumber;
        this.creditCard = creditCard;

    }

    public Customer(String name, String lastName, CreditCard creditCard) {
        this.name = name;
        this.lastName = lastName;
        this.creditCard = creditCard;
    }

    public void printName() {
        System.out.println("Customer " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
}
