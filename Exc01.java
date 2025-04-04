public class Exc01 {
    public static void main(String[] args) {
        // Criação da matriz 12x2
        double[][] matriz = new double[12][2];

        // Preenchendo a primeira coluna com os meses (1 a 12)
        for (int i = 0; i < 12; i++) {
            matriz[i][0] = i + 1; // Meses de 1 a 12
        }

        // Preenchendo a segunda coluna com valores de lucro fictícios
        matriz[0][1] = 2000;  // Janeiro
        matriz[1][1] = 1500;  // Fevereiro
        matriz[2][1] = 1800;  // Março
        matriz[3][1] = 2200;  // Abril
        matriz[4][1] = 2500;  // Maio
        matriz[5][1] = 3000;  // Junho
        matriz[6][1] = 2800;  // Julho
        matriz[7][1] = 2600;  // Agosto
        matriz[8][1] = 2400;  // Setembro
        matriz[9][1] = 2300;  // Outubro
        matriz[10][1] = 2700; // Novembro
        matriz[11][1] = 3200; // Dezembro

        // Imprimindo os resultados no formato solicitado
        for (int i = 0; i < 12; i++) {
            System.out.printf("No mês %.0f a loja teve %.0f de lucro%n", matriz[i][0], matriz[i][1]);
        }
    }
}