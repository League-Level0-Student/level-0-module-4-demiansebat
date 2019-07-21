package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class Globglogabgalab {
public static void main(String[] args) {
	int task = JOptionPane.showOptionDialog(null, "Once upon a time in a place far, far away lived the one amd only globglogabgalab. He spent most of his time", "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] {"golfing"," Dancing in a library" }, null);
	
	task = JOptionPane.showOptionDialog(null, "He loved doing this because", "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] {"This was the only thing he could do to be less squishy, and flabby.","because he loved moving his globby arms. " }, null);
	
	task = JOptionPane.showOptionDialog(null, "In the end after lots of hard work" , "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] {"He became skinny, and lived happily ever after.","he stayed fat because he was a blobby thing. " }, null);
	

}
}
