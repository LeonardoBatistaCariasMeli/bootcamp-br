package com.digitalhouse.bootcamp.aula4.SaveTheRopa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {

    private Map<Integer, List<Vestuario>> armazenamento = new HashMap<>();

    public Map<Integer, List<Vestuario>> getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(Map<Integer, List<Vestuario>> armazenamento) {
        this.armazenamento = armazenamento;
    }

    public Integer guardarVestuarios(List<Vestuario> roupas) {
        var idMax = this.pegarMaxId();

        this.armazenamento.put(++idMax, roupas);

        return idMax;
    }

    public void mostrarVestuarios() {
        this.armazenamento.forEach((key, value) -> {
            System.out.println("Identificador: " + key);
            List<Vestuario> roupas = this.armazenamento.get(key);
            roupas.stream().forEach(v -> System.out.println("Marca: " + v.getMarca() + "\nModelo: " + v.getModelo() + "\n"));
        });
    }

    public List<Vestuario> devolverVestuarios(Integer id) {
        List<Vestuario> roupas = this.armazenamento.get(id);
        this.armazenamento.remove(id);

        return roupas;
    }

    private Integer pegarMaxId() {
        int idMax = 0;

        for(Integer key : this.armazenamento.keySet()) {
            if (idMax < key) {
                idMax = key;
            }
        }

        return idMax;
    }
}
