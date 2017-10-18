package be.pxl.lambdaexpressions.opdracht1;

public class Selector {
	
	private NumberMachine machine;
	
	public Selector(NumberMachine machine) {
		super();
		this.machine = machine;
	}
	
	public String showEvenNumbers() {
		NumberFilter lambdaTest = (p) ->{
			if(p % 2 == 0 ) {
				return true;
			}else {
				return false;
			}
		};
		String tekst = machine.processNumbers(lambdaTest);
		return tekst;
	}


}
