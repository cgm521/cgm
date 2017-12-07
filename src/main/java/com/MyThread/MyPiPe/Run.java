package com.MyThread.MyPiPe;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by cgm on 2017/11/23.
 */
public class Run {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();
            PipedInputStream pipedInputStream = new PipedInputStream();
            PipedOutputStream pipedOutputStream = new PipedOutputStream();
            //产生通信
            pipedInputStream.connect(pipedOutputStream);
            ThreadRead threadRead = new ThreadRead(readData, pipedInputStream);
            ThreadWrite threadWrite = new ThreadWrite(writeData, pipedOutputStream);

            threadRead.start();

            Thread.sleep(2000);

            threadWrite.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
