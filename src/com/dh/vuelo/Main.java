package com.dh.vuelo;

import com.dh.vuelo.model.Hotel;
import com.dh.vuelo.model.Vuelo;
import com.dh.vuelo.service.imp.FacadeImpl;
import com.dh.vuelo.service.imp.HotelService;
import com.dh.vuelo.service.imp.VueloService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Vuelo vuelo1 = new Vuelo(LocalDate.of(2022, 05, 25 ),LocalDate.of(2022, 06, 05),"Argentina", "Colombia");
        Vuelo vuelo2 = new Vuelo(LocalDate.of(2022, 06, 10 ),LocalDate.of(2022, 06, 30),"Colombia", "Bahamas");

        Hotel hotel1 = new Hotel(LocalDate.of(2022, 05,25 ),LocalDate.of(2022, 06, 05),"Colombia");
        Hotel hotel2 = new Hotel(LocalDate.of(2022, 05,25 ),LocalDate.of(2022, 06, 07),"Bahamas");

       FacadeImpl facade = new FacadeImpl(new VueloService(), new HotelService()); //Instanciando la clase FacadeImpl y sus atributos.

        facade.getHotelService().agregarHotel(hotel1); //Agregando hoteles y vuelos desde la FacadeImpl
        facade.getHotelService().agregarHotel(hotel2);
        facade.getVueloService().agregarVuelo(vuelo1);
        facade.getVueloService().agregarVuelo(vuelo2);

        facade.buscarHotelYVuelo("Colombia", LocalDate.of(2022, 06, 05)); 

    }
}
