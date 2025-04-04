
public class Exc1 {
    public static void main(String[] args) {
        // Criando a matriz com 12 linhas e 2 colunas
        int[][] matriz = {
            {1, 2000}, {2, 1500}, {3, 1800}, {4, 2200},
            {5, 2100}, {6, 1900}, {7, 2300}, {8, 2500},
            {9, 2400}, {10, 2600}, {11, 2700}, {12, 2800}
        };
        
        // Imprimindo os resultados
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("No mês " + matriz[i][0] + " a loja teve " + matriz[i][1] + " de lucro.");
        }
    }
}
