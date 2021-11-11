package com.example.revisionprueba1;

import java.io.Serializable;

public class PasajeMetro extends Pasaje implements Serializable {

    public PasajeMetro(){
        valor = 750;
    }

    @Override
    public String adicional() {
        return "";
    }
}
