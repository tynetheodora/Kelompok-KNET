import java.util.Scanner;
import model.Order;
import model.Payment;
import model.User;
import model.Cart;
import model.Item;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Online Food Delivery");
        //code menu tampilan dashboard
    Scanner scanner = new Scanner(System.in);
                int choice;

                do {
                    System.out.println("1. Add Item");
                    System.out.println("2. Add User ");
                    System.out.println("3. Place Order");
                    System.out.println("4. Track Delivery");
                    System.out.println("Please enter your choice");

                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("You selected Option 1");
                            break;
                        case 2:
                            System.out.println("You selected Option 2");
                            break;
                        case 3:
                            System.out.println("You selected Option 3");
                            break;           
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            break;
                    }
                    
                    System.out.println(); // Print an empty line for readability
                } while (choice != 4);
                
                scanner.close();
            }

            public static void init(){

                
                User Evelline = new User("1", "eve", "eve@gmail.com", "123456");
                User Tyne = new User("2", "tyne.theo", "tyne.theo@gmail.com", "abcdef");
                User kayla = new User("3", "kayla", "kylnmr@gmail.com", "98765");

            }
        }
                        
    