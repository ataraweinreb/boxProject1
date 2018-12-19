/**
 * 
 * @author Tara Weinreb
 *
 */
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class BoxGUI extends JFrame{  //Box gui inherits jframes properties
	private ArrayList <Box> boxes = new ArrayList<Box>();	
	private int boxLength; 
	private JTextArea unsorted, sorted;//JTextArea class is in javax.swing
	public BoxGUI(String title, int height, int width, ArrayList<Box> boxes) {
		setTitle(title);
		setSize(height,width);
		this.boxes = boxes;
		this.boxLength = boxLength;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//when you press the x on the gui it automatically terminates the program, without this the program will keep running
		setLocationRelativeTo(null);//this jframe doesnt have a parent, this is setting its location to the whole window
		components();
		setVisible(true);
	}
	private void components() {
		setLayout(new GridLayout(1,2));//makes one row two columns 
		
		unsorted = new JTextArea();// creates a new jtextarea which is an object and extends from javax.swing
		
		for(int i = 0; i < boxes.size(); i++) {
			unsorted.append(boxes.get(i) + "\n"); //You must add an end line or else the line would be to wide and wouldn't fit in the gui
		}

		add(unsorted);//adds the text areas to the grid layout, add comes with the extension of JFrame
		selectionSort(boxes); //Since your sorting a bunch of objects its permanent, therefore, you don't need to assign this to an array. Arrays are pass by reference, not by value
		sorted = new JTextArea();
	
		for(int i = 0; i < boxes.size(); i++) {
			sorted.append(boxes.get(i) + "\n");
		}
		add(sorted);
	}
	//selection sort 
	private static void selectionSort (ArrayList <Box> boxes) { //always need to remember the generic which in this case is <box> any type your throwing it in a function as a parameter
		int length = boxes.size();
		for ( int i = 0; i < length - 1; i++ ) { 
			int indexLowest = i; 
					for ( int j = i + 1; j < length; j++ ) 
						if ( boxes.get(j).volume() < boxes.get(indexLowest).volume()) {
									indexLowest = j;
						}
					if ( boxes.get(indexLowest).equals(boxes.get(i)) != true ) { 
						Box temp = boxes.get(indexLowest);
						boxes.set(indexLowest,boxes.get(i)); 
						boxes.set(i,temp); 
					}	  
		} 
	} 
}


