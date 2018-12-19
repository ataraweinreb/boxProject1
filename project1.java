/**
 * 
 * @author Tara Weinreb
 *
 *This is a program that reads information about a Box from a file
 *and displays the information in a graphical user interface. Displays 
 *the information unsorted and sorted.  
 */

import java.util.*;

public class project1 {
	public static void main(String[] args) {
		ArrayList<Box> boxes = new ArrayList<Box>(); //creates a new array list
		TextFileInput file = new TextFileInput("C:\\Users\\atara\\Desktop\\Project1.txt");
		String line = file.readLine(); //reads in the next line
		while (line != null) { //if the line is not empty then separate it with the string tokenizer
			StringTokenizer copyLine = new StringTokenizer(line, ",");// Separates each line whenever it sees a cama
																		// which is its delimiter,and that becomes the
																		// first token, there would be three tokens.

			int length = 0, width = 0, height = 0;
			
			//need to use parse int to turn the strings into integers
			length = Integer.parseInt(copyLine.nextToken());// length is the first token
			width = Integer.parseInt(copyLine.nextToken());// width is the second token
			height = Integer.parseInt(copyLine.nextToken());// height is the third token

			Box obj = new Box(length, width, height);// Create an object of the Box class calling the Box constructor
														// sending in parameters of the length, width, and height from
														// the file.
			boxes.add(obj); // add the object we just created to the boxes list

			line = file.readLine();// Makes sure that the file keeps reading to the nextline, without this, there
									// would be an arrayindexoutofbounds exception and this would be an infinite
									// loop because it would keep rereading the first line.
		}
		//create a new gui
		BoxGUI gui = new BoxGUI("Boxes", 600, 400, boxes);
	}
}
