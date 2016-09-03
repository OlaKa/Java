import javax.swing.JOptionPane;

public class Namn {

	public static void main(String[] args) {
		
		String namn, fornamn, efternamn;
		namn = JOptionPane.showInputDialog("Ange ditt för och efternamn!:");
		/*toLowercase ger bara gemener, trim tar bort onödig whitespace och replaceAll tar bort
		 å, ä och ö och ersätter med a och o.*/
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
