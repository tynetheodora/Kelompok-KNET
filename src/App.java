import java.util.Scanner;
import model.Order;
import model.Payment;
import model.User;
import model.Cart;
import model.Menu;

public class App {
    public static void main(String[] args) throws Exception {
         boolean exit = false;

        //code menu tampilan dashboard
        Scanner scanner = new Scanner(System.in);
                int choice;

                do {
                    System.out.println("=== Online Food Delivery ===");
                    System.out.println("1. Input User Data");
                    System.out.println("2. Input Menu Data ");
                    System.out.println("3. Input Order Data");
                    System.out.println("4. Input Payment Data");
                    System.out.println("5. Input Cart Data");
                    System.out.println("6. Display Data");
                    System.out.println("0. Exit");
                    System.out.println("Please choose a menu : ");

                    choice = scanner.nextInt();

                    switch (choice) {
                        case 0:
                            exit = true;
                            break;
                        case 1:
                            inputUserData();
                            break;
                        case 2:
                            inputMenuData();
                            break;
                        case 3:
                            inputOrderData();
                            break;           
                        case 4:
                            inputPaymentData();
                            break;
                        case 5:
                            inputCartData();
                            break;
                        case 6:
                            displayData();
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            break;
                    }
                    
                    System.out.println(); // Print an empty line for readability
                } while (!exit);
                
                scanner.close();
            }

            public static void init(){

                User User1 = new User("1", "eve", "eve@gmail.com", "123456");
                User User2 = new User("2", "tyne.theo", "tyne.theo@gmail.com", "abcdef");
                User User3 = new User("3", "kayla", "kylnmr@gmail.com", "98765");

                Payment Customer1 = new Payment("IDR", "200.000", "Cash", "5/6/2023", "xcsznjc0ldr", "Completed", " - ");
                Payment Customer2 = new Payment("IDR", "250.000", "Bank Transfer", "5/6/2023", "sjnclasc5", "Failed", " - ");
                Payment Customer3 = new Payment("IDR", "300.000", "E-Wallet", "5/6/2023", "jsbakjsn3s", "In Progress", " - ");
            
                Cart Cart2 = new Cart("Pizza", "1", "50.000", "50.000", "10.000", "40.000", "jangan pedas");
                Cart Cart3 = new Cart("Martabak", "1", "50.000", "50.000", "10.000", "40.000", "jangan pedas");
                Cart Cart4 = new Cart("Sushi", "1", "50.000", "50.000", "10.000", "40.000", "jangan pedas");

                Order customer1Order = new Order("novita","pizza","001", "50.000","1","50.000","cash");
                Order customer2Order = new Order("tyne","bakso","021","30.000","2","60.000","BCA");
                Order customer3Order = new Order("kayla","mie goreng","022","25.000","3","75.000","cash");

            }

                private static User[] user = new User[10];
                private static User inputUserData() {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("=== Input User Data ===");
                    System.out.print("Id: ");
                    String id = scanner.nextLine();
                    System.out.print("Username: ");
                    String username = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Password: ");
                    String password = scanner.nextLine();

                    User newUser = new User(id, username, email, password);

                    for (int i = 0; i < user.length; i++) {
                        if (user[i] == null) {
                            user[i] = newUser;
                            break;
                        }
                    }
                    
                    System.out.println("User data has been input.");
                    return newUser;
                }

