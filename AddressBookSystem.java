import java.io.*;
import java.util.*;

// 👤 Contact class with fields and toString
class Contact implements Serializable {
    private String name;
    private String phone;
    private String email;
    private String address;

    public Contact(String name, String phone, String email, String address) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    // 🛠 Getters
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Phone: " + phone +
                ", Email: " + email +
                ", Address: " + address;
    }
}

// 📒 Generic Address Book
class AddressBook<T extends Contact> {
    private Map<String, T> contacts = new HashMap<>();

    // ➕ Add contact (keyed by phone)
    public void addContact(T contact) {
        contacts.put(contact.getPhone(), contact);
        System.out.println("✅ Contact added: " + contact.getName());
    }

    // ➖ Remove contact
    public void removeContact(String phone) {
        if (contacts.containsKey(phone)) {
            T removed = contacts.remove(phone);
            System.out.println("🗑️ Removed: " + removed.getName());
        } else {
            System.out.println("❌ Contact not found.");
        }
    }

    // 🔍 Search by name
    public void searchByName(String name) {
        boolean found = false;
        for (T contact : contacts.values()) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("🔍 Found: " + contact);
                found = true;
            }
        }
        if (!found) System.out.println("❌ No contact with name: " + name);
    }

    // 🔍 Search by phone
    public void searchByPhone(String phone) {
        T contact = contacts.get(phone);
        if (contact != null) {
            System.out.println("🔍 Found: " + contact);
        } else {
            System.out.println("❌ No contact with phone: " + phone);
        }
    }

    // 📋 List all contacts
    public void listContacts() {
        if (contacts.isEmpty()) {
            System.out.println("📭 No contacts found.");
        } else {
            System.out.println("📒 All Contacts:");
            for (T contact : contacts.values()) {
                System.out.println(contact);
            }
        }
    }

    // 🔃 Sort by name
    public void sortByName() {
        List<T> list = new ArrayList<>(contacts.values());
        list.sort(Comparator.comparing(Contact::getName));
        System.out.println("📚 Sorted by Name:");
        for (T contact : list) System.out.println(contact);
    }

    // 🔢 Sort by phone
    public void sortByPhone() {
        List<T> list = new ArrayList<>(contacts.values());
        list.sort(Comparator.comparing(Contact::getPhone));
        System.out.println("📱 Sorted by Phone:");
        for (T contact : list) System.out.println(contact);
    }

    // 💾 Save to file
    public void saveToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(contacts);
            System.out.println("💾 Contacts saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 📂 Load from file
    public void loadFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            contacts = (Map<String, T>) ois.readObject();
            System.out.println("📂 Contacts loaded from file.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 🤝 Check "has-a" relationship (same address)
    public void checkHasARelationship(T c1, T c2) {
        if (c1.getAddress().equalsIgnoreCase(c2.getAddress())) {
            System.out.println("🤝 " + c1.getName() + " and " + c2.getName() + " live at the same address.");
        } else {
            System.out.println("🚫 No address relationship found.");
        }
    }
}

// 🚀 Main class to test the Address Book
public class AddressBookSystem {
    public static void main(String[] args) {
        AddressBook<Contact> book = new AddressBook<>();

        Contact c1 = new Contact("Alice", "111", "alice@example.com", "123 Street");
        Contact c2 = new Contact("Bob", "222", "bob@example.com", "456 Avenue");
        Contact c3 = new Contact("Charlie", "333", "charlie@example.com", "123 Street");

        book.addContact(c1);
        book.addContact(c2);
        book.addContact(c3);

        System.out.println();
        book.listContacts();
        System.out.println();

        book.searchByName("Bob");
        book.searchByPhone("111");
        System.out.println();

        book.sortByName();
        System.out.println();
        book.sortByPhone();
        System.out.println();

        book.checkHasARelationship(c1, c3);
        book.checkHasARelationship(c1, c2);
        System.out.println();

        // File I/O
        book.saveToFile("contacts.ser");
        book.loadFromFile("contacts.ser");
        System.out.println();
        book.listContacts();
    }
}
