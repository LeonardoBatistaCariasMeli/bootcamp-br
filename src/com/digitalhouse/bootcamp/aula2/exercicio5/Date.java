package com.digitalhouse.bootcamp.aula2.exercicio5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {
    private GregorianCalendar date;

    public Date(int day, int month, int year) {
        this.date = new GregorianCalendar(year,month,day);
    }
    public Date( int year) {
        this.date = new GregorianCalendar(year,1,1);
    }
    public Date( int month, int year) {
        this.date = new GregorianCalendar(year, 1, 1);
    }

    @Override
    public String toString() {
        return day() + "/" + month() + "/" + year();
    }

    public int day(){
        return date.get(Calendar.DAY_OF_MONTH);
    }
    public int month(){
        return date.get(Calendar.MONTH);
    }
    public int year(){
        return date.get(Calendar.YEAR);
    }

}
