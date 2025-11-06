package hotelreservation;
import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 Hotel hotel = new Hotel();
 while (true) {
 System.out.println("\n=== Hotel Reservation System ===");
 System.out.println("1. Add Room");
 System.out.println("2. Add Customer");
 System.out.println("3. Make Reservation");
 System.out.println("4. Cancel Reservation");
 System.out.println("5. Display Rooms");
 System.out.println("6. Exit");
 System.out.print("Choose an option: ");
 int choice = sc.nextInt();
 switch (choice) {
 case 1:
 System.out.print("Enter Room Number: ");
 int num = sc.nextInt();
sc.nextLine();
 System.out.print("Enter Type: ");
 String type = sc.nextLine();
 System.out.print("Enter Price per night: ");
 double price = sc.nextDouble();
 hotel.addRoom(new Room(num, type, price));
 break;
 case 2:
 System.out.print("Enter Customer ID: ");
 int id = sc.nextInt();
 sc.nextLine();
 System.out.print("Enter Name: ");
 String name = sc.nextLine();
 System.out.print("Enter Email: ");
 String email = sc.nextLine();
 System.out.print("Premium Customer? (y/n): ");
 char prem = sc.next().charAt(0);
 if (prem == 'y' || prem == 'Y') {
 hotel.addCustomer(new PremiumCustomer(id, name, email, 0.10));
 } else {
 hotel.addCustomer(new Customer(id, name, email));
 }
 break;
 case 3:
 System.out.print("Enter Customer ID: ");
 int cid = sc.nextInt();
 System.out.print("Enter Room Number: ");
 int rnum = sc.nextInt();
System.out.print("Enter Nights: ");
 int nights = sc.nextInt();
 hotel.makeReservation(cid, rnum, nights);
 break;
 case 4:
 System.out.print("Enter Booking ID to cancel: ");
 int bid = sc.nextInt();
 hotel.cancelReservation(bid);
 break;
 case 5:
 hotel.displayRooms();
 break;
 case 6:
 System.out.println("Thank you! Goodbye.");
 sc.close();
 return;
 default:
 System.out.println("Invalid option!");
} }
}}

