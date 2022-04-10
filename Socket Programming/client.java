package com.company;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws IOException {
        System.out.println("Client started..");

        Socket socket = new Socket("127.0.0.1",5000);
        System.out.println("Client connected..");
        System.out.println("Client: ");

        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();

        oos.writeObject(msg);

        try {
            Object message = ois.readObject();
            System.out.println("Server: "+(String)message);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try{
            oos.close();
            ois.close();
            socket.close();
        }
       catch(Exception e){
           System.out.println(e);
       }

    }
}
