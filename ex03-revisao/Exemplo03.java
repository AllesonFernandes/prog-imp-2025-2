import java.util.Scanner;

public class Exemplo03 {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] v = new int[10];
        preencherVetorDigitação(v);
        preencherVetorImpares(v);
        
    }

    public static void preencherVetorDigitação(int[] v) {
        for (int i = 0; i < v.length; i += 1) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            v[i] = scan.nextInt();
        }
    }

    public static void preencherVetorImpares(int[] v){
        for(int i = 0; i < v.length; i+= 1){
            v[i] = 2 * i + 11;
        }
    }

    public static int buscaSequencial(int[] v, int tam, int x) {
        for (int i = 0; i < tam; i++) {
            if (v[i] == x) {
                return i;
            }
        }
        return -1;
    }
};