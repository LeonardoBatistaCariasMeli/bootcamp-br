package com.digitalhouse.bootcamp.aula3.exercicio2;


import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class SorterFactory {
    public static Sorter create()  {
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String sorterPath = rootPath + "Aula5/exercicio1/att2/SortedFactory.properties";
        var properties = new Properties();
        try {
            properties.load(new FileInputStream(sorterPath));
            Constructor<?>  constuctor = Class.forName(properties.getProperty("sorter")).getConstructor();
                var sorter = constuctor.newInstance();
                if(sorter instanceof Sorter){
                    return (Sorter) sorter;
                }
            System.out.println(sorter.getClass());
                return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
