package hanoi;
import java.util.*;
import fundamentos.*;

public class juego {
	private static int NUMMOV;
    public static void main(String[] args) {
    	Grafica g = new Grafica ("Juego de Hanoi", "Discos", "Movimientos");
    	Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Numero de discos: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
        	NUMMOV = 0;
        	System.out.println ("NUMERO DE DISCOS:" + i);
        	TorreHanoi torreA = new TorreHanoi ("Torre A", i);
        	TorreHanoi torreB = new TorreHanoi ("Torre B");
        	TorreHanoi torreC = new TorreHanoi ("Torre C");
        	hanoi (i, torreA, torreB, torreC);
        	System.out.println ("Se han necesitado "+ NUMMOV + " movimientos. \n");
        	g.inserta (i, NUMMOV);
        }
    	g.pinta();
    }

    public static void moverATorre(TorreHanoi origen, TorreHanoi destino) { 

        destino.getPilaTorre().push(origen.getPilaTorre().pop());
    } 

//Método Torres de Hanoi Recursivo
    public static void hanoi(int n, TorreHanoi origen, TorreHanoi aux, TorreHanoi destino){
		if(n==1) {

			NUMMOV++;
			System.out.println("Paso: " + NUMMOV);
			moverATorre (origen, destino);
			System.out.println("mover disco de " + origen.nombre() + " a " + destino.nombre());
			System.out.println(origen);
			System.out.println(destino);
		}
		else{
			hanoi(n-1, origen, destino, aux);
			
			moverATorre (origen, destino);

			NUMMOV++;
			System.out.println("Paso: " + NUMMOV);
			System.out.println("mover disco de "+ origen.nombre() + " a " + destino.nombre());

			System.out.println(origen);
			System.out.println(destino);
			
			hanoi(n-1, aux, origen, destino);
		}
    }
}
