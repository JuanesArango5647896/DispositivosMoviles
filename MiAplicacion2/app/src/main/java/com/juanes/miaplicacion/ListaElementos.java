package com.juanes.miaplicacion;

import java.io.Serializable;

public class ListaElementos implements Serializable {
    public  String color, name, ciudad, estado, hora;

    public ListaElementos(String color, String name, String ciudad, String estado, String hora) {
        this.color = color;
        this.name = name;
        this.ciudad = ciudad;
        this.estado = estado;
        this.hora = hora;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) { this.hora = hora; }
}
