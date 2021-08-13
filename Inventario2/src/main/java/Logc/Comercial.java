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
public class Comercial extends Vehiculo {

    private int peso;

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public Comercial(int pasajeros,int velocidad,String placa, int peso )
    {
        super(pasajeros, velocidad, placa);
        this.peso=peso;
    }
    
    @Override
    public String toString()
    {
        return("\tVehículo Comercial - Placa: "+super.toString()+"Carga máxima: "+this.getPeso()+"kg");
    }
}
