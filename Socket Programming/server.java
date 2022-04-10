package com.company;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server started..");
        System.out.println("Waiting for client connection..");
        while(true) {
            Socket socket = serverSocket.accept();
            System.out.println("Client connected..");

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

            try {
                Object cMsg = ois.readObject();
                System.out.println("From client: " + (String) cMsg);

                String sMsg = (String) cMsg;

                sMsg = sMsg.toUpperCase();

                oos.writeObject(sMsg);

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            ois.close();
            socket.close();

        }


    }
}
