package repchar;

import javax.swing.JOptionPane;

public class Namn {

	public static void main(String[] args) {
		
		String namn;
		String fornamn, efternamn;
		namn = JOptionPane.showInputDialog("Ange ditt för och efternamn!:");
		/*This line of code trims of trailing and leading whitespace. Makes all chars to lower case
		 and replaces 'å' 'ä' and 'ö' to a or o*/
		namn=namn.toLowerCase().trim().replaceAll("å","a").replaceAll("ä","a").replaceAll("ö","o");
		//Index för förnamnet
		int findex = namn.indexOf(' ');
		//Index föe efternamnet
		int lindex =namn.indexOf(' ')+1;
		//Plocka ut sista indexet
		int lastindex =namn.length();
		//Plocka ut förnamnet
		fornamn=namn.substring(0,findex);
		//Plocka ut efternamn
		efternamn=namn.substring(lindex, lastindex);
		JOptionPane.showMessageDialog(null,"Din mailadress:\n"+fornamn+"."+efternamn+"@nackademin.se");
	}
}
