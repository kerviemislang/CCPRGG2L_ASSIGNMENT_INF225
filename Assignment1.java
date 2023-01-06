import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Java program to check if a student number is valid
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Email Address: ");
        String Emailadd = scan.nextLine();

        // Long method
        Pattern pattern = Pattern.compile("[a-zA-Z]+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(Emailadd);
        
        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid Email Address ");
        } else {
            System.out.println("invalid Email Address");
        }
   
        System.out.print("Enter your Phone Number: ");
        Emailadd = scan.nextLine();

        // Long method
         pattern = Pattern.compile("09+\\d{9}");
         matcher = pattern.matcher(Emailadd);
        
        match = matcher.matches();

        if (match) {
            System.out.println("valid Phone Number  ");
        } else {
            System.out.println("invalid Phone Number");
        }

        
    }
}
    
    
