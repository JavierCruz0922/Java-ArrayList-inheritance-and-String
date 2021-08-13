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
public class Particular extends Vehiculo {

    private String color;

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    public Particular(int pasajeros, int velocidad, String placa, String color) {
        super(pasajeros, velocidad, placa);
        this.color = color;
    }
    
    @Override
    public String toString()
    {
        return("\tVehículo Particular - Placa: "+super.toString()+"color: "+this.getColor());
    }
}
