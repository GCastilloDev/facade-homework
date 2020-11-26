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
public class FacadeServicios {

    private Agua agua;
    private Luz luz;
    private Telefonia telefonia;

    public FacadeServicios(String nombre, float deudaAgua, float deudaLuz, float deudaTelefonia) {
        this.agua = new Agua(deudaAgua, nombre);
        this.luz = new Luz(deudaLuz, nombre);
        this.telefonia = new Telefonia(deudaTelefonia, nombre);
    }
    
    public float consultarSaldoTotal() {
        return this.agua.getDeuda() + this.luz.getDeuda() + this.telefonia.getDeuda();
    }

    public String pagarAgua(float abono) {
        if (this.agua.getDeuda() > abono) {
            return "Le hacen falta $" + (this.agua.getDeuda() - abono) + " para poder liquidar el servicio de agua";
        }
        
        this.agua.abonar(abono);
        return "Servicio de agua liquidado";
    }

    public String pagarLuz(float abono) {
        if (this.luz.getDeuda() > abono) {
            return "Le hacen falta $" + (this.luz.getDeuda() - abono) + " para poder liquidar el servicio de luz";
        }

        this.luz.abonar(abono);
        return "Servicio de luz liquidado";
    }

    public String pagarTelefonia(float abono) {
        if (this.telefonia.getDeuda() > abono) {
            return "Le hacen falta $" + (this.telefonia.getDeuda() - abono) + " para poder liquidar el servicio de telefonia";
        }

        this.telefonia.abonar(abono);
        return "Servicio de telefonia liquidado";
    }

}
