package com.MyThread.MyPiPe;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * Created by cgm on 2017/11/23.
 */
public class ReadData {
    public void readMethod(PipedInputStream inputStream) {
        try {
            System.out.println("read :");
            byte[] bytes = new byte[20];
            int read = inputStream.read(bytes);
            while (read != -1) {
                String newData = new String(bytes, 0, read);
                System.out.println("R "+newData);
                read = inputStream.read(bytes);
            }
            System.out.println();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
