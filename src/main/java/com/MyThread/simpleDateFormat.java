package com.MyThread;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @auth cgm
 * @date 2017/12/9 23:44
 */
public class simpleDateFormat {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String[] strings = {"2017-12-01", "2017-12-02", "2017-12-03", "2017-12-04", "2017-12-05",
                "2017-12-06", "2017-12-07", "2017-12-08", "2017-12-09", "2017-12-11"};
        Thread[] threads = new MyThread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new MyThread(sdf, strings[i]);
        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }
    }
}

class MyThread extends Thread{
    private SimpleDateFormat sdf;
    private String dateString;

    public MyThread(SimpleDateFormat sdf, String dateString) {
        super();
        this.sdf = sdf;
        this.dateString = dateString;
    }

    @Override
     public void run() {

            synchronized ("1"){
                try {
                Date parse = sdf.parse(dateString);
                String format = sdf.format(parse);
                if (!dateString.equals(format)) {
                    System.out.println("name "+this.getName() +"dateString"+
                            dateString+" format"+format);
                }else System.out.println("=======");
            } catch (ParseException e) {
                e.printStackTrace();
            }
            }

    }
}
