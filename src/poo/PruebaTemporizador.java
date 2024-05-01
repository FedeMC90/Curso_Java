package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.Date;
import java.awt.*;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DameLaHora oyente = new DameLaHora();
		
		Timer mitemporizador = new Timer(5000, oyente); //el segundo parametro es de tipo interfaz ActionListener
		
		mitemporizador.start(); //Comienza el evento
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener."); //Muestra un mensaje
		
		System.exit(0); //Termina la ejecucion del programa
	}

} 

class DameLaHora implements ActionListener { //implemento la interfaz en otra clase donde no este el main

	public void actionPerformed(ActionEvent e) { //metodo obligatorio por implementar la interfaz
		
		Date ahora = new Date();
		
		System.out.println("Esta es la hora cada 5seg: " + ahora);
		
		Toolkit.getDefaultToolkit().beep();	//emite un sonido
	}
	
}