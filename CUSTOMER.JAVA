public class Customer {
 protected int id;
 protected String name;
 protected String email;
 public Customer(int id, String name, String email) {
 this.id = id;
 this.name = name;
 this.email = email;
 }
 public int getId() { return id; }
 public String getName() { return name; }
 public String getEmail() { return email; }
 @Override
public String toString() {
 return name + " (ID: " + id + ")";
 }
}
