package com.dh.vuelo.service.imp;

import com.dh.vuelo.model.Hotel;
import com.dh.vuelo.model.Vuelo;
import com.dh.vuelo.service.IFacade;


import java.time.LocalDate;
import java.util.List;

public class FacadeImpl  implements IFacade { //Implementa de la interfaz IFacade
    private VueloService vueloService; //Atributos
    private HotelService hotelService;

    public FacadeImpl(VueloService vueloService, HotelService hotelService) { //Constructor
        this.vueloService = vueloService;
        this.hotelService = hotelService;
    }

    public VueloService getVueloService() { //Métodos accesores
        return vueloService;
    } //Métodos accesores

    public HotelService getHotelService() {
        return hotelService;
    }

    @Override //Sobreescribiendo el método de la interfaz IFacade
    public void buscarHotelYVuelo(String ciudad,  LocalDate fechaSalida) {
        List<Vuelo> vuelos = vueloService.buscarVuelo(fechaSalida, ciudad); //Creamos un listado de vuelos que sea igual a vuelos disponibles
        List<Hotel> hoteles = hotelService.buscarHotel(fechaSalida,ciudad); //Creamos un listado de hoteles que sea igual a hoteles disponibles

        for (Vuelo vuelo:vuelos) { //For para recorrer los vuelos disponibles
                System.out.println(vuelo.toString()); //Devuelve 1 vuelo disponible, con todos sus atributos
        }
        for (Hotel hotel: hoteles) {//For para recorrer los hoteles disponibles
            System.out.println(hotel.toString()); //Devuele 1 hotel disponible, con todos sus atributos
        }
    }

}
