package graficos;

import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		miMarco marco1 = new miMarco();
		
		marco1.setVisible(true);	//hace visible la ventana
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//determina el comportamiento al cerrar la ventana (constante de clase)
		
	}

}

class miMarco extends JFrame {	//hereda de JFrame para poder usar sus m�todos
	
	public miMarco() {
		
		//setSize(500, 300);	//determina el tama�o de la ventana
		
		//setLocation(500, 300);
		
		setBounds(500, 300, 550, 250);	//determina la posici�n y el tama�o de la ventana
		
//		setResizable(false);	//impide que se pueda redimencionar
		
//		setExtendedState(JFrame.MAXIMIZED_BOTH);	//muestra la ventana en tama�o full screen
		
		setTitle("Mi ventana");	//setea un t�tulo a la ventana
	}
}