package pp1;

public class Student {

    private String name;
    private String id;
    private int yearOfStudy;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 2;
    }

    public Student(String name2, int grade, int id2) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void incrementYearOfStudy() {
        yearOfStudy++;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Yerassyl", "22030286");
        Student student2 = new Student("Nurdaulet", "22909021");
        Student student3 = new Student("Aidyn", "22233246");
        Student student4 = new Student("Rinat", "22035065");
        Student student5 = new Student("Farabi", "12030329");
        Student student6 = new Student("Azamat", "22035954");

        System.out.println("Name: " + student1.getName());
        System.out.println("ID: " + student1.getId());
        System.out.println("Year of Study: " + student1.getYearOfStudy());

        student1.incrementYearOfStudy();
        System.out.println("New Year of Study: " + student1.getYearOfStudy());
    }

}

