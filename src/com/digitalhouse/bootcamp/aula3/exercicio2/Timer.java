package com.digitalhouse.bootcamp.aula3.exercicio2;

import java.util.Date;

public class Timer {
    private long start;
    private long end;

    public void start(){
        start =  new Date().getTime();
    }

    public void end(){
        end = new Date().getTime();
    }

    public long getElapsedTime(){
        return end - start;
    }


}
