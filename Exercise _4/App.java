public class App {
    public static void main(String[] args) throws Exception {
     
     Person Friend = new Person("Bella", 21);
     
     Myself Me = new Myself("Kervie", 18);

     Me.addFriend(Friend);
   
    Pet Dog = new Pet("Ziggy", Friend);
    Dog.showOwnerName();

    Car Civic = new Car("Civic", Me);
    Civic.showOwnerName();
}


}
