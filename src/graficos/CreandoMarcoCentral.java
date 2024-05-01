package graficos;

import java.awt.*;
import javax.swing.*;

public class CreandoMarcoCentral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCentrado miMarco = new MarcoCentrado();
		
		miMarco.setDefaultCloseOperation(miMarco.EXIT_ON_CLOSE); 

		miMarco.setVisible(true);
		
	}

}

class MarcoCentrado extends JFrame {
	
	public MarcoCentrado() {
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();	//determina en qu� tipo de plataforma est�
		
		Dimension tama�oPantalla = mipantalla.getScreenSize();	//devuelve la resolucion de pantalla
		
		int alturaPantalla = tama�oPantalla.height;	//devuelve la altura
		
		int anchoPantalla = tama�oPantalla.width;	//devuelve el ancho
		
		setSize(anchoPantalla/2, alturaPantalla/2);	
		
		setLocation(anchoPantalla/4, alturaPantalla/4);
		
		setTitle("Marco centrado");
		
		Image miIcono = mipantalla.getImage("icono.gif");	//guarda una imagen en la variable
		
		setIconImage(miIcono);	//setea la imagen
		
	}
}