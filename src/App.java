import java.util.Scanner;
import model.Order;
import model.Payment;
import model.User;
import model.Cart;
import model.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Online Food Delivery");
        //code menu tampilan dashboard
    Scanner scanner = new Scanner(System.in);
                int choice;

                do {
                    System.out.println("1. Input User Data");
                    System.out.println("2. Input Menu Data ");
                    System.out.println("3. Input Order Data");
                    System.out.println("4. Input Payment Data");
                    System.out.println("5. Input Rating Data");
                    System.out.println("6. Input Cart Data");
                    System.out.println("7. Input Delivery Tracking Data");
                    System.out.println("8. Display Data");
                    System.out.println("0. Exit");
                    System.out.println("Please choose a menu : ");

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

                Payment Customer1 = new Payment("IDR", "200.000", "Cash", "5/6/2023", "xcsznjc0ldr", "Completed", " - ");
                Payment Customer2 = new Payment("IDR", "250.000", "Bank Transfer", "5/6/2023", "sjnclasc5", "Failed", " - ");
                Payment Customer3 = new Payment("IDR", "300.000", "E-Wallet", "5/6/2023", "jsbakjsn3s", "In Progress", " - ");
            
                Cart Cart2 = new Cart("Pizza", "1", "50.000", "50.000", "10.000", "40.000", "jangan pedas");
                Cart Cart3 = new Cart("Martabak", "1", "50.000", "50.000", "10.000", "40.000", "jangan pedas");
                Cart Cart4 = new Cart("Sushi", "1", "50.000", "50.000", "10.000", "40.000", "jangan pedas");

                Order customer1Order = new Order("ya","4","2", "sushi","001","12:02","2");
                Order customer2Order = new Order("ya","5","5","snack cookies ","021","12:05","3");
                Order customer3Order = new Order("ya","5","5","pizza ","033","12:10","4");




            }
        }
                        
    