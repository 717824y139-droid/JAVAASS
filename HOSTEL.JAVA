package hotelreservation;
import java.util.*;
public class Hotel {
 private List<Room> rooms = new ArrayList<>();
 private List<Customer> customers = new ArrayList<>();
 private List<Booking> bookings = new ArrayList<>();
 public void addRoom(Room room) { rooms.add(room); }
 public void addCustomer(Customer customer) { customers.add(customer); }
 public void displayRooms() {
 rooms.forEach(System.out::println);
}
public void makeReservation(int customerId, int roomNumber, int nights) {
 Customer customer = customers.stream().filter(c -> c.getId() == customerId).findFirst().orElse(null);
 Room room = rooms.stream().filter(r -> r.getRoomNumber() == roomNumber).findFirst().orElse(null);
 if (room != null && customer != null && room.isAvailable()) {
 Booking booking = new Booking(customer, room, nights);
 booking.calculateTotal();
 booking.confirm();
 bookings.add(booking);
 Bill bill = new Bill(booking, 0.10);
 bill.generateBill();
 System.out.println("Reservation Confirmed!");
 bill.displayBill();
 } else {
 System.out.println("Room unavailable or invalid details.");
 }
 }
 public void cancelReservation(int bookingId) {
 for (Booking b : bookings) {
 if (b.getBookingId() == bookingId) {
 b.cancel();
 System.out.println("Reservation cancelled for ID: " + bookingId);
 return;
}
 }
 System.out.println("Booking not found.");
 }
}
