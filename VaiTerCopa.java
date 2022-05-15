
package vai.ter.copa;
import java.util.Scanner;
/**
 *
 * @author Vitor
 */
public class VaiTerCopa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       int N =0;
       do{
           N = in.nextInt();
           if(N>=1){
               System.out.println("vai ter duas!");
           }else{
               System.out.println("vai ter copa!");
           }
       }while(in.hasNext());
    }
    
}
