public class Female extends Human implements Hormones {
    double testosteroneValue;
    double estrogenValue;
    double prolactinValue;



    public Female(String name, int age, double dophaminValue, double testosteroneValue, double estrogenValue, double prolactinValue) {
        super(name, age, dophaminValue);
        this.testosteroneValue = testosteroneValue;
        this.estrogenValue = estrogenValue;
        this.prolactinValue = prolactinValue;
    }

    public String getDophaminValue() {
        if (dophaminValue > 3 && dophaminValue < 25) {
            return "its ok";
        }
        return "u dont want to live, am i right?";
    }

    @Override
    public String testosteroneLevel() {
        if (this.testosteroneValue < 2.5) {
            return "normas)";
        }
        return "who r u warrior?";
    }

    @Override
    public String estrogenLevel() {
        if (this.estrogenValue > 45.5 && this.estrogenValue < 61.1) {
            return "u r ok";
        }
        return "sister, its very bad, go to doctor";
    }

    @Override
    public String prolactinLevel() {
        if (this.prolactinValue > 6.7 && this.prolactinValue < 14.4) {
            return "u r ok";
        }
        return "sister, its very bad, go to doctor";
    }
}