                 static Menu menu[] = new Menu[20];
                 private static Menu inputMenuData() {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("=== Input Menu Data ===");
                    System.out.print("Food Name: ");
                    String food = scanner.nextLine();
                    System.out.print("Drink Name: ");
                    String drink = scanner.nextLine();
                    System.out.print("Dessert Name: ");
                    String dessert = scanner.nextLine();
                    System.out.print("Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Discard the newline character

                    Menu newMenu = new Menu(food, drink, dessert, null);

                    for (int i = 0; i < menu.length; i++) {
                        if (menu[i] == null) {
                            menu[i] = newMenu;
                            break;
                        }
                    }
                    System.out.println("Menu data has been input.");
                    return newMenu;
                }

                static Order order[] = new Order[20];
                private static Order inputOrderData() {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("=== Input Order Data ===");
                    System.out.print("Nama Pengguna: ");
                    String namapengguna = scanner.nextLine();
                    System.out.print("Nama Menu: ");
                    String namamenu = scanner.nextLine();
                    System.out.print("ID Menu: ");
                    String IDmenu = scanner.nextLine();
                    System.out.print("Harga: ");
                    String harga = scanner.nextLine();
                    System.out.print("Kuantitas: ");
                    String kuantitas = scanner.nextLine();
                    System.out.print("Total Harga: ");
                    String totalHarga = scanner.nextLine();
                    System.out.print("Payment: ");
                    String payment = scanner.nextLine();
                    scanner.nextLine(); // Discard the newline character

                    Order newOrder = new Order(namapengguna, namamenu , IDmenu , harga ,  kuantitas , totalHarga , payment );

                    for (int i = 0; i < order.length; i++) {
                        if (order[i] == null) {
                            order[i] = newOrder;
                            break;
                        }
                    }

                    System.out.println("Order data has been input.");
                    return newOrder;
                }

                static Payment payment[] = new Payment[20];
                private static Payment inputPaymentData() {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("=== Input Payment Data ===");
                    System.out.print("Currency: ");
                    String currency = scanner.nextLine();
                    System.out.print("Amount: ");
                    String amount = scanner.nextLine();
                    System.out.print("Payment Method: ");
                    String paymentMethod = scanner.nextLine();
                    System.out.print("TransactionDate: ");
                    String transactionDate = scanner.nextLine();
                    System.out.print("TransactionId: ");
                    String transactionId = scanner.nextLine();
                    System.out.print("Status: ");
                    String status = scanner.nextLine();
                    System.out.print("Additional Details: ");
                    String additionalDetails = scanner.nextLine();

                    Payment newPayment = new Payment(currency, amount, paymentMethod, transactionDate, transactionId, status, additionalDetails);
                    
                    for (int i = 0; i < payment.length; i++) {
                        if (payment[i] == null) {
                            payment[i] = newPayment;
                            break;
                        }
                    }
                    System.out.println("Payment data has been input.");
                    return newPayment;
                }

                static Cart cart[] = new Cart[20];
                private static Cart inputCartData() {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("=== Input Cart Data ===");
                    System.out.print("Product Name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Quantity: ");
                    String quantity = scanner.nextLine();
                    System.out.print("Price: ");
                    String price = scanner.nextLine();
                    System.out.print("Sub Total: ");
                    String subTotal = scanner.nextLine();
                    System.out.print("Discount: ");
                    String discount = scanner.nextLine();
                    System.out.print("Total Price: ");
                    String totalPrice = scanner.nextLine();
                    System.out.print("Notes: ");
                    String notes = scanner.nextLine();
                    scanner.nextLine(); // Discard the newline character

                    Cart newCart = new Cart(productName, quantity, price, subTotal, discount, totalPrice, notes);

                    for (int i = 0; i < cart.length; i++) {
                        if (cart[i] == null) {
                            cart[i] = newCart;
                            break;
                        }
                    }

                    System.out.println("Cart data has been input.");
                    return newCart;
                }

                private static void displayData() {
                    for (int j = 0; j < user.length; j++) {
                            if (user[j] != null) {
                                System.out.println("=== Display Data ===");
                                System.out.println("User[" + j + "]:");
                                System.out.println("Id: " + user[j].getId());
                                System.out.println("Username: " + user[j].getUsername());
                                System.out.println("Email: " + user[j].getEmail());
                                System.out.println("Password: " + user[j].getPassword());
                            }
                    }

                    for (int j = 0; j < menu.length; j++) {
                            if (menu[j] != null) {
                                System.out.println("Menu[" + j + "]:");
                                System.out.println("Food Name: " + menu[j].getFood());
                                System.out.println("Drink Name: " + menu[j].getDrink());
                                System.out.println("Dessert Name: " + menu[j].getDessert());
                                System.out.println("Price: " + menu[j].getPrice());
                            }
                    }

                    for (int j = 0; j < order.length; j++) {
                            if (order[j] != null) {
                                System.out.println("Order[" + j + "]:");
                                System.out.println("Edit Pesanan: " + order[j].getEditpesanan());
                                System.out.println("Rating Pesanan: " + order[j].getRatingpesanan());
                                System.out.println("Detail: " + order[j].getDetail());
                                System.out.println("Number: " + order[j].getNumber());
                                System.out.println("Time: " + order[j].getTime());
                                System.out.println("Queue: " + order[j].getQueue());
                            }
                    }

                    for (int j = 0; j < payment.length; j++) {
                            if (payment[j] != null) {
                                System.out.println("Payment[" + j + "]:");
                                System.out.println("Currency: " + payment[j].getCurrency());
                                System.out.println("Amount: " + payment[j].getAmount());
                                System.out.println("Payment Method: " + payment[j].getPaymentMethod());
                                System.out.println("Transaction Date: " + payment[j].getTransactionDate());
                                System.out.println("Transaction Id: " + payment[j].getTransactionId());
                                System.out.println("Status: " + payment[j].getStatus());
                                System.out.println("Additional: " + payment[j].getAdditionalDetails());
                            }
                    }

                    for (int j = 0; j < cart.length; j++) {
                            if (cart[j] != null) {
                                System.out.println("Cart[" + j + "]:");
                                System.out.println("Product Name: " + cart[j].getProductName());
                                System.out.println("Quantity: " + cart[j].getQuantity());
                                System.out.println("Price: " + cart[j].getPrice());
                                System.out.println("Sub Total: " + cart[j].getSubTotal());
                                System.out.println("Discount: " + cart[j].getDiscount());
                                System.out.println("Total Price: " + cart[j].getTotalPrice());
                                System.out.println("Notes: " + cart[j].getNotes());
                            }
                    }



                    
                }
        }
                    