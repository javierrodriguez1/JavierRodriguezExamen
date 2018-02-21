package com.example.alvaaro.javierrodriguezexamen;

import java.io.Serializable;

/**
 * Created by alvaaro on 21/02/2018.
 */

public class Pais implements Serializable{
    private String nombre;
    private String nombreTraducido;
    private String clave;
    private String capital;
    private String continente;
    private String poblacion;
    private String latitud;
    private String longitud;
    private String paisesFronterizos;

    public Pais(String nombre,/*String nombreTraducido,*/ String clave, String capital, String continente, String poblacion, String latitud, String longitud, String paisesFronterizos){
        this.nombre = nombre;
        this.nombreTraducido = nombreTraducido;
        this.clave = clave;
        this.capital = capital;
        this.continente = continente;
        this.poblacion = poblacion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.paisesFronterizos = paisesFronterizos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreTraducido() {
        return nombreTraducido;
    }

    public void setNombreTraducido(String nombreTraducido) {
        this.nombreTraducido = nombreTraducido;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getPaisesFronterizos() {
        return paisesFronterizos;
    }

    public void setPaisesFronterizos(String paisesFronterizos) {
        this.paisesFronterizos = paisesFronterizos;
    }
}
