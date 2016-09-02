

public class Namn {

	public static void main(String[] args) {
		String namn="Ola Karlsson";
		String fornamn, efternamn;
		/*This line of code trims of trailing and leading whitespace. Makes all chars to lower case
		 and replaces 'å' 'ä' and 'ö' to a or o*/
		namn=namn.toLowerCase().trim().replaceAll("å","a").replaceAll("ä","a").replaceAll("ö","o");
		int findex = namn.indexOf(' ') + 1;
		int i =namn.lastIndexOf(' ');
		fornamn=namn.substring(0,i);
		int k =namn.length();
		efternamn=namn.substring(findex, k);
		//System.out.print(efternamn);
		System.out.print(fornamn+"."+efternamn+"@nackademin.se");


	}

}
