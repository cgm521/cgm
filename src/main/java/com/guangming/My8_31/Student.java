package com.guangming.My8_31;

/**
 * Created by cgm on 2017/8/28.
 */
public class Student implements Person,Named,Comparable<Student>{


    String agr;
    String borth;

    @Override
    public String getName() {
        return null;
    }

    public Student(String agr) {
        this.agr = agr;
    }

    public Student() {
    }

    public String getAgr() {
        return agr;
    }

    public void setAgr(String agr) {
        this.agr = agr;
    }

    public String getBorth() {
        return borth;
    }

    public void setBorth(String borth) {
        this.borth = borth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "agr='" + agr + '\'' +
                ", borth='" + borth + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int i = agr.compareTo(o.agr);
        return i != 0 ? i : borth.compareTo(o.borth);

    }
}
