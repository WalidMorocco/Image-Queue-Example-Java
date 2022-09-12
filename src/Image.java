
public class Image {
	// Attributes
	public String name;
	public int resolution;
	
	// Empty constructor
	public Image() {
		
	}
	
	// Constructor with attribute fields
	public Image(String name, int resolution) {
		super();
		this.name = name;
		this.resolution = resolution;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getResolution() {
		return resolution;
	}

	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
}
