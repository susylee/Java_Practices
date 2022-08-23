
public class Bed {

	private String type;
	private int pillows;
	private int height;
	private int sheets;
	private int quiltType;


	public Bed(String type, int pillows, int height, int sheets, int quiltType) {
		super();
		this.type = type;
		this.pillows = pillows;
		this.height = height;
		this.sheets = sheets;
		this.quiltType = quiltType;
	}

	public void make() {
		System.out.println("the bed is being made.");
		System.out.print("Bed -> Making | "); 
	}

	public String getType() {
		return type;
	}

	public int getPillows() {
		return pillows;
	}

	public int getHeight() {
		return height;
	}

	public int getSheets() {
		return sheets;
	}

	public int getQuiltType() {
		return quiltType;
	}


}
