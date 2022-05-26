package com.dh.vuelo.service;

import java.time.LocalDate;

public interface IFacade {

    public void buscarHotelYVuelo(String ciudad , LocalDate fechaSalida); //Método a sobreescribir en la clase FacadeImp
}
