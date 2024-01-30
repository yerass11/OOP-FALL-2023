package p2;

public class main {

	public static void main(String[] args) {

        Phone phone1 = new Phone("iPhone 15", 2023, 1199.99);
        Phone phone2 = new Phone("Galaxy S21", 2021, 699.99);
        Phone phone3 = new Phone("Pixel 6", 2021);

        phone1.displayPhoneInfo(true);
        phone2.displayPhoneInfo();
        phone3.displayPhoneInfo(false);

        System.out.println("Total phones in stock: " + Phone.getPhoneCount());
    }
}