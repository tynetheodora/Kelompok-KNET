import java.util.Scanner;
import java.util.jar.Attributes.Name;

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

                User User1 = new User("evelline christine", "eve", "eve@gmail.com", "123456","081234567891","01-02-02","jl.medan");
                User User2 = new User("tyne theodora", "tyne.theo", "tyne.theo@gmail.com", "abcdef","081234567891","01-02-02","jl.medan");
                User User3 = new User("kayla namira", "kayla", "kylnmr@gmail.com", "98765","081234567891","01-02-02","jl.medan");

                Menu Cust1 = new Menu("Waffle", "01", "Dessert", 200000, "Original waffle with vanilla ice cream & honey ");
                Menu Cust2 = new Menu("Pizza", "02", "Main course", 350000, "Signature regular pizza");
                Menu Cust3 = new Menu("Porridge", "03", "Appetizer", 100000, "Savory porridge with garlic and fresh ginger");

<<<<<<< HEAD
                Payment[] pymnt = new Payment[350];
                Payment.add(new Payment("0908777", "200.000", "Cash", "5/6/2023", "Completed", "9080777"));
                Payment.add(new Payment("0908666", "345.000", "Bank Transfer", "13/6/2023", "Failed", "9080666"));
                Payment.add(new Payment("0908555", "500.000", "OVO", "25/6/2023", "Completed", "9080555"));
=======
                Payment Customer1 = new Payment("IDR", "200.000", "Cash", "5/6/2023", "xcsznjc0ldr", "Completed", " - ");
                Payment Customer2 = new Payment("IDR", "250.000", "Bank Transfer", "5/6/2023", "sjnclasc5", "Failed", " - ");
                Payment Customer3 = new Payment("IDR", "300.000", "E-Wallet", "5/6/2023", "jsbakjsn3s", "In Progress", " - ");
>>>>>>> 4dce62f6c64f3fd4cd122dd70aef2726299acab2


                OrderDetail customer1Orderdetail = new OrderDetail("KN071J89I0","F011NK23LK", "Martabak Telur","Food 01","25.000","2","5.000","55.000");
                OrderDetail customer2Orderdetail = new OrderDetail("OF731J06P9","JKO678LG34", "Pizza Vegetarian","Food 07","65.000","1","7.000","32.000");
                OrderDetail customer3Orderdetail = new OrderDetail("KF845P04T3","OH739PKL27", "Spaghetti Carbonara","Food 13","55.000","1","5.500","60.500");

