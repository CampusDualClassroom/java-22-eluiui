package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise22 {

    public static List<String> createArrayList() {
        List<String> lista = new ArrayList<>();
        lista.add("GKFFD");
        lista.add("TNANA");
        lista.add("MPMSL");
        lista.add("PSWME");
        lista.add("LZMLF");
        lista.add("JYEBV");
        lista.add("YELNT");
        lista.add("JSNKR");
        lista.add("JFESF");
        lista.add("TMJLL");
        return lista;
    }

    public static void printElementsAndIndex(List<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Posicion: " + i + ", Valor: " + lista.get(i));
        }
    }

    public static boolean addElementToList(List<String> lista, String element) {
        return lista.add(element);
    }

    public static void main(String[] args) {
        List<String> listin = createArrayList();

        String anadido = "AAAAA";
        boolean isAdded = addElementToList(listin, anadido);

        System.out.println("\n¿Se añadió " + anadido + "? " + isAdded + "\n");

        printElementsAndIndex(listin);
    }
}
