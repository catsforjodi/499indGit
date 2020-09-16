
public class PetName {
	//street = street you grew up on
	//weather = weather it was yesterday
	//feces = number of times you stepped in poop, any feces.
	public static String petName(String street, String weather, int feces) {
		return weather + " " + street + "tonson " + feces;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = petName("Chetwynd", "Smokey", 2);
		System.out.println("My next cat's name will be " + name);
	}

}
