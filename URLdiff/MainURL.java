package com.gmail.murmeldjur.url;

import java.awt.Toolkit;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.util.Arrays;

//import org.omg.CORBA.portable.InputStream;

public class MainURL {
	static String urlpage = "http://www.aftonbladet.se/nyheter/usavalet2016/article23781526.ab";
	static File tempFile = null;

	public static void main(String[] args) throws Exception {
		MainURL w = new MainURL();

		String orginalPath = "C:\\test\\orginal.html";// första nedladdningen
		String path = "C:\\test\\latest.html"; // alla senare försök

		// TODO: fix me , if Exception at this line, we fail and exit the
		// program
		File fOrginal = w.downloadPage(urlpage, orginalPath);
		File fLatest = null;

		for (int i = 0; i < 10; i++) {

			Thread.sleep(1000);
			fLatest = w.downloadPage(urlpage, path);

			if (!w.fileContentEqual(fOrginal, fLatest)) {
				w.alarm();
				System.out.print("Alarm!");
				Thread.sleep(2000);
				break;
			}
			System.out.print(".");
		}
	}

	/**
	 * Works ok!!
	 * 
	 * @param url
	 * @throws IOException
	 */
	public File downloadPage(String url, String path) throws IOException {
		tempFile = new File(path);

		URL website = new URL(url);
		ReadableByteChannel rbc;
		try {
			rbc = Channels.newChannel(website.openStream());
			FileOutputStream fos = new FileOutputStream(tempFile);
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return tempFile;
	}

	public boolean fileContentEqual(File file1, File file2) {
		boolean retval = false;
		try {
			byte[] f1 = Files.readAllBytes(file1.toPath());
			byte[] f2 = Files.readAllBytes(file2.toPath());
			if (Arrays.equals(f1, f2)) {
				retval = true;
			}
		} catch (Exception e) {
			// do nothing, test will fail
		}
		return retval;
	}

	public void alarm() {
		// System.out.print("\007"); // \007 is the ASCII bell
		System.out.flush();

		// may work if you allow beep in your sound-schema for your computer
		Toolkit.getDefaultToolkit().beep();
	}
}
