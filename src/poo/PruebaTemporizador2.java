package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reloj miReloj = new Reloj();
		
		miReloj.enMarcha(3000, true);
		
		JOptionPane.showMessageDialog(null, "Pulse Aceptar para terminar.");
		
		System.exit(0);
	}

}

class Reloj{
/*	
	private int intervalo;
	private boolean sonido;
	
	public Reloj(int intervalo, boolean sonido) {	//simplificación de código haciendo "DameHora2" una clase
													//interna local
		this.intervalo = intervalo;
		this.sonido = sonido;
	}
*/	
	public void enMarcha(int intervalo, final boolean sonido) { //declaro "final" la variable "sonido" porque se usa dentro de la clase interna
		
		class DameLaHora2 implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
				
				Date ahora = new Date();
				
				System.out.println("Esta es la hora cada 3sg: " + ahora);
				
				if (sonido)	
					Toolkit.getDefaultToolkit().beep();
			}				
		}
		
		ActionListener oyente = new DameLaHora2();
		
		Timer miTemporizador = new Timer(intervalo, oyente);
		
		miTemporizador.start();
		
	
	}
	
	
}