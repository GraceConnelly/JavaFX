package sample;

/**
 * Created by graceconnelly on 1/3/17.
 */
public class Contact {
//    Create a class called Contact to store a name, phone, and email (all strings).
//    Override the toString method so it prints the contact like "Alice Smith, 814-867-5309, alice@theironyard.com".
//    Create a data structure for your Contact objects in Controller.java.
//            ObservableList<Contact> contacts = FXCollections.observableArrayList();
    private String name;
    private String phone;
    private String email;


    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s\n", name, phone, email);
    }
}