<<<<<<< HEAD
            static ArrayList<User> user = new ArrayList<User>();
            public static void inputUserData() {
                String id, username, email, password, phoneNumber, dateOfBirth, address;

                System.out.print("Id \t\t: ");
                id = input.nextLine();
                System.out.print("Username \t: ");
                username = input.nextLine();
                System.out.print("Email \t\t: ");
                email = input.nextLine();
                System.out.print("Password \t: ");
                password = input.nextLine();
                System.out.print("Phone number \t: ");
                phoneNumber = input.nextLine();
                System.out.print("Date of birth \t: ");
                dateOfBirth = input.nextLine();
                System.out.print("Address \t: ");
                address = input.nextLine();

                user.add(new User(id, username, email, password, phoneNumber, dateOfBirth, address));

                System.out.println("Menu data has been input.");
            }  

            static ArrayList<Menu> menu = new ArrayList<Menu>();
            public static void inputMenuData() {
                String namaItem, idItem, category, description;
                int price;

                System.out.print("Food Name \t: ");
                namaItem = input.nextLine();
                System.out.print("Food Id \t: ");
                idItem = input.nextLine();
                System.out.print("Category \t: ");
                category = input.nextLine();
                System.out.print("Price \t: ");
                price = input.nextInt();
                input.nextLine(); 
                System.out.print("Description \t: ");
                description = input.nextLine();

                menu.add(new Menu(namaItem, idItem, category, price, description));

                System.out.println("Menu data has been input.");
=======
                Order customer1Order = new Order("Online Order", "Polonia Medan", "TyneTheodora", "1220028", "11 November 2023", "11:11");
                Order customer2Order = new Order("Online Order", "Polonia Medan", "Kayla Nmr", "1220026", "24 Juni 2023", "20:45");
                Order customer3Order = new Order("Online Order", "Polonia Medan", "Evelline", "1220027", "13 Agustus 2023", "12:05");
>>>>>>> 4dce62f6c64f3fd4cd122dd70aef2726299acab2
            }

            private static User[] user = new User[10];
                private static User inputUserData() {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("=== Input User Data ===");
                    System.out.print("name: ");
                    String name = scanner.nextLine();
                    System.out.print("Username: ");
                    String username = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Password: ");
                    String password = scanner.nextLine();
                    System.out.print("Phone Number: ");
                    String phoneNumber= scanner.nextLine();
                    System.out.print("Date of Birth: ");
                    String dateOfBirth = scanner.nextLine();
                    System.out.print("Address: ");
                    String address = scanner.nextLine();


                    User newUser = new User(name, username, email, password, phoneNumber, dateOfBirth, address);

<<<<<<< HEAD
            static ArrayList<OrderDetail> orderDetail = new ArrayList<OrderDetail>();
            public static void inputOrderDetailData() {
                String namamenu, IDmenu, harga, kuantitas, tax, totalHarga;

                System.out.print("Nama Menu: ");
                namamenu = input.nextLine();
                System.out.print("ID Menu: ");
                IDmenu = input.nextLine();
                System.out.print("Harga: ");
                harga = input.nextLine();
                System.out.print("Kuantitas: ");
                kuantitas = input.nextLine();
                System.out.println("Tax");
                tax = input.nextLine();
                System.out.print("Total Harga: ");
                totalHarga = input.nextLine();

                OrderDetail.add(new OrderDetail(namamenu, IDmenu, harga, kuantitas, tax, totalHarga));

                System.out.println("Order data has been input.");
            }

            static ArrayList<Payment> payment = new ArrayList<Payment>();
            public static void inputPaymentData() {
                String idPayment, amount, paymentMethod, transactionDate, status, idOrder;

                System.out.print("Id Payment: ");
                idPayment = input.nextLine();
                System.out.print("Amount: ");
                amount = input.nextLine();
                System.out.print("Payment Method: ");
                paymentMethod = input.nextLine();
                System.out.print("TransactionDate: ");
                transactionDate = input.nextLine();
                System.out.print("Status: ");
                status = input.nextLine();
                System.out.print("Id Order: ");
                idOrder = input.nextLine();

                Payment.add(new Payment(idPayment, amount, paymentMethod, transactionDate, status, idOrder));

                System.out.println("Payment data has been input.");
=======
                    for (int i = 0; i < user.length; i++) {
                        if (user[i] == null) {
                            user[i] = newUser;
                            break;
                        }
                    }
                    
                    System.out.println("User data has been input.");
                    return newUser;
>>>>>>> 4dce62f6c64f3fd4cd122dd70aef2726299acab2
                }

            static Menu menu[] = new Menu[20];
                private static Menu inputMenuData() {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("=== Input Menu Data ===");
                    System.out.print("Food Name: ");
                    String namaItem = scanner.nextLine();
                    System.out.print("Food Id: ");
                    String idItem = scanner.nextLine();
                    System.out.print("Category: ");
                    String category = scanner.nextLine();
                    System.out.print("Price: ");
                    Integer price = scanner.nextInt();
                    System.out.print("Description: ");
                    String description = scanner.nextLine();
                    scanner.nextLine(); // Discard the newline character

                    Menu newMenu = new Menu(namaItem, idItem, category, price, description);

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
                    System.out.print("Jam Pembelian : ");
                    scanner.nextLine(); // Discard the newline character

                    Order newOrder = new Order(namaRestoran, alamatRestoran, namaPelanggan, idPemesanan, tanggalPembelian, jamPembelian);

                    for (int i = 0; i < order.length; i++) {
                        if (order[i] == null) {
                            order[i] = newOrder;
                            break;
                        }
                    }
                    System.out.println("Menu data has been input.");
                    return newOrder;
                }
            
            static OrderDetail orderDetail[] = new OrderDetail[20];
                private static OrderDetail inputOrderDetailData() {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("=== Input Order Detail Data ===");
                    System.out.print("ID Order Detail: ");
                    String IDorderDetail = scanner.nextLine();
                    System.out.print("ID Order: ");
                    String IDorder = scanner.nextLine();
                    System.out.print("Nama Menu: ");
                    String namaMenu = scanner.nextLine();
                    System.out.print("ID Menu: ");
                    String IDmenu = scanner.nextLine();
                    System.out.print("Price: ");
                    String Price = scanner.nextLine();
                    System.out.print("Kuantitas: ");
                    String QTY = scanner.nextLine();
                    System.out.println("Tax");
                    String tax = scanner.nextLine();
                    System.out.print("Total Price: ");
                    String totalPrice = scanner.nextLine();
                    scanner.nextLine(); // Discard the newline character

                    OrderDetail newOrderDetail = new OrderDetail(IDorderDetail,IDorder ,namaMenu , IDmenu, Price, QTY, tax, totalPrice);

                    for (int i = 0; i < orderDetail.length; i++) {
                        if (orderDetail[i] == null) {
                            orderDetail[i] = newOrderDetail;
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
                                System.out.println("Name: " + user[j].getName());
                                System.out.println("Username: " + user[j].getUsername());
                                System.out.println("Email: " + user[j].getEmail());
                                System.out.println("Password: " + user[j].getPassword());
                                System.out.println("Phone Number: " + user[j].getPhoneNumber());
                                System.out.println("Date of Birth: " + user[j].getDateOfBirth());
                                System.out.println("Address : " + user[j].getAddress());
                            }
                    }

                    for (int j = 0; j < menu.length; j++) {
                            if (menu[j] != null) {
                                System.out.println("Menu[" + j + "]:");
                                System.out.println("Food Name: " + menu[j].getNamaItem());
                                System.out.println("Drink Name: " + menu[j].getIdItem());
                                System.out.println("Dessert Name: " + menu[j].getCategory());
                                System.out.println("Price: " + menu[j].getPrice());
                                System.out.println("Description: " + menu[j].getDescription());
                            }
                    }

                    for (int j = 0; j < order.length; j++) {
                            if (order[j] != null) {
                                System.out.println("Order[" + j + "]:");
                                System.out.println("Nama Restoran : " + order[j].getNamaRestoran());
                                System.out.println("Alamat Restoran: " + order[j].getAlamatRestoran());
                                System.out.println("Nama Pengguna: " + order[j].getNamaPengguna());
                                System.out.println("ID Pemesanan : " + order[j].getIdPemesanan());
                                System.out.println("Tanggal: " + order[j].getTanggalPembelian());
                                System.out.println("Jam: " + order[j].getJamPembelian());
                            }
                    }

                    for (int i = 0; i < orderDetail.length; i++) {
                            if (orderDetail[i] != null) {
                                System.out.println("Order Detail[" + i + "]:");
                                 System.out.println("ID Order Detail : " + orderDetail[i].getIDorderDetail());
                                System.out.println("ID order: " + orderDetail[i].getIDorder());
                                System.out.println("Nama Menu : " + orderDetail[i].getNamaMenu());
                                System.out.println("ID menu: " + orderDetail[i].getIDmenu());
                                System.out.println("Price: " + orderDetail[i].getPrice());
                                System.out.println("Qty : " + orderDetail[i].getQTY());
                                System.out.println("Tax: " + orderDetail[i].getTax());
                                System.out.println("Total price: " + orderDetail[i].getTotalPrice());
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
    }
}
