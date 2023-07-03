import java.util.Scanner;
import java.util.ArrayList;
import model.Order;
import model.Payment;
import model.OrderDetail;
import model.User;
import model.Menu;

public class App {
    static ArrayList<User> user = new ArrayList<User>();
    static ArrayList<Menu> menu = new ArrayList<Menu>();
    static ArrayList<Order> order = new ArrayList<Order>();
    static ArrayList<OrderDetail> orderDetail = new ArrayList<OrderDetail>();
    static ArrayList<Payment> payment = new ArrayList<Payment>();
    static Scanner input = new Scanner(System.in);
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
                    
                    System.out.println(); 
                } while (!exit);
                
                scanner.close();
            }

            public static void init(){

                User[] usr = new User[350];
                User.add(new User("Evelline Christine", "eve", "eve@gmail.com", "123456", "081234567891", "01-02-02", "jl.medan", null));
                User.add(new User("Tyne Theodora", "tyne.theo", "tyne.theo@gmail.com", "123456", "081234567891", "01-02-02", "citra garden", null));
                User.add(new User("Kayla Namira", "kayla1", "kylnmr@gmail.com", "123456", "081234567891", "01-02-02", "tasbih", null));

                Menu[] mn = new Menu[350];
                Menu.add(new Menu("F1", "Pizza", "Main Course", 90000, "Meat Lovers with Cheesy Bites"));
                Menu.add(new Menu("F2", "Waffle", "Dessert", 50000, "Classic Waffle with Maple Syrup"));
                Menu.add(new Menu("F3", "Soup", "Appetizer", 35000, "Mushroom Soup"));

                Payment[] pymnt = new Payment[350];
                Payment.add(new Payment("0908777", "200.000", "Cash", "5/6/2023", "Completed", "9080777"));
                Payment.add(new Payment("0908666", "350.000", "Bank Transfer", "13/6/2023", "Failed", "9080666"));
                Payment.add(new Payment("0908555", "480.000", "OVO", "29/6/2023", "Completed", "9080555"));

                OrderDetail[] od = new OrderDetail[350];
                OrderDetail.add(new OrderDetail("KNY758IJGH", null, null, null, 30000, 1, 3000, 33000));
                OrderDetail.add(new OrderDetail("DNY48UFJ57", null, null, null, 40000, 1, 3000, 43000));
                OrderDetail.add(new OrderDetail("ENK86OKG75", null, null, null, 34000, 2, 10000, 69000));
                
                Order[] ordr = new Order[350];
                Order.add(new Order("Online Order", "Polonia Medan", "TyneTheodora", "1220028", "11 November 2023", "11:11"));
                Order.add(new Order("Online Order", "Polonia Medan", "Kayla Nmr", "1220026", "24 Juni 2023", "20:45"));
                Order.add(new Order("Online Order", "Polonia Medan", "Evelline", "1220027", "13 Agustus 2023", "12:05"));
            }
        

            public static void inputUserData() {
                String name, username, email, password, phoneNumber, dateOfBirth, address, idOrder;

                System.out.print("Name \t\t: ");
                name = input.nextLine();
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
                System.out.print("Id Order \t: ");
                idOrder = input.nextLine();

                user.add(new User(name, username, email, password, phoneNumber, dateOfBirth, address, null));

                System.out.println("Menu data has been input.");
            }  

            public static void inputMenuData() {
                String idMenu, namaMenu, category, description;
                int price;

                System.out.print("Id Menu \t: ");
                idMenu = input.nextLine();
                System.out.print("Nama Menu \t: ");
                namaMenu = input.nextLine();
                System.out.print("Category \t: ");
                category = input.nextLine();
                System.out.print("Price \t: ");
                price = input.nextInt();
                input.nextLine(); 
                System.out.print("Description \t: ");
                description = input.nextLine();

                menu.add(new Menu(idMenu, namaMenu, category, null, description));

                System.out.println("Menu data has been input.");
            }

            public static void inputOrderData() {
                String namaRestoran, alamatRestoran, namaPelanggan, idPemesanan, tanggalPembelian, jamPembelian;
                
                System.out.print("Nama Restoran \t: ");
                namaRestoran = input.nextLine();
                System.out.print("Alamat Restoran \t: ");
                alamatRestoran = input.nextLine();
                System.out.print("Nama Pelanggan \t: ");
                namaPelanggan = input.nextLine();
                System.out.print("ID Pemesanan \t: ");
                idPemesanan = input.nextLine();
                System.out.print("Tanggal Pembelian \t: ");
                tanggalPembelian = input.nextLine();
                System.out.print("Jam Pembelian \t: ");
                jamPembelian = input.nextLine();

                order.add(new Order(namaRestoran, alamatRestoran, namaPelanggan, idPemesanan, tanggalPembelian, jamPembelian));

                System.out.println("Menu data has been input.");
            }

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

                //OrderDetail.add(new OrderDetail(namamenu, IDmenu, harga, kuantitas, tax, totalHarga));

                System.out.println("Order data has been input.");
            }

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
                }

                public static void displayData() {
                    for (User user : user) {
                        System.out.println(user);
                    }

                    for (Menu menu : menu) {
                        System.out.println(menu);
                    }

                    for (Order order : order) {
                        System.out.println(order);
                    }

                    for (OrderDetail orderDetail : orderDetail) {
                        System.out.println(orderDetail);
                    }

                    for (Payment payment : payment) {
                        System.out.println(payment);
                    }

    }
    
}