public class DisplayValues{
	public static void main(String[] args) {
		String campus = "Polinema";
		int grade = 1, integer = 10;
		char _class = 'H', character = 'C';
		float fractionNumber= 3.33333F;

		System.out.println(String.format("I am a %s student, class "+grade+_class, campus));
		System.out.println("I'm learning to display values:");
		System.out.println("\tInteger " +integer);
		System.out.println(String.format("\tFraction %.2f", fractionNumber));
		System.out.println("\tCharacter " +character);
	}
}