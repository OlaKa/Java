import javax.swing.JOptionPane;

public class Namn {

	public static void main(String[] args) {
		
		String namn, fornamn, efternamn;
		namn = JOptionPane.showInputDialog("Ange ditt för och efternamn!:");
		/*toLowercase ger bara gemener, trim tar bort onödig whitespace och replaceAll tar bort
		 å, ä och ö och ersätter med a och o.*/
		namn=namn.toLowerCase().trim().replaceAll("å","a").replaceAll("ä","a").replaceAll("ö","o").replaceAll(" ",".");
		JOptionPane.showMessageDialog(null,"Din mailadress:\n"namn+"@nackademin.se");
	}
}
