package com.dh.vuelo.service.imp;

import com.dh.vuelo.model.Vuelo;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VueloService {

    private List<Vuelo>listadoVuelo = new ArrayList<>(); //Creamos un listado de vuelos


    //Métodos
    public void agregarVuelo(Vuelo vuelo){ //Al listado de vuelos le agregamos un vuelo
        listadoVuelo.add(vuelo);
        System.out.println("Agregando vuelo al listado de vuelos");
    }
    public List<Vuelo> buscarVuelo(LocalDate fechaSalida, String destino){ //Compara el vuelo seleccionado con el pasado por parámetro.
        List<Vuelo> vuelosDisponibles = new ArrayList<>(); //Creamos un listado de vuelos disponibles
        for (Vuelo vuelo:listadoVuelo) { //Hacemos un for para recorrer el listado de vuelos
           if (vuelo.getFechaSalida().equals(fechaSalida) && vuelo.getDestino().equals(destino)){ //Evaluamos si el vuelo coincide por el pasado por parámetro
               vuelosDisponibles.add(vuelo); //Si es así lo agregamos a vuelos disponibles
           }

        }
        return vuelosDisponibles; //Retornamos el listado de vuelos disponibles
    }


}
