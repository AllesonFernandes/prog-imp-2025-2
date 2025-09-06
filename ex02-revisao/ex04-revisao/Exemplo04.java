import java.util.Scanner;

public class Exemplo04 {
    public static final int qtd = 5;
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        int[] numero1 = new int[qtd];
        int[] numero2 = new int[qtd];
        int[] somaVetores = new int[qtd];
        System.out.println("preencha o 1º vetor");
        preencherVetor(numero1);
        System.out.println("preencher o 2º vetor");
        preencherVetor(numero2);
        somar(numero1, numero2, somaVetores);
        System.out.print("numeros1 = ");
        imprimir(numero1);
        System.out.print("numeros1 = ");
        imprimir(numero1);
        System.out.print("soma = ");
        imprimir(somaVetores);


    }

    public static void preencherVetor(int[] v) {
        for(int i = 0; i < v.length; i++){
            System.out.println("Digite o " + (i + 1) + "º numero: ");
            v[i] = scan.nextInt();
        }
    }


    public static void imprimir(int[] v){
        System.out.print("{");
        if(v.length > 0){
            System.out.print(" " + v[0]);
        }
        for(int i = 1; i < v.length; i += 1) {
            System.out.print(", " + v[i]);
        }
        System.out.println(" }");
    }

    public static void somar(int[] v1, int[] v2, int[] vs){
        if(v1.length != v2.length || v1.length != vs.length) {
            System.out.println("Impossível");
            return;
        }
        for(int i = 0; i < v1.length; i += 1){
            vs[i] = v1[i] + v2[i];
        }

    }
}

