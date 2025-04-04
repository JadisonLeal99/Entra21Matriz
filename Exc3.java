import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definição do tamanho da matriz
        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();
        
        int[][] matriz1 = new int[linhas][colunas];
        int[][] matriz2 = new int[linhas][colunas];
        int[][] soma = new int[linhas][colunas];
        
        // Leitura da primeira matriz
        System.out.println("Digite os elementos da primeira matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz1[i][j] = scanner.nextInt();
            }
        }
        
        // Leitura da segunda matriz
        System.out.println("Digite os elementos da segunda matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz2[i][j] = scanner.nextInt();
            }
        }
        
        // Soma das matrizes
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        
        // Exibição do resultado
        System.out.println("A matriz resultante da soma é:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}