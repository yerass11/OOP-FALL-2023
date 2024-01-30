package p5;

public class main {

	public static void main(String[] args) {
		DragonLaunch dragonLaunch = new DragonLaunch();

		System.out.println("BBBG: ");
        dragonLaunch.kidnap(new Person(Gender.GIRL));
        dragonLaunch.kidnap(new Person(Gender.BOY));
        dragonLaunch.kidnap(new Person(Gender.GIRL));
        dragonLaunch.kidnap(new Person(Gender.BOY));

        System.out.println("Dragon will eat?");
        System.out.println(dragonLaunch.willDragonEatOrNot());
	}

}
