/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmvc;

import controlador.Controlador;
import modelo.Modelo;
import vista.Interfaz;

/**
 *
 * @author ediaz
 */
public class TestMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Modelo mod = new Modelo();
        Interfaz view = new Interfaz();
        Controlador ctrl = new Controlador(view, mod);
        
        ctrl.iniciar();
        view.setVisible(true);
                
        
        
    }
    
}
