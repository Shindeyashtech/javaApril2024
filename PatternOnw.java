
public class PatternOnw {

    
    public static void main (String args[])
    {
        System.out.println("hello");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <9; j++) {

                if ((j == 6-i)|| (i == 3&&j<=7)||(j==4+i)) {
                    
                    System.out.print("*");
                }
                else{ 

                    System.out.println("*");
                }
            }
        }
    }
}