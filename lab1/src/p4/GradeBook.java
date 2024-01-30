package p4;

import java.util.Vector;

import pp1.Student;

public class GradeBook {
	static public Vector<Student> students = new Vector<Student>();
	private double average = 0;
	private String lowGradeName, maxGradeName;
	private int minId, maxId;
	private int min = 101, max = -1;
	private static int count = 0;
	private static int id = 1;
	Student minS, maxS;

	public static void addStudent(String name, int grade) {
		students.add(new Student(name, grade, id));
		count++;
		id++;
	}

	public String displayMessage(Course2 course) {
		String message = "Welcome to grade book for " + course.toString() + "\n";
		return message;
	}

	public double determineAverageGrade() {
		for(Student curStudent: students) {
			average += curStudent.getScore();
		}
		return average/count;
	}

	public int determineMin() {
		for(Student curStudent : students) {
			if(curStudent.getScore()<min) {
				min = curStudent.getScore();
				minS = curStudent;
			}
		}
		return min;
	}

	public int determineMax() {
	    for (Student curStudent : students) {
	        if (curStudent.getScore() > max) {
	            max = curStudent.getScore();
	            maxS = curStudent;
	        }
	    }
	    return max;
	}


	public void printBarChart() {
		System.out.print("Grades distribution: \n");
		for(int i = 0; i<100; i+=10) {
			String star = "";
			for(Student curStudent: students) {
				if(curStudent.getScore() >= i && curStudent.getScore() <= i+9) {
					star += "*";
				}
			}
			System.out.print(i + "-" + (i+9) + ":  " + star + "\n");
		}
		String star ="";
		for (Student curStudent: students) {
			if (curStudent.getScore() == 100) {
				star += "*";
			}
		}
		System.out.println(100 + ":" + star);
	}

	public String gradeReport() {
		String answer = "Class average is "+ determineAverageGrade()+"."+ " Lowest grade is "+ determineMin()+"("+minS.getName()+" ID "+minS.getId()+ ")"+"."+"\n"+ "Highest grade is " + determineMax()+"("+maxS.getName()+" ID "+maxS.getId()+")" + "\n";
		return answer;
	}
}
