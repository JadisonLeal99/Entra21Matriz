
public class Exc4 {
	public static void main(String[] args) {
		int matriz[][] = { { 2104, 3, 399900 }, { 1600, 3, 329900 }, { 2400, 3, 369000 }, { 1416, 2, 232000 },
				{ 3000, 4, 539900 }, { 1985, 4, 299900 }, { 1534, 3, 314900 }, { 1427, 3, 199000 }, { 1380, 3, 212000 },
				{ 1494, 3, 242500 }, { 1940, 4, 240000 }, { 2000, 3, 347000 }, { 1890, 3, 330000 }, { 4478, 5, 699900 },
				{ 1268, 3, 259900 } };

		int somaValorCasa = 0;
		int casaMaisBarata = Integer.MAX_VALUE;
		int casaMaisCara = Integer.MIN_VALUE;
		int casaMaisQuartos = 0;
		int casaMenosQuartos = Integer.MAX_VALUE;
		int tamanhoCasaMaisQuartos = 0;
		int tamanhoCasaMenosQuartos = 0;
		int somaCasasAcimaDe300000 = 0;
		int contadorCasasAcimaDe300000 = 0;

		for (int i = 0; i < matriz.length; i++) {
				// sama o valor de todas as casas
				somaValorCasa += matriz[i][2];

				// pega o valor da casa mais barata
				if (matriz[i][2] < casaMaisBarata) {
					casaMaisBarata = matriz[i][2];
				}
				// pega o valor da casa mais cara e quantos quartos ela tem
				if (matriz[i][2] > casaMaisCara) {
					casaMaisCara = matriz[i][2];
					casaMaisQuartos = matriz[i][1];
					// pega o tamanho da casa com mais quartos
					tamanhoCasaMaisQuartos = matriz[i][0];
				}
				
				// pega o tamanho da casa com menos quartos
				if(matriz[i][1] < casaMenosQuartos) {
					casaMenosQuartos = matriz[i][1];
					tamanhoCasaMenosQuartos = matriz[i][0];
				}
				
				 // soma os tamanhos e a quantidade de casas com o valor acima de R$300,000
				if(matriz[i][2] > 300000) {
					somaCasasAcimaDe300000 += matriz[i][0];
					contadorCasasAcimaDe300000 ++;
				}
		}

		int media = somaValorCasa / matriz.length;
		int diferencaTamanhoCasas = tamanhoCasaMaisQuartos - tamanhoCasaMenosQuartos;
		int mediaCasasAcimaDe300000 = somaCasasAcimaDe300000 / contadorCasasAcimaDe300000 ; 
		System.out.println("A média do preço das casas é: " + media);
		System.out.println("Valor da casa mais barata é: " + casaMaisBarata);
		System.out.println("A casa mais cara custa: R$" + casaMaisCara + " e tem " + casaMaisQuartos + " Quartos");
		System.out.println("A casa com mais quartos tem " + tamanhoCasaMaisQuartos + "m2" + " e casa com menos quartos tem " + tamanhoCasaMenosQuartos + "m2");
		System.out.println("A diferença de tamanho da casa com mais quartos para casa com menos quartos é: " + diferencaTamanhoCasas);
		System.out.println("A média de tamanho das casas acima de R$300,000 é: " + mediaCasasAcimaDe300000);

	}
}
