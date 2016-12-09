package com.gmail.murmeldjur.server;

import java.io.*;
import java.net.Socket;

/**
 * Created by Ola on 2016-12-01.
 */
public class ContactServer implements Runnable {
    Socket clientSocket;

    public ContactServer(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter writer = new PrintWriter(clientSocket.getOutputStream())) {
            String svar;
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {

                if ("getall".equals(line)) {
                    svar = getContacts();
                    writer.println(svar);
                    writer.flush();
                } else if ("exit".equals(line)) {
                    break;
                }
            }
            clientSocket.close();
        } catch (Exception e) {
            System.out.println("Contact Server got an Exception" + e.getStackTrace());
        }
    }

    public static String getContacts() {
        String pathandfile = "C:\\Users\\Ola\\IdeaProjects\\Main\\" +
                "database\\remotecontacts.csv";
        File file = new File(pathandfile);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line.replace(",", " "));
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
