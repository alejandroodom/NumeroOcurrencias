import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indicar un valor comprendido entre 0 y 9 o -1 para terminar:");
        int valor = 0;
        int contador0 = 0;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        int contador6 = 0;
        int contador7 = 0;
        int contador8 = 0;
        int contador9 = 0;
        if(valor > -1 && valor < 10){
            valor = teclado.nextInt();
        }
        while(valor != -1){
            if(valor == 0){
                contador0++;
            }
            if(valor == 1){
                contador1++;
            }
            if(valor == 2){
                contador2++;
            }
            if(valor == 3){
                contador3++;
            }
            if(valor == 4){
                contador4++;
            }
            if(valor == 5){
                contador5++;
            }
            if(valor == 6){
                contador6++;
            }
            if(valor == 7){
                contador7++;
            }
            if(valor == 8){
                contador8++;
            }
            if(valor == 9){
                contador9++;
            }
            System.out.println("Otro valor, por favor o -1 para terminar...");
            valor = teclado.nextInt();

        }
        System.out.println("Cantidad de 0: " + contador0);
        System.out.println("Cantidad de 1: " + contador1);
        System.out.println("Cantidad de 2: " + contador2);
        System.out.println("Cantidad de 3: " + contador3);
        System.out.println("Cantidad de 4: " + contador4);
        System.out.println("Cantidad de 5: " + contador5);
        System.out.println("Cantidad de 6: " + contador6);
        System.out.println("Cantidad de 7: " + contador7);
        System.out.println("Cantidad de 8: " + contador8);
        System.out.println("Cantidad de 9: " + contador9);

    }
}