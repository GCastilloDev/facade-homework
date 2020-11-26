/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author tavoGeek
 */
public class Agua extends Cliente implements Servicios {

    private float deuda;

    public Agua(float deuda, String nombreCliente) {
        super(nombreCliente);
        this.deuda = deuda;
    }

    public float getDeuda() {
        return deuda;
    }

    public void setDeuda(float deuda) {
        this.deuda = deuda;
    }

    public void abonar(float abono) {
        this.deuda -= abono;
    }

    public boolean sinDeuda() {
        if (this.deuda == 0) {
            return true;
        }
        return false;
    }

}
