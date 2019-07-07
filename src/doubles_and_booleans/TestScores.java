
package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
String   test=	JOptionPane.showInputDialog(null, "What is your test score?");
double score= Double.parseDouble(test);
if (score>90) {
	JOptionPane.showMessageDialog(null,"You did outstanding on your test!!!");
}
else if (score>70) {
	JOptionPane.showMessageDialog(null,"You did good on your test!");
}
else if (score>50) {
	JOptionPane.showMessageDialog(null,"You did ok on your test.");
}
else if (score>30) {
	JOptionPane.showMessageDialog(null,"You did pretty bad on your test.");
}
else if (score>10) {
	JOptionPane.showMessageDialog(null,"You did really bad on your test!");
}
else if (score>0) {
	JOptionPane.showMessageDialog(null,"You did abseloutly terrible on your test!!!");
}


























}
}
