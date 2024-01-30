public class Male extends Human implements Hormones {
    double testosteroneValue;
    double estrogenValue;
    double prolactinValue;

    public Male(String name, int age, double dophaminValue, double testosteroneValue, double estrogenValue, double prolactinValue) {
        super(name, age, dophaminValue);
        this.testosteroneValue = testosteroneValue;
        this.estrogenValue = estrogenValue;
        this.prolactinValue = prolactinValue;
    }

    public String getDophaminValue() {
        if (dophaminValue > 15 && dophaminValue < 45) {
            return "its ok";
        }
        return "u dont want to live, am i right?";
    }

    public boolean hasBeard() {
        if (this.testosteroneValue > 7.9) {
            return true;
        }
        return false;
    }

    @Override
    public String testosteroneLevel() {
        if (this.testosteroneValue < 7.9) {
            return "low level";
        } else if (this.testosteroneValue < 12.9) {
            return "medium level";
        }
        return "high level, u r in BASE, u r SIGMA";
    }

    @Override
    public String estrogenLevel() {
        if (this.estrogenValue < 29.9) {
            return "u r ok";
        }
        return "broo, its very bad, go to doctor";
    }
    @Override
    public String prolactinLevel() {
        if (this.prolactinValue < 6.9) {
            return "u r ok";
        }
        return "broo, its very bad, go to doctor";
    }
}
