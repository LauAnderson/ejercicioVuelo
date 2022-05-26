package com.dh.vuelo.model;

import java.time.LocalDate;

public class Vuelo {
    private LocalDate fechaEntrada; //Atributos
    private LocalDate fechaSalida;
    private String origen;
    private String destino;


    public Vuelo(LocalDate fechaSalida, LocalDate fechaRegreso, String origen, String destino) { //Constructor
        this.fechaEntrada = fechaSalida;
        this.fechaSalida = fechaRegreso;
        this.origen = origen;
        this.destino = destino;
    }

    public LocalDate getFechaEntrada() { //Métodos accesores
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() { //Método To String para luego usar en la FacadeImpl
        return "Vuelo{" +
                "fechaSalida=" + fechaEntrada +
                ", fechaRegreso=" + fechaSalida +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                '}';
    }
}
