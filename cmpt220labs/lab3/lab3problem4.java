
public class lab3problem4 {

	public static void main(String[] args){
        int n = 15000;
        while (prim(n) == false) {
            n--;
        }                                     
        System.out.println(n);                    

    }


    public static boolean prim(int y){
        int n = y;
        for(int x=2; x<n; x++){
            if(n%x == 0){
                return false;
            }

        }   
        return true;
    }
}