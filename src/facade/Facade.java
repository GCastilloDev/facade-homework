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
public class Facade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FacadeServicios servicios = new FacadeServicios("Gustavo", 200f, 300.69f, 5689.23f);

        System.out.println("Se adeuda en total: $" + servicios.consultarSaldoTotal());
        System.out.println(servicios.pagarAgua(199f));
        System.out.println(servicios.pagarAgua(200f));
        System.out.println(servicios.pagarLuz(300.69f));
        System.out.println(servicios.pagarTelefonia(5689.23f));
        System.out.println("Se adeuda en total: $" + servicios.consultarSaldoTotal());

    }

}
