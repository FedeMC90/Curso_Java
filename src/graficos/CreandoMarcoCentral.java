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
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();	//determina en qué tipo de plataforma está
		
		Dimension tamañoPantalla = mipantalla.getScreenSize();	//devuelve la resolucion de pantalla
		
		int alturaPantalla = tamañoPantalla.height;	//devuelve la altura
		
		int anchoPantalla = tamañoPantalla.width;	//devuelve el ancho
		
		setSize(anchoPantalla/2, alturaPantalla/2);	
		
		setLocation(anchoPantalla/4, alturaPantalla/4);
		
		setTitle("Marco centrado");
		
		Image miIcono = mipantalla.getImage("icono.gif");	//guarda una imagen en la variable
		
		setIconImage(miIcono);	//setea la imagen
		
	}
}