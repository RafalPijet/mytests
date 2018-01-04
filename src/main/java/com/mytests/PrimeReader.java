package com.mytests;

import java.io.*;

public class PrimeReader {
    public static void main(String[] arguments) {
        try (FileInputStream file = new FileInputStream("400pierwszych.dat");
             BufferedInputStream buff = new BufferedInputStream(file);
             DataInputStream data = new DataInputStream(buff)) {
            try {
                while (true) {
                    int in = data.readInt();
                    System.out.print(in + ", ");
                }
            } catch (EOFException e) {
                buff.close();
                System.out.println();
            }
        } catch (IOException exc) {
            System.out.println("Błąd -- " + exc.toString());
        }
    }
}
