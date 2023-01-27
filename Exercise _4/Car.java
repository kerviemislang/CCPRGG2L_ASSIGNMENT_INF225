  public class Car {
    String brand;
    Myself owner;

    Car (String carBrand, Myself me){
        this.brand =  carBrand;
        this.owner = me; 
    }
     void showOwnerName(){
        System.out.println("My car is " + this.brand + " My owner name is " + owner.name);
    }
    
}
