package rockPaperScissors;

public class RockPaperScissors {
	
	// Ignore this line
	static final ScannerWrapper sc = new ScannerWrapper();

    public static void main(String[] args) {
        sc.reset();
        // TODO: Implement Rock Paper Scissors
    }

    /**
     * Reads input from console with given prompt
     * @param prompt
     * @return string input answer from user
     */
    public static String readInput(String prompt) {
        System.out.println(prompt);
        String userInput = sc.get().nextLine();
        return userInput;
    }

}
