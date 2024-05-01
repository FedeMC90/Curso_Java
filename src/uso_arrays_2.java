import javax.swing.JOptionPane;

public class uso_arrays_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] paises = new String[8];
		int i;
		
		for (i=0; i<paises.length; i++) {
			paises[i] = JOptionPane.showInputDialog("Ingrese un país: ");
		}
		
		for (String k:paises) {
			System.out.println(k);
		}
	}

}
