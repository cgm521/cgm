package com.MyThread.MyPiPe;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * Created by cgm on 2017/11/23.
 */
public class WriteData {
    public void writeMethod(PipedOutputStream outputStream) {
        try {
            System.out.println("write :");
            for (int i = 0; i < 300; i++) {
                String outData = "" + (i + 1);
                outputStream.write(outData.getBytes());
                System.out.println("W "+outData);

            }
            System.out.println();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
