package exercise5;

public class app {
    public static void main(String[] args) throws Exception {
        
        person me = new person();

        // Name
        
        me.setName("JL Kervie");

        String myName = me.getName();

        System.out.println("Hi! My name is " + myName);

        // CC 
        
        me.setNum(45678);

        int ccNum = me.getNum();

        System.out.println("My credit card number is " + ccNum);

        // Son 
        
        son Me = new son();

        System.out.println("My surname is " + Me.surname);

        Me.showLove();

    }
}
