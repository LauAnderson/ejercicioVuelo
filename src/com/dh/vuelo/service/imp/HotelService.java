package com.dh.vuelo.service.imp;

import com.dh.vuelo.model.Hotel;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HotelService {

    private List<Hotel>listadoHotel = new ArrayList<>(); //Creamos un listado de hoteles

    //Métodos
    public void agregarHotel(Hotel hotel){
        listadoHotel.add(hotel); //Al listado de hotel le agregamos un hotel
        System.out.println("Agregando un hotel al listado de hoteles");
    }

    public List<Hotel> buscarHotel(LocalDate fechaSalida, String ciudad){
        List<Hotel> hotelesDisponibles = new ArrayList<>(); //Creamos un listaado de hoteles disponibles vacio
        for (Hotel hotel:listadoHotel) { //Hacemos un for para recorrer el listado de hoteles
            if (hotel.getFechaSalida().equals(fechaSalida) && hotel.getCiudad().equals(ciudad)){ //Evaluamos si el hotel coincide por el pasado por parámetro
                hotelesDisponibles.add(hotel); //Si coincide, lo agregamos al listado de Hoteles disponibles
            }

        }
        return hotelesDisponibles; //Retornamos el listado de hoteles disponibles
    }


}
