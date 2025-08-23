import java.util.Scanner;

public class Exemplo02 {
    public static Scanner scan = new Scanner(System.in);
    public static void main (String[] args) {
        int opcao;
        do {
            System.out.println("1. Imprimir valores de 1 a 100");
            System.out.println("2. Imprimir valores pares");
            System.out.println("3. Imprimir valores ímpares");
            System.out.println("4. Imprimir valores múltiplos de 3");
            System.out.println("5. Imprimir valores múltiplos de 3 ou terminados em 3");
            System.out.println("0. Sair do programa");
            
            opcao = scan.nextInt();

            if (opcao == 1) {
                for(int i = 1; i <= 100; i++){
                    System.out.print(i + ", ");
                }
            }
            else if (opcao == 2){
                for(int i = 2; i <= 100; i += 2){
                    System.out.print(i + ", ");
                }
            }
            else if (opcao == 3){
                for(int i = 1; i <= 99; i += 2){
                    System.out.print(i + ", ");
                }
            }
            else if (opcao == 4){
                for(int i = 3; i <= 99; i += 3){
                    System.out.print(i + ", ");
                }
            }

        }
        while(opcao != 0);
    }
}

