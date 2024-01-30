public class Main {
    public static void main(String[] args) {
        // name, age, dophamin, testosterone, estrogen, prolactin
        Male male = new Male("Yerassyl", 18, 35.3, 15.7, 17.3, 4.2);

        System.out.println(male.testosteroneLevel());
        System.out.println(male.getDophaminValue());

        if (male.hasBeard()) {
            System.out.println("U have beard");
        } else {
            System.out.println("Kose");
        }

        System.out.println();
        System.out.println();

        Female female = new Female("Aiym", 20, 2.7, 5.7, 69, 10.1);

        System.out.println(female.getDophaminValue());
        System.out.println(female.testosteroneLevel());
        System.out.println(female.estrogenLevel());
        System.out.println(female.prolactinLevel());

    }
}
