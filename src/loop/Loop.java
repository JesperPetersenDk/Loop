
package loop;

public class Loop {

    public static void main(String[] args) {
        
        int kVal = 8;
        int kv = 1;
        
        //While loop
        while(kVal > 1)
        {
            kv *= kVal;
            kVal -= 1;
        }
        System.out.println(kv);
        
        //do-while loop
        int iVal = 6;
        do {
            System.out.println(iVal);
            iVal *= 8;
            System.out.println(iVal);
        }
        while(iVal < 100);
        
        //for
        for (int i = 0; i < 15; i++) {
            System.out.println(i);
        }
    }
    
}
