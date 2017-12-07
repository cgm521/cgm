package com.MyThread.MyPiPe;

import java.io.PipedOutputStream;

/**
 * Created by cgm on 2017/11/23.
 */
public class ThreadWrite extends Thread {
    private WriteData writeData;
    private PipedOutputStream outputStream;

    public ThreadWrite(WriteData writeData, PipedOutputStream outputStream) {
        super();
        this.writeData = writeData;
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        writeData.writeMethod(outputStream);
    }
}
