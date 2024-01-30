package p5;
//import p5.Person;
import java.util.*;
//class Person {
//    private Gender gender;
//    public Person(Gender gender) {
//        this.gender = gender;
//    }
//    public Gender getGender() {
//        return gender;
//    }
//    public void setGender(Gender gender) {
//        this.gender = gender;
//    }
//
//    @Override
//    public String toString() {
//        return gender.toString();
//    }
//}
public class DragonLaunch {
	private Gender gender;
	Person per = new Person(gender);
	private Vector <Person> kidnappedPeople;
	
	public DragonLaunch() {
		kidnappedPeople = new Vector<>();
	}
	public void kidnap(Person person) {
		kidnappedPeople.add(person);
	}
	public String willDragonEatOrNot() {
        int count = kidnappedPeople.size();
        int left = kidnappedPeople.size()/2 - 1;
        int right = kidnappedPeople.size()/2;
        
        while(left >= 0 && right <= kidnappedPeople.size() - 1){
            if(kidnappedPeople.get(left).toString().equals("BOY") && kidnappedPeople.get(right).toString().equals("GIRL")){
                count -= 2;
            }
            left--;
            right++;
        }
        
        if(count == 0)
            return "Dragon wouldn't eat.";
        return "Dragon will eat " + count + " people.";
    }
}