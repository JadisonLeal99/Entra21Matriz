import java.util.Scanner;

public class Exc5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int somaDasNotas = 0;
		int somaDasNotasHomens = 0;
		int mulherMaisNova = Integer.MAX_VALUE;
		int notaMulherMaisNova = 0;
		int notaMulherMaisDe50Anos = 0;
		int contadorMulherMaisDe50Anos = 0;
		int contador = 0;
		int contadorHomens = 0;
		double mediaDasNotasHomens = 0;
		double mediaDasNotas = 0;

		for (int i = 0; i < 30; i++) {
			System.out.println("Bem vindo ao Cinema!");
			System.out.println("Escolha qual sexo você se identifica: ");
			System.out.println("1 - Feminino");
			System.out.println("2 - Masculino");

			int sexos = input.nextInt();
			if(sexos < 1 || sexos > 2) {
				System.err.println("Digite uma opção Válida");
				return;
			}
			
			System.out.println("Dê uma nota para o cinema de 0 até 10");
			int notas = input.nextInt();
			if(notas < 0 || notas > 10) {
				System.err.println("Digite uma nota Válida");
				return;
			}

			System.out.println("Insira a sua idade");
			int idades = input.nextInt();
			if(idades < 0 || idades > 200) {
				System.err.println("Digite uma nota Válida");
				return;
			}
			// pega a soma das idades geral e conta quantas pessoas 
			if (sexos == 1 || sexos == 2) {
				somaDasNotas += notas;
				contador++;
				mediaDasNotas = somaDasNotas / contador;
			}

			// pega a idade da mulher mais nova e a sua nota
			if (sexos == 1 && idades < mulherMaisNova) {
				mulherMaisNova = idades;
				notaMulherMaisNova = notas;
			}
			
			// pega quantas mulheres tem acima de 50 anos 
			// e quantas dessas deram a nota superior a média geral das notas
			if (sexos == 1 && idades > 50) {
				notaMulherMaisDe50Anos = notas;
				if(notaMulherMaisDe50Anos > mediaDasNotas) {
					contadorMulherMaisDe50Anos++;
				}
			}

			// soma a nota dos homens e conta quantos homens dera nota
			if (sexos == 2) {
				somaDasNotasHomens += notas;
				contadorHomens++;
				mediaDasNotasHomens = somaDasNotasHomens / contadorHomens;
			}
			


		}
		
		System.out.println("A média geral das notas é: " + mediaDasNotas);
		System.out.println("A média das notas dos homens é : " + mediaDasNotasHomens);
		System.out.println("A mulher mais nova tem  " + mulherMaisNova + " anos e sua nota foi" + notaMulherMaisNova);
		System.out.println(contadorMulherMaisDe50Anos + " mulher acima de 50 anos deram a nota superior a média geral");
		
	}
}

























