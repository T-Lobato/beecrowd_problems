public class Ex1155 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        
        // Processamento
        double s = 1.5;
        for(int i = 3; i < 101; i++) { 
            s +=  1.0/i;
        }
        // Saída
        System.out.printf("%.2f\n", s);
    }
}