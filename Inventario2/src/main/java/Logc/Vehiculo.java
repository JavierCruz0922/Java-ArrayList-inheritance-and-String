/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logc;

/**
 *
 * @author serpe
 */
public class Vehiculo {

    private int pasajeros;
    private int velocidad;
    private String placa;

    /**
     * @return the pasajeros
     */
    public int getPasajeros() {
        return pasajeros;
    }

    /**
     * @param pasajeros the pasajeros to set
     */
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    /**
     * @return the velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public Vehiculo(int pasajeros,int velocidad,String placa)
    {
        this.pasajeros=pasajeros;
        this.velocidad=velocidad;
        this.placa=placa;
    }
    
    @Override
    public String toString()
    {
        return this.getPlaca()+"\n\t"+"velocidad: "+this.getVelocidad()+ " km/h\n\t"+
                "pasajeros: "+this.getPasajeros()+"\n\t";
    }
}
