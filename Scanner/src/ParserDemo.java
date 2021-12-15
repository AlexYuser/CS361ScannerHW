public class ParserDemo {

	public static void main(String[] args) {

		// TO COMPLETE
		// Change the path!
		//TokenStream tStream = new TokenStream("C:\\\\Users\\\\cscharff\\\\eclipse-workspace\\\\ScannerSolution\\\\src\\\\prog1.jay");
		TokenStream tStream = new TokenStream("C:\\\\Users\\\\alexy\\\\eclipse-workspace\\\\Scanner\\\\src\\\\prog1.kay");
		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		Program p = cSyntax.program();
		System.out.println(p.display());
	

	}

}