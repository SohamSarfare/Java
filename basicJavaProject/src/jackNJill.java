public class jackNJill {

	public static void main(String[] args) {
		double areaPaintedJack = 3.0;
		double timeTakenJack = 5.0;
		
		double areaPaintedJenny = 7.0;
		double timeTakenJenny = 15.0;
		
		double areaPaintedTogether = areaPaintedJack/timeTakenJack + areaPaintedJenny/timeTakenJenny;
		double totalTimeTaken = 56/areaPaintedTogether;
		
		System.out.println("Both of them working together will take"+totalTimeTaken+" hours to paint the area");
	}
}
