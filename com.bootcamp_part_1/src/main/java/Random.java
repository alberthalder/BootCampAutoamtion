import java.util.Random;

public class Random{
		
    public static void main(String[] args) {
        Random rand = new Random();
        int upperbound = 100;
        int int_random = rand.nextInt(upperbound) + 1;
        System.out.println("Random number between 1 and " + upperbound + ": " + int_random);
    }

	private int nextInt(int upperbound) {
		// TODO Auto-generated method stub
		return 0;
	}
}
