package p2;

public class Phone {
    private final String model;
    private final int year;
    private final double price;
    private static int phoneCount = 0;

    {
        phoneCount++;
    }

    public Phone(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Phone(String model, int year) {
        this(model, year, 0.0); 
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }


    public double getPrice() {
        return price;
    }

    public static int getPhoneCount() {
        return phoneCount;
    }

    public void displayPhoneInfo() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Year: " + this.getYear());
        System.out.println("Price: $" + this.getPrice());
    }

    public void displayPhoneInfo(boolean includePrice) {
        if (includePrice) {
            displayPhoneInfo();
        } else {
            System.out.println("Model: " + this.getModel());
            System.out.println("Year: " + this.getYear());
        }
    }
}