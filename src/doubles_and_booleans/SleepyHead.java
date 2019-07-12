package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
        int ans = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        	int ans2 = JOptionPane.showConfirmDialog(null, "Is it a Vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        	 if (ans2== JOptionPane.YES_OPTION) { 
        }
        if (ans== JOptionPane.	NO_OPTION && ans2==JOptionPane.NO_OPTION){
        	JOptionPane.showMessageDialog(null, "Get up sleepy head!!!!!!!!");
        }
        if (ans== JOptionPane.	NO_OPTION && ans2==JOptionPane.YES_OPTION){
        	JOptionPane.showMessageDialog(null, "Then you can sleep in and relax");
        }
        	if (ans== JOptionPane.YES_OPTION) {
        		JOptionPane.showMessageDialog(null, "Get up sleepy head!!!!!!!!");
        	}
        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }
}
