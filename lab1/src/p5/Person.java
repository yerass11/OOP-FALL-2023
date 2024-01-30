package p5;

class Person {
    private Gender gender;
    public Person(Gender gender) {
        this.gender = gender;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return gender.toString();
    }
}
