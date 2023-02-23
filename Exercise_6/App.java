package exercise6;

public class App {
    public static void main(String[] args) throws Exception {
        
        // grocery items
        groceryItem item1 = new groceryItem();
        item1.name = "Dental floss";
        item1.price = 15.25;
        item1.showItemName();

        groceryItem item2 = new toothbrush();
        item2.name = "Mislang Dental";
        item2.price = 25.80;
        item2.showItemName();

        groceryItem item3 = new toothpaste();
        item3.name = "Close up";
        item3.price = 30.25;
        item3.showItemName();

        // cashier object
        
        cashier c1 = new cashier();
        c1.checkOut(item1);
        c1.showPrice(item1);

        c1.checkOut(item2);
        c1.showPrice(item2);

        c1.checkOut(item3);
        c1.showPrice(item3);

        // Polymorphic array
        
        groceryItem[] itemArray = new groceryItem[2];
        itemArray[0] = item2;
        itemArray[1] = item3;

        // loop thru all items
        for (int i = 0; i < itemArray.length; i++) {
            itemArray[i].showItemName();
        }

       dog myDog = new dog();
        myDog.eat();

        cheetah myCheetah = new cheetah();
        myCheetah.walk();
        myCheetah.run();

    }
}
