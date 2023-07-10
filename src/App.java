import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

import model.Order;
import model.Payment;
import model.OrderDetail;
import model.User;
import model.Menu;
import java.util.NoSuchElementException;


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
                    try{
                    System.out.println("╔════════════════════════════════════════════════════╗");
                    System.out.println("║                Welcome to Wonderlust Cafe          ║");
                    System.out.println("╟────────────────────────────────────────────────────╢");
                    System.out.println("║ 1. Input User Data                                 ║");
                    System.out.println("║ 2. Input Menu Data                                 ║");
                    System.out.println("║ 3. Input Order Data                                ║");
                    System.out.println("║ 4. Input Payment Data                              ║");
                    System.out.println("║ 5. Input Order Detail Data                         ║");
                    System.out.println("║ 6. Display Data                                    ║");
                    System.out.println("║ 0. Exit                                            ║");
                    System.out.println(" ────────────────────────────────────────────────────");
                    System.out.println("Please choose a menu:                               ");

                    choice = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character

                switch (choice) {
                    case 0:
                        exit = true;
                        System.out.println("╔══════════════════════════════════════════════╗");
                        System.out.println("║             Thank you for visiting           ║");
                        System.out.println("║                Wonderlust Cafe!              ║");
                        System.out.println("╚══════════════════════════════════════════════╝");
                        break;
                    case 1:
                        inputUserData();
                        System.out.println("╔══════════════════════════════════════════════╗");
                        System.out.println("║        User Data has been successfully       ║");
                        System.out.println("║                 inputted!                    ║");
                        System.out.println("╚══════════════════════════════════════════════╝");
                        break;
                    case 2:
                        inputMenuData();
                        System.out.println("╔══════════════════════════════════════════════╗");
                        System.out.println("║        Menu Data has been successfully       ║");
                        System.out.println("║                 inputted!                    ║");
                        System.out.println("╚══════════════════════════════════════════════╝");
                        break;
                    case 3:
                        inputOrderData();
                        System.out.println("╔══════════════════════════════════════════════╗");
                        System.out.println("║        Order Data has been successfully      ║");
                        System.out.println("║                 inputted!                    ║");
                        System.out.println("╚══════════════════════════════════════════════╝");
                        break;
                    case 4:
                        inputPaymentData();
                        System.out.println("╔══════════════════════════════════════════════╗");
                        System.out.println("║      Payment Data has been successfully      ║");
                        System.out.println("║                 inputted!                    ║");
                        System.out.println("╚══════════════════════════════════════════════╝");
                        break;
                    case 5:
                        inputOrderDetailData();
                        System.out.println("╔══════════════════════════════════════════════╗");
                        System.out.println("║    Order Detail Data has been successfully   ║");
                        System.out.println("║                 inputted!                    ║");
                        System.out.println("╚══════════════════════════════════════════════╝");
                        break;
                    case 6:
                        displayData();
                        System.out.println("╔══════════════════════════════════════════════╗");
                        System.out.println("║      Data has been successfully displayed!   ║");
                        System.out.println("╚══════════════════════════════════════════════╝");
                        break;
                    default:
                        System.out.println("╔══════════════════════════════════════════════╗");
                        System.out.println("║        Invalid choice. Please try again.     ║");
                        System.out.println("╚══════════════════════════════════════════════╝");
                        break; // Restart the loop
                }

                    
                    System.out.println(); 

                } catch (NoSuchElementException e) {
                    System.out.println("Invalid input. Please try again.");
                    scanner.nextLine(); // consume the invalid input
                    continue; // Restart the loop
                }
                
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
                Payment.add(new Payment("0908777", "200.000", "Cash", "5/6/2023", "Completed", order.get(0)));
                Payment.add(new Payment("0908666", "350.000", "Bank Transfer", "13/6/2023", "Failed", order.get(2)));
                Payment.add(new Payment("0908555", "480.000", "OVO", "29/6/2023", "Completed", order.get(3)));

                OrderDetail[] od = new OrderDetail[350];
                //String idOrderDetail , Order idOrder , Menu menu, Menu idMenu,int price , int qty , int tax,int totalPrice 
                OrderDetail.add(new OrderDetail("KNY758IJGH", order.get(0), menu.get(0) , 1));
                OrderDetail.add(new OrderDetail("DNY48UFJ57", order.get(1), menu.get(2), 1));
                OrderDetail.add(new OrderDetail("POG648HFYT", order.get(3), menu.get(3),1 ));
                
                Order[] ordr = new Order[350];
                Order.add(new Order("03081221", "Wonderlust Cafe", "Medan Polonia", "kayla.nmr", "11/11/2023", orderDetail));
                Order.add(new Order("03081222", "Wonderlust Cafe", "Medan Polonia", "tyne.theo", "5/6/2023", orderDetail));
                Order.add(new Order("03081223", "Wonderlust Cafe", "Medan Polonia", "eve.chris", "23/11/2023", orderDetail));
            }
        
            //public static Order cariOrder (String orderId){
                //cari order berdasarkan orderid
              //  for (Order order2 : order) {
                //    if(order2.getIdOrder().equals(orderId)){
                  //      return order2;
                    //}
                //}
               // return null;
            //}

            public static Menu cariMenu (String idMenu){
                for (Menu menu2 : menu) {
                    if(menu2.getMenu().equals(idMenu)){
                        return menu2;
                    }
                }
                return null;
            }

            //private static Order findOrderById(String idOrder) {
              //  return null;
            //}
            
            //cari order berdasarkan orderid
            public static Order cariOrder (String idOrder){
                for (Order order2 : order) {
                    if(order2.getIdOrder().equals(idOrder)){
                        return order2;
                    }
                }
                return null;
            }
            
            public static Order findOrderById(String idOrder) {
                for (Order order : order) {
                    if (order.getIdOrder().equals(idOrder)) {
                        return order;
                    }
                }
                return null;
            }

            public static Menu findMenuById(String idMenu) {
                for (Menu menu : menu) {
                    if (menu.getIdMenu().equals(idMenu)) {
                        return menu;
                    }
                }
                return null;
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
                
                while (true) {
                    try {
                        System.out.print("Price \t\t: ");
                        price = input.nextInt();
                        input.nextLine(); // consume the newline character
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid price.");
                        input.nextLine(); // consume the invalid input
                    }
                }
                
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
                    String idOrderDetail, idOrder, menu;
                    int qty, totalPrice;

                    System.out.print("Id Order Detail : ");
                    idOrderDetail = input.nextLine();
                    System.out.print("Id Order \t: ");
                    idOrder = input.nextLine();
                    System.out.print("ID Menu \t: ");
                    menu = input.nextLine();

                    while (true) {
                        try {
                            System.out.print("QTY \t\t: ");
                            qty = input.nextInt();
                            input.nextLine(); // consume the newline character
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid quantity.");
                            input.nextLine(); // consume the invalid input
                        }
                    }

                    while (true) {
                        try {
                            System.out.print("Total Price \t: ");
                            totalPrice = input.nextInt();
                            input.nextLine(); // consume the newline character
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid total price.");
                            input.nextLine(); // consume the invalid input
                        }
                    }

                    OrderDetail.add(new OrderDetail(idOrderDetail, cariOrder(idOrder), cariMenu(menu), qty));

                    System.out.println("Order detail data has been input.");
                }

            public static void inputPaymentData() {
                String idPayment, amount, paymentMethod, transactionDate, status, idOrder;

                System.out.print("Id Payment \t: ");
                idPayment = input.nextLine();
                System.out.print("Amount \t\t: ");
                amount = input.nextLine();
                System.out.print("Payment Method \t: ");
                paymentMethod = input.nextLine();
                System.out.print("Transaction Date: ");
                transactionDate = input.nextLine();
                System.out.print("Status \t\t: ");
                status = input.nextLine();
                System.out.print("Id Order \t: ");
                idOrder = input.nextLine();

                Order order = findOrderById(idOrder);

                if (order != null) {
                    payment.add(new Payment(idPayment, amount, paymentMethod, transactionDate, status, order));
                System.out.println("Payment data has been input.");
                } else {
                    System.out.println("Order not found. Please check the provided ID.");
                }
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