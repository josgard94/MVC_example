/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Interfaz;
import modelo.Modelo;

/**
 *
 * @author ediaz
 */
public class Controlador implements ActionListener{
    
    private Modelo model;
    private Interfaz view;
    
    //Contrustor de la clase
    public Controlador(Interfaz view, Modelo model)
    {
        this.model = model;
        this.view = view;
        //inicializar escuchador del evento en boton mutliplicar
        this.view.btnMultiplicar.addActionListener((ActionListener) this);
    }
    public void iniciar()
    {
        view.setTitle("MVC example");
        view.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        //obtener los número ingresados desde la vista en  los campos de texto.
        model.setNumeroUno(Integer.parseInt(view.txtNumero1.getText()));
        model.setNumeroDos(Integer.parseInt(view.txtNumero2.getText()));
        //metodo que realiza la multiplicación no recibe parametros por que
        //estan encapsulados con el setter y getter.
        model.Multiplicar();
        //enviar el resultado del metodo a la vista principal
        view.txtResultado.setText(String.valueOf(model.getResultado()));
    }
}
