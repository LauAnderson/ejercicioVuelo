package com.dh.vuelo.model;

import java.time.LocalDate;

public class Hotel {
    private LocalDate fechaEntrada; //Atributos
    private LocalDate fechaSalida;
    private String ciudad;

    public Hotel(LocalDate fechaEntrada, LocalDate fechaSalida, String ciudad) { //Constructor
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.ciudad = ciudad;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    } //Métodos accesores


    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() { //Método to String para luego usar en la FacadeImpl
        return "Hotel{" +
                "fechaEntrada=" + fechaEntrada +
                ", fechaSalida=" + fechaSalida +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
