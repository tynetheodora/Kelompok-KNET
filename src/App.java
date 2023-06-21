import java.util.Scanner;
import model.Order;
import model.Payment;
import model.OrderDetail;
import model.User;
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
                    System.out.println("5. Input Order Detail Data");
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
                            inputOrderDetailData();
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


                OrderDetail customer1Orderdetail = new OrderDetail("pizza","F01", "50.000","1","7.000","57.000");
                OrderDetail customer2Orderdetail = new OrderDetail("bakso","F04","30.000","2","5.000","65.000");
                OrderDetail customer3Orderdetail = new OrderDetail("mie goreng","F06","25.000","3","8.000","83.000");

                Order Customer = new Order("Online Orders", "Polonia Medan", "TyneTheodora", "1220028", "11 November 2023", "11:11");

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

                    System.out.println("Online Order");
                    System.out.println("Online Orders");

                    String namaRestoran = scanner.nextLine();
                    System.out.print("Nama Restoran : ");
                    String alamatRestoran = scanner.nextLine();
                    System.out.print("Alamat Restoran : ");
                    String namaPelanggan = scanner.nextLine();
                    System.out.print("Nama Pelanggan : ");
                    String idPemesanan = scanner.nextLine();
                    System.out.print("ID Pemesanan: ");
                    String tanggalPembelian = scanner.nextLine();
                    System.out.print("Tanggal Pembelian : ");
                    String jamPembelian = scanner.nextLine();
                    scanner.nextLine(); // Discard the newline character

                    Order newOrder = new Order(namaRestoran, alamatRestoran, namaPelanggan, idPemesanan, tanggalPembelian, jamPembelian);

                    System.out.println("=== Input Order Detail Data ===");
                    System.out.print("Nama Menu: ");
                    String namamenu = scanner.nextLine();
                    System.out.print("ID Menu: ");
                    String IDmenu = scanner.nextLine();
                    System.out.print("Harga: ");
                    String harga = scanner.nextLine();
                    System.out.print("Kuantitas: ");
                    String kuantitas = scanner.nextLine();
                    System.out.println("Tax");
                    String tax = scanner.nextLine();
                    System.out.print("Total Harga: ");
                    String totalHarga = scanner.nextLine();
                    scanner.nextLine(); // Discard the newline character

                    OrderDetail newOrderDetail = new OrderDetail(namamenu, IDmenu, harga, kuantitas, tax, totalHarga);


                    for (int i = 0; i < OrderDetail.length; i++) {
                        if (OrderDetail[i] == null) {
                            OrderDetail[i] = newOrderDetail;
                            break;
                        }
                    }

                    System.out.println("Order data has been input.");
                    return newOrderDetail;
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

                    for (int j = 0; j < Order.length; j++) {
                            if (Order[j] != null) {
                                System.out.println("Order[" + j + "]:");
                                System.out.println("Nama Restoran : " + Order[j].getNamaRestoran());
                                System.out.println("Alamat Restoran: " + Order[j].getAlamatRestoran());
                                System.out.println("Nama Pengguna: " + Order[j].getNamaPengguna());
                                System.out.println("ID Pemesanan : " + Order[j].getIdPemesanan());
                                System.out.println("Tanggal: " + Order[j].getTanggalPembelian());
                                System.out.println("Jam: " + Order[j].getJamPembelian());


                    for (int i = 0; j < OrderDetail.length; i++) {
                            if (OrderDetail[i] != null) {
                                System.out.println("Order Detail[" + j + "]:");
                                System.out.println("Nama Menu : " + OrderDetail[j].getNamamenu());
                                System.out.println("ID menu: " + OrderDetail[j].getIDmenu());
                                System.out.println("Harga: " + OrderDetail[j].getHarga());
                                System.out.println("kuantitas : " + OrderDetail[j].getKuantitas());
                                System.out.println("Tax: " + OrderDetail[j].getTax());
                                System.out.println("Total harga: " + OrderDetail[j].getTotalHarga());

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
                    }

                }
            }
        }
    }
}