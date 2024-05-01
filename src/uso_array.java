import javax.swing.JOptionPane;

public class uso_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] matriz = new int[10];
		int i;
		
		for (i=0; i<10; i++) {
			matriz[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
		}
		
		System.out.println("Los números ingresados son: ");
		
		for (i=0; i<10; i++) {
			System.out.println(matriz[i]);
		}
		
	}

}
