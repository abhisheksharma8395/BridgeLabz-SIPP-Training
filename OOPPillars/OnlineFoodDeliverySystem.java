package OOPPillars;

// Discountable Interface
interface Discountable {
    void applyDiscount(double percent);
    String getDiscountDetails();
}

// Abstract FoodItem class
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: ₹" + price);
        System.out.println("Quantity: " + quantity);
    }

    // Getters (encapsulation)
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    protected void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

// VegItem class
class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity(); // No additional charge
    }

    public void applyDiscount(double percent) {
        double discount = getPrice() * percent / 100;
        setPrice(getPrice() - discount);
    }

    public String getDiscountDetails() {
        return "Veg item eligible for up to 10% discount.";
    }
}

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        double baseTotal = getPrice() * getQuantity();
        double nonVegCharge = baseTotal * 0.10; // 10% extra for non-veg
        return baseTotal + nonVegCharge;
    }

    public void applyDiscount(double percent) {
        double discount = getPrice() * percent / 100;
        setPrice(getPrice() - discount);
    }

    public String getDiscountDetails() {
        return "Non-Veg item eligible for up to 5% discount.";
    }
}

// Main class
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] items = new FoodItem[2];

        items[0] = new VegItem("Paneer Butter Masala", 180, 2);
        items[1] = new NonVegItem("Chicken Biryani", 250, 2);

        for (FoodItem item : items) {
            item.getItemDetails();

            // Apply discount
            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                System.out.println(d.getDiscountDetails());
                if (item instanceof VegItem) {
                    d.applyDiscount(10); // apply 10% discount
                } else {
                    d.applyDiscount(5); // apply 5% discount
                }
            }

            double total = item.calculateTotalPrice();
            System.out.println("Total Price (after discount & charges): ₹" + total);
            System.out.println("--------------------------------------");
        }
    }
}
