package hanoi;


/** 

 * Clase que modela una torre de hanoi 

 */ 

import java.util.Stack; //importamos el paquete de pilas 

 

public class TorreHanoi { 

    //atributos 

    private Stack<Integer> pilaTorre = new Stack<Integer>(); //pila de discos 

    private String nombreTorre; //nombre de la Torre 

    public Stack<Integer> getPilaTorre() {
		return pilaTorre;
	}







	public void setPilaTorre(Stack<Integer> pilaTorre) {
		this.pilaTorre = pilaTorre;
	}
     

    /** 

     * Constructor al que se le pasa la Torre y crea una torre vacía 

     */ 

    public TorreHanoi(String nombreTorre) { 

        this.nombreTorre = nombreTorre; 

    } 

     

     

     

    /** 

     * Crea una Torre de Hanoi con el nombre que se le pasa y los n discos 

     */ 

    public  TorreHanoi (String nombre, int n){ 

        nombreTorre=nombre; 

        	for (int i=n; i>=1; i--){ 

        		getPilaTorre().push(i); 

        	} 
    }
    
    public String nombre () {
    	return this.nombreTorre;
    }
    
    @Override 

    public String toString() { 

        StringBuilder estadoTorre = new StringBuilder(); 

        estadoTorre.append("La torre "); 

        estadoTorre.append(nombreTorre); 

        estadoTorre.append(" contiene: "); 

        estadoTorre.append(pilaTorre.toString()); 

        return estadoTorre.toString(); 

    } 

} 








	 

 









