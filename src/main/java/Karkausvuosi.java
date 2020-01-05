
import java.util.Scanner;

public class Karkausvuosi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
   
        System.out.println("Anna vuosi:");
        
        int luku = Integer.valueOf(lukija.nextLine());  
        int jakojaannosneljasataa = luku % 400;
        int jakojaannossata = luku % 100;
        int jakojaannosnelja = luku % 4;
       

        if (jakojaannosnelja == 0 && !(jakojaannossata == 0) && !(jakojaannosneljasataa ==0)){
            System.out.println("Vuosi on karkausvuosi");
                     // Jaollinen 4:llä.
                     // Ei ole jaollinen 400:lla tai 100:lla
                     // On karkausvuosi
        } else if (jakojaannosnelja == 0 && jakojaannosneljasataa == 0 && jakojaannossata == 0){
            System.out.println("Vuosi on karkausvuosi.");
                   // Jaollinen 400:lla ja 100:lla ja 4:llä 
                   // On karkausvuosi
        
        } else if ((jakojaannosnelja == 0) && (jakojaannossata == 0) && !(jakojaannosneljasataa == 0)){      
            System.out.println("Vuosi ei ole karkausvuosi.");
                    // Jaollinen 4:llä ja 100:lla (mutta ei 400:lla) 
                    // Ei ole karkausvuosi.

        } else {
            System.out.println("Vuosi ei ole karkausvuosi");
        }
    }
}

