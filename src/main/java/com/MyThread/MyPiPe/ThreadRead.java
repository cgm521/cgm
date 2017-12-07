package com.MyThread.MyPiPe;

import java.io.PipedInputStream;

/**
 * Created by cgm on 2017/11/23.
 */
public class ThreadRead extends Thread {
    private ReadData readData;
    private PipedInputStream inputStream;

    public ThreadRead(ReadData readData, PipedInputStream inputStream) {
        super();
        this.readData = readData;
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        readData.readMethod(inputStream);
    }
}
