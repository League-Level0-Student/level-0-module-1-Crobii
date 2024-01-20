package _05_for_loops._2_badgers;

public class Badgers {

	public static void main(String[] args) {
		for (int verse = 0; verse < 2; verse += 1) {
			for (int badgers = 0; badgers < 12; badgers += 1) {
				System.out.print("Badgers ");
			}
			System.out.println();
			for(int mushroom = 0; mushroom < 2; mushroom += 1) {
				System.out.print("mushroom ");
			}
			System.out.println();
		}
		System.out.print("A snake!");
	}
}