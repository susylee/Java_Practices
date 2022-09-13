
public class Printer {
	private int tonerLevel;
	private int pagesPrinted = 0;
	private boolean duplex;

	public Printer(int tonerLevel, boolean duplex) {
		super();
		if(tonerLevel>-1 && tonerLevel<=100) {
			tonerLevel = -1;
		} else {
			this.tonerLevel = tonerLevel;
		}
		this.duplex = duplex;
	}

	public int addToner(int tonerAmount) {
		if(tonerAmount>0 && tonerAmount <=100)  {
			if ((tonerLevel + tonerAmount) > 100) {
				return -1;
			} else {
				tonerLevel += tonerAmount;
				return tonerLevel;
			}
		}
		return -1;
	}

	/*
	 * printPages will accept one parameter, pages of type int. A variable called pagesToPrint should be created 
and initialized to the value of the incoming parameter.  
 A conditional check should be performed on whether the Printer class field, duplex, is either "true" or "false".
 If "true" then a calculation must be performed to determine the number of pages needed to print the job double sided. 
The pagesToPrint value is then added to the class field pagesPrinted, 
but the value of pagesToPrint should be returned by the method.
	 */

	public int printPages(int pages) {
		int pagesToPrint = pages;
		if(this.duplex) {
			pagesToPrint /=2;
			System.out.println("Printing in duplex mode");
		}
		this.pagesPrinted += pagesToPrint;
		return pagesToPrint;
		//pagesToPrint = (pages/2) + (pages%2);
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}
}
