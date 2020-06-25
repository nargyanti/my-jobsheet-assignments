import java.util.Scanner;
public class SystemLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username, pass;

        System.out.print("Username: ");
        username = sc.nextLine();

        if (username.equalsIgnoreCase("College Student")) {
            System.out.print("Password: ");
            pass = sc.nextLine();
                if (pass.equals("SeCreT")) {
                    System.out.println("You have successfully logged in");
                } else {
                    System.out.println("Sorry, wrong password");
                }
        } else {
            System.out.println("Username not found");
        }
    }
}


