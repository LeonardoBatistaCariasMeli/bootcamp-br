package com.digitalhouse.bootcamp.aula4.SaveTheRopa;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Vestuario vestuario1 = new Vestuario("Lacoste", "Camisa polo");
        Vestuario vestuario2 = new Vestuario("C&A", "Vestido");
        Vestuario vestuario3 = new Vestuario("Zara", "Calça");
        List<Vestuario> usuario1 = Arrays.asList(vestuario1, vestuario2, vestuario3);

        Vestuario vestuario4 = new Vestuario("Lacoste", "Camisa polo");
        Vestuario vestuario5 = new Vestuario("C&A", "Vestido");
        Vestuario vestuario6 = new Vestuario("Zara", "Calça");
        List<Vestuario> usuario2 = Arrays.asList(vestuario4, vestuario5, vestuario6);

        Vestuario vestuario7 = new Vestuario("Lacoste", "Camisa polo");
        Vestuario vestuario8 = new Vestuario("C&A", "Vestido");
        Vestuario vestuario9 = new Vestuario("Zara", "Calça");
        List<Vestuario> usuario3 = Arrays.asList(vestuario7, vestuario8, vestuario9);

        GuardaRoupa guardaRoupa = new GuardaRoupa();
        guardaRoupa.guardarVestuarios(usuario1);
        guardaRoupa.guardarVestuarios(usuario2);
        guardaRoupa.guardarVestuarios(usuario3);

        guardaRoupa.mostrarVestuarios();

        guardaRoupa.devolverVestuarios(3);

        guardaRoupa.mostrarVestuarios();
    }

}
