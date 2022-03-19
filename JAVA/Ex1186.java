import java.util.Scanner;

public class Ex1186{ // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);
        float[][] mat = new float[12][12];

        // Variáveis & Objeto
        String somaOuMedia = sc.nextLine();
        float soma = 0f;
        int cont = 0;

        // Processamento
        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 12; j++){
                mat[i][j] = sc.nextFloat();
                if (i + j > 11  ) {
                    soma += mat[i][j];
                    cont++;
                }
            }
        }
        sc.close();
        // Saída
        switch(somaOuMedia){
            case "S":
            System.out.printf("%.1f\n", soma);
            break;
            case "M": 
            System.out.printf("%.1f\n", soma / cont);
            break;
        }
    }
}