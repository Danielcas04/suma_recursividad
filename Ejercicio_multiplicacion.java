public class Ejercicio_multiplicacion {
public static int Multi(int a, int b){
		if(a== 0 || b==0)
			return 0;
			
		else 
			return a+Multi(a,b-1);
		
	}

    public static void main(String[] args) {
        int D=9,K=4;
		
		
     
        System.out.println("La multiplicacion de "+D+" * "+K+" es= "+Multi(D,K));
    
    
    }

     
  
    
}