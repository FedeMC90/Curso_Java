import javax.swing.*;
public class Comprueba_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mail = "";
		int largo = 0, i = 0, arroba = 0;
		boolean punto = false;
		
		while (arroba!=1 || !punto) {
			mail = JOptionPane.showInputDialog("Ingrese mail: ");
			
			largo = mail.length();
			
			arroba = 0;
			punto = false;
			
			for (i = 0; i < largo; i++) {
				if (mail.charAt(i) == '@') 
					arroba++; 
				
				if (mail.charAt(i) == '.')
					punto = true;
			}
		}
		
		System.out.println("Bienvenido!");
	}

}
