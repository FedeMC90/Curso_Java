
public class arrays_bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [][] matriz = new int [4][5];
		int [][] matriz = {
				{2, 4, 65, 23, 1},
				{7, 45, 83, 44, 0},
				{23, 7, 56, 86, 31},
				{12, 17, 73, 58, 2}
		};
		
/*		
		for (int i=0; i<4; i++)	{
			
			for (int k=0; k<5; k++) {
				
				System.out.print(matriz[i][k]);
			
			}
		}
*/		
		for (int [] fila:matriz) {
			
			System.out.println();
			
			for (int z:fila) {
				System.out.print(z + " ");
			}
		}
	}

}
