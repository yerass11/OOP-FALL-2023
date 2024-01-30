public abstract class Human {
    private String name;
    private int age;
    protected double dophaminValue;

    public Human(String name, int age, double dophaminValue) {
        this.name = name;
        this.age = age;
        this.dophaminValue = dophaminValue;
    }

    public abstract String getDophaminValue();

    @Override
    public String toString() {
        return "My name is " + this.name + " and I'm " + this.age + " years old";
    }
}
