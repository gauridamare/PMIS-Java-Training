package OOPS.CODES;
public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Gauri");

        Bike bike = new Bike("B101", "Honda", 500);

        Rental rental = new Rental(bike, customer, 7);

        customer.addRental(rental);

        System.out.println("Customer: " + customer.getName());
        System.out.println("Bike: " + bike.getModel());
        System.out.println("Total Rent: " + rental.getCost());
        bike.setAvailable(false);
System.out.println("Available after rental: " + bike.isAvailable());

bike.setAvailable(true);
System.out.println("Available after return: " + bike.isAvailable());
    }
}