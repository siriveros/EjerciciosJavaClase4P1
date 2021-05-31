package com.itb.wave8.demo;

import com.itb.wave8.demo.entities.GuardaRopa;
import com.itb.wave8.demo.entities.Prenda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        GuardaRopa guardaRopa = new GuardaRopa();

        List<Prenda> listaDePrendas = new ArrayList<>();
        listaDePrendas.add(new Prenda("Nike","Camisa"));
        listaDePrendas.add(new Prenda("Adidas","Camiseta"));
        listaDePrendas.add(new Prenda("Nike","Pantalon"));
        listaDePrendas.add(new Prenda("La Coste","Gorra"));
        listaDePrendas.add(new Prenda("Bosi","Zapatos"));

        System.out.println("El codigo asignado es : " + guardaRopa.guardarPrendas(listaDePrendas));

        List<Prenda> listaDePrendas2 = new ArrayList<>();
        listaDePrendas2.add(new Prenda("Nike","Zapatos"));
        listaDePrendas2.add(new Prenda("Adidas","Pantalon"));

        System.out.println("El codigo asignado es : " + guardaRopa.guardarPrendas(listaDePrendas2));

        guardaRopa.mostrarPrendas();

        //System.out.println(guardaRopa.devolverPrenda(2));



        System.out.println(guardaRopa.devolverPrenda(new Prenda("Bo","Zapatos")));

        //System.out.println(guardaRopa.devolverPrenda(2));
    }
}
