import java.util.Scanner;
import model.Order;
import model.Payment;
import model.User;
import model.Menu;
import model.Order;
import model.OrderDetail;

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

                Menu Cust1 = new Menu("Waffle", "01", "Dessert", 200000, "Original waffle with vanilla ice cream & honey ");
                Menu Cust2 = new Menu("Pizza", "02", "Main course", 350000, "Signature regular pizza");
                Menu Cust3 = new Menu("Porridge", "03", "Appetizer", 100000, "Savory porridge with garlic and fresh ginger");

                Payment Customer1 = new Payment("IDR", "200.000", "Cash", "5/6/2023", "xcsznjc0ldr", "Completed", " - ");
                Payment Customer2 = new Payment("IDR", "250.000", "Bank Transfer", "5/6/2023", "sjnclasc5", "Failed", " - ");
                Payment Customer3 = new Payment("IDR", "300.000", "E-Wallet", "5/6/2023", "jsbakjsn3s", "In Progress", " - ");

<<<<<<< HEAD
                Order Customer = new Order("Online Order", "Polonia Medan", "TyneTheodora", null, null);
=======
<<<<<<< Updated upstream
                Orders Customer = new Orders("Online Orders", "Polonia Medan", "TyneTheodora", null, null);
>>>>>>> 69d7b00db3457a86b926c496dfae9315b34151a8

=======
<<<<<<< HEAD
=======
                Order customer1Order = new Order("novita","pizza","001", "50.000","1","50.000","cash");
                Order customer2Order = new Order("tyne","bakso","021","30.000","2","60.000","BCA");
                Order customer3Order = new Order("kayla","mie goreng","022","25.000","3","75.000","cash");
>>>>>>> 6efa9aeac0da71e5c06cb32824b7b768a407122e
>>>>>>> Stashed changes

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

                static Order Order[] = new Order[20];
                private static Order inputOrderData() {
                    Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD
                    System.out.println("Online Order");
=======
<<<<<<< Updated upstream
                    System.out.println("Online Orders");
>>>>>>> 69d7b00db3457a86b926c496dfae9315b34151a8
                    String namaRestoran = scanner.nextLine();
                    System.out.print("Rating Pesanan: ");
                    String alamatRestoran = scanner.nextLine();
                    System.out.print("Detail: ");
                    String namaPelanggan = scanner.nextLine();
                    System.out.print("Number: ");
                    String idPemesanan = scanner.nextLine();
                    System.out.print("Time: ");
                    String tanggalPembelian = scanner.nextLine();
                    System.out.print("Queue: ");
                    String jamPembelian = scanner.nextLine();
                    scanner.nextLine(); // Discard the newline character

<<<<<<< HEAD
                    Order newOrder = new Order(namaRestoran, alamatRestoran, namaPelanggan, idPemesanan, tanggalPembelian, jamPembelian);
=======
                    Orders newOrders = new Orders(namaRestoran, alamatRestoran, namaPelanggan, idPemesanan, tanggalPembelian, jamPembelian);
=======
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
>>>>>>> Stashed changes
>>>>>>> 69d7b00db3457a86b926c496dfae9315b34151a8

                    for (int i = 0; i < Order.length; i++) {
                        if (Order[i] == null) {
                            Order[i] = newOrder;
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

<<<<<<< HEAD
                    for (int j = 0; j < Order.length; j++) {
                            if (Order[j] != null) {
                                System.out.println("Order[" + j + "]:");
                                System.out.println("Edit Pesanan: " + Order[j].getNamaRestoran());
                                System.out.println("Rating Pesanan: " + Order[j].getAlamatRestoran());
                                System.out.println("Detail: " + Order[j].getNamaPengguna());
                                System.out.println("Number: " + Order[j].getIdPemesanan());
                                System.out.println("Time: " + Order[j].getTanggalPembelian());
                                System.out.println("Queue: " + Order[j].getJamPembelian());
=======
<<<<<<< Updated upstream
                    for (int j = 0; j < Orders.length; j++) {
                            if (Orders[j] != null) {
                                System.out.println("Orders[" + j + "]:");
                                System.out.println("Edit Pesanan: " + Orders[j].getNamaRestoran());
                                System.out.println("Rating Pesanan: " + Orders[j].getAlamatRestoran());
                                System.out.println("Detail: " + Orders[j].getNamaPengguna());
                                System.out.println("Number: " + Orders[j].getIdPemesanan());
                                System.out.println("Time: " + Orders[j].getTanggalPembelian());
                                System.out.println("Queue: " + Orders[j].getJamPembelian());
>>>>>>> 69d7b00db3457a86b926c496dfae9315b34151a8
                            }
                    }

=======
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
                    }                    
=======
                    }
                    
>>>>>>> Stashed changes
                }
        }
        