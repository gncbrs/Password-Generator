import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        GeneratePassword gp = new GeneratePassword();//Calling the class.
        Scanner scanner = new Scanner(System.in);
        
        String operations = "App operations;\n"
                + "1. Generate Password\n"
                + "2. Show Operations\n"
                + "3. Exit";
        
        System.out.println(operations);
        
        //until user wants to quit it should continue to work.
        while (true) {
            System.out.print("Enter an operation number: ");
            int operation = scanner.nextInt();
            
            scanner.nextLine();//For an error that may occur.
            
            if (operation == 1){
                System.out.print("The length of your password: ");
                int uzunluk = scanner.nextInt();
                
                gp.generate_password(uzunluk);
                System.out.println("Your password is generating. Please wait...");
                Thread.sleep(3000);
                
                System.out.println("Your password's generated.");
                
                System.out.println("Password: " + gp.getPassword());
            }
            
            else if (operation == 2) {
                System.out.println(operations);
            }
            
            else if (operation == 3) {
                System.out.println("Closing the app...");
                Thread.sleep(2000);
                break;
            }
            
            else {
                System.out.println("Invalid operatin. Please try again...");
                System.out.println(operations);
            }
        }
    }
}
