public class Exc2 {
	public static void main(String[] args) {

		int[][] matriz = { { 4, 12 }, { 2, -3 } };

		int a = matriz[0][0]; // 4
		int b = matriz[0][1]; // 12
		int c = matriz[1][0]; // 2
		int d = matriz[1][1]; // -3
		int determinante = (a * d) - (b * c);

		System.out.println("Matriz:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("O determinante da matriz é: " + determinante);
	}
}