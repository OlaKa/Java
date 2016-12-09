package com.gmail.murmeldjur.server;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(61616)) {
            System.out.println("Server listening...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Server connected.");
                new Thread(new ContactServer(clientSocket)).start();
            }
        } catch (IOException e) {
            System.err.println("Contact Server got an IOException");
        }
    }
}
