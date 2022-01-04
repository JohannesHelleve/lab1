package rockPaperScissors;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Wrapper class for java.util.Scanner.
 * Added reset method to manage IO testing with use of Scanner.
 * 
 * @author Sondre Bolland
 *
 */
public class ScannerWrapper {
	
	private Scanner sc;
	
	public ScannerWrapper() {
		this.sc = new Scanner(System.in);
	}

	public void reset() {
		sc = new Scanner(System.in);
	}
	
	public Scanner get() {
		return sc;
	}
}
