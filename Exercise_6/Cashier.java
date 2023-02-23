package exercise6;

public class cashier {
    
    public void checkOut(groceryItem item) {
       System.out.println("You have bought a " + item.name);
    }

    public void showPrice(groceryItem item) {
        System.out.println("The price of this item is " + item.price);
    }
}
