
/**
 * @author scharffc
 * 
 */
public class ScannerDemo {

	// Oh! This needs to be changed !
	//private static String file1 = "C:\\Users\\cscharff\\eclipse-workspace\\ScannerSolution\\src\\prog1.jay";
	private static int counter = 1;
	private static String file1 = "C:\\Users\\alexy\\eclipse-workspace\\Scanner\\src\\prog1.kay";

	public static void main(String args[]) {
		TokenStream ts = new TokenStream(file1);
		System.out.println(file1);
		Token tk;
		while (!ts.isEndofFile()) {
			// TO BE COMPLETED
			 tk = ts.nextToken();
			 System.out.println("Token " + counter++ + " - Type: " + tk.getType() + " - Value: " + tk.getValue());
		}
	}
}
