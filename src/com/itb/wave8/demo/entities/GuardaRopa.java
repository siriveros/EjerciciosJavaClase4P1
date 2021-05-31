package com.itb.wave8.demo.entities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {

    private int contador;
    private HashMap<Integer, List<Prenda>> listaPrendas;

    public GuardaRopa() {
        this.contador = 0;
        this.listaPrendas = new HashMap<>();
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public HashMap<Integer, List<Prenda>> getListaPrendas() {
        return listaPrendas;
    }

    public void setListaPrendas(HashMap<Integer, List<Prenda>> listaPrendas) {
        this.listaPrendas = listaPrendas;
    }

    public Integer guardarPrendas(List<Prenda> listaDePrendas){
        contador++;
        if(!listaPrendas.containsKey(contador)){
            this.listaPrendas.put(contador,listaDePrendas);
        }
        return contador;
    }

    public void mostrarPrendas(){
        for(Map.Entry<Integer,List<Prenda>> prenda: listaPrendas.entrySet()){
            System.out.println("La lista de prendas se encuentra en el contador = " + prenda.getKey());
            for (int i = 0; i < prenda.getValue().size(); i++) {
                System.out.println("    - Prenda " + (i+1) + " : " + prenda.getValue().get(i));
            }
        }
    }

    public List<Prenda> devolverPrenda(Integer numero) throws Exception {
        if(listaPrendas.containsKey(numero)){
            List<Prenda> prenda = listaPrendas.get(numero);
            listaPrendas.remove(numero);
            return prenda;
        } else {
            throw new Exception("Error, la posicion no existe");
        }
    }

    public List<Prenda> devolverPrenda(Prenda prenda) throws Exception{
        Integer posicion = 0;
        for(Map.Entry<Integer,List<Prenda>> p: listaPrendas.entrySet()){
            for (int i = 0; i < p.getValue().size(); i++) {
                if(prenda.equals(p.getValue().get(i))){
                    posicion = p.getKey();
                    return devolverPrenda(posicion);
                }
            }
        }
        throw new Exception("No se encontro la prenda");
    }

}
