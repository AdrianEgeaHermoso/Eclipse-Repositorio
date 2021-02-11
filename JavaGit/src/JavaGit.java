import java.util.Scanner;

/**
 * 
 */

/**
 * @author Adrian Egea Hermoso
 *
 */
public class JavaGit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("SIMULADOR DE NIEVE ");
	      System.out.println("-----------------");
	      System.out.println("-----------------");
	      System.out.println("1.DENSIDAD ALTA");
	      System.out.println("2.DENSIDAD MEDIA");
	      System.out.println("3.DENSIDAD ALTA");
	      System.out.println("Elija la densidad (1-3)");
	      
	      int densidad = Integer.parseInt(s.nextLine());
	      
	      int posibilidades=0;
	      
	      switch(densidad){
	        case 1:
	        posibilidades=4;
	        break;
	        case 2:
	        posibilidades=8;
	        break;
	        case 3:
	        posibilidades=20;
	        break;
	        default:
	        }
	      
	      for(int fila=0;fila<10;fila++){
	        for(int columna=0;columna<40;columna++){
	          if((int)(Math.random()*posibilidades)==0){
	        System.out.print("*");
	        }else{
	        System.out.print(" ");
	        }
	  
	    }
	  }
	      
	  

	}

}
