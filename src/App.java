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
                    System.out.println("==== Wonderlust Cafe ====");
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
                User.add(new User("Evelline Christine", "eve.chris", "eve@gmail.com", "123456", "08123456789", "5/2/2002", "jl.medan", order));
                User.add(new User("Tyne Theodora", "tyne.theo", "tyne.theo@gmail.com", "123456", "08123456789", "20/10/2004", "Citra Garden", order));
                User.add(new User("Kayla Namira", "kayla.nmr", "kaylanmr@gmail.com", "123456", "08123456789", "13/6/2000", "Tasbi", order));

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
                Order.add(new Order("03081221", "Wonderlust Cafe", "Medan Polonia", "kayla.nmr", "11/11/2023", orderDetail));
                Order.add(new Order("03081222", "Wonderlust Cafe", "Medan Polonia", "tyne.theo", "5/6/2023", orderDetail));
                Order.add(new Order("03081223", "Wonderlust Cafe", "Medan Polonia", "eve.chris", "23/11/2023", orderDetail));
            }
        

            public static void inputUserData() {
                String name, username, email, password, phoneNumber, dateOfBirth, address;

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

                user.add(new User(name, username, email, password, phoneNumber, dateOfBirth, address, order));

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
                String idOrder, namaRestoran, alamatRestoran, userName, orderDate;
     
                System.out.print("Id Order \t: ");
                idOrder = input.nextLine();      
                System.out.print("Nama Restoran \t: ");
                namaRestoran = input.nextLine();
                System.out.print("Alamat Restoran : ");
                alamatRestoran = input.nextLine();
                System.out.print("Nama Pelanggan \t: ");
                userName = input.nextLine();
                System.out.print("Order Date \t: ");
                orderDate = input.nextLine();

                order.add(new Order(idOrder, namaRestoran, alamatRestoran, userName, orderDate, orderDetail));

                System.out.println("Menu data has been input.");
            }

            public static void inputOrderDetailData() {
                String idOrderDetail, idOrder, menu, idMenu, price, qty, tax, totalPrice;

                System.out.print("Id Order Detail : ");
                idOrderDetail = input.nextLine();
                System.out.print("Id Order: ");
                idOrder = input.nextLine();
                System.out.print("Menu: ");
                menu = input.nextLine();
                System.out.print("Id Menu: ");
                idMenu = input.nextLine();
                System.out.println("Price");
                price = input.nextLine();
                System.out.print("QTY: ");
                qty = input.nextLine();
                System.out.println("Tax");
                tax = input.nextLine();
                System.out.print("Total Price: ");
                totalPrice = input.nextLine();

                OrderDetail.add(new OrderDetail(idOrderDetail, null, null, null, null, null, null, null));

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