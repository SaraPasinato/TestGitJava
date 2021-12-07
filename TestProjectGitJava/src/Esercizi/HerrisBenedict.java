package Esercizi;

import java.util.Scanner;

public class HerrisBenedict {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserire il tuo peso in kg:");
        int weight=scanner.nextInt();
        System.out.println("inserire la tua altezza in cm:");
        int h=scanner.nextInt();
        System.out.println("inserire la tua eta in anni:");
        int year=scanner.nextInt();
        double mbW,mbM;
        
        mbW = 655+(9.6 * weight)+ ( 1.8 * h) - (4.7 * year);
        mbM = 66 +(13.8 * weight)+(5.0 * h)- (6.8 * year);
        int snack=230;
        double nSnackW=mbW/snack;
        double nSnackM=mbM/snack;

        System.out.println("\nCalcolo Metabolismo basale:\n");

        System.out.println("\nDonna: \n\nPeso:"+weight +"kg \nAltezza: "+h+"cm\nAnni: "+year + "\nMB= "+ String.format("%,.2f", mbW));

        System.out.println("\nNumero di barrette di cioccolato da mangiare:"+(int)Math.floor(nSnackW)+"\n");


        System.out.println("\nUomo: \n\nPeso:"+weight +"kg \nAltezza: "+h+"cm\nAnni: "+year + "\nMB= "+String.format("%,.2f", mbM));
        System.out.println("\nNumero di barrette di cioccolato da mangiare:"+(int)Math.floor(nSnackM)+"\n");
        scanner.close();

    }
}
