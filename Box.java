/**
 * 
 * @author Tara Weinreb
 *
 * Java 212 Lab B - Professor Ni
 */
public class Box {
	//instance variables
	private int length; 
	private int width;
	private int height;

	public Box() {// default constructor
		length = 1;
		width = 1;
		height = 1;

	}

	public Box(int l, int w, int h) { //constructor w 3 parameters
		if(l < 1||w < 1||h < 1) throw new IllegalArgumentException("Values less than 1 not allowed");
		length = l;
		width = w;
		height = h;
	}
	
	//set methods
	public void setLength(int l) { 
		if(l<1) throw new IllegalArgumentException("Values less than 1 not allowed");
		length = l;
	}

	public void setWidth(int l) {
		if(l<1) throw new IllegalArgumentException("Values less than 1 not allowed");
		width = l;
	}

	public void setHeight(int l) {
		if(l<1) throw new IllegalArgumentException("Values less than 1 not allowed");
		height = l;
	}
	//get methods
	public int getLength() {
		return this.length;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}
	//method to calculate the volume
	public int volume() {
		int volume = length * width * height;
		return volume;
	}
	//override the equals method
	public boolean equals(Box a) {
		if (this.length == a.length && this.width == a.width && this.height == a.height)
			return true;
		return false;
	}
	//override the tostring method
	public String toString() {
	String s= "L:"+length+" W:"+width+" H:"+height+" (V:"+volume()+")";
	return s;
	}
}
