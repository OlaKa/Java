import javax.swing.JOptionPane;

public class Namn {

	public static void main(String[] args) {
		//Deklarera variabler
		String namn,fornamn, efternamn;
		namn = JOptionPane.showInputDialog("Ange ditt för och efternamn!:");
		/*Denna kodrad tar bort whitespace runt strängen. Gör alla rader till små bokstäver
		och gör om ä, å och ö till a och o*/
		namn=namn.toLowerCase().trim().replaceAll("å","a").replaceAll("ä","a").replaceAll("ö","o");
		int findex = namn.indexOf(' ') + 1;
		int i =namn.lastIndexOf(' ');
		fornamn=namn.substring(0,i);
		int k =namn.length();
		efternamn=namn.substring(findex, k);
		//Skriv ut reslultatet på mailform
		JOptionPane.showMessageDialog(null,"Din mailadress:\n"+fornamn+"."+efternamn+"@nackademin.se");
	}

}
