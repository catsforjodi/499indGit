
public class Compliments {
	public static String compliments() {
		String adjectives[] = {"kind","cool","fun","gamer","like a giant badger"};
		String compliment = "You are so very " + adjectives[(int)Math.random()*adjectives.length];
		return compliment;
	}
}
