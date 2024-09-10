package ex_cap3.exercicios;

public class exe07 {
    public static void main(String[] args) 
    {
        int x = 180;
        int y;

        while (x != 1)
        {
            if (x % 2 == 0) 
            {
                y = x/2;
            } 
            else 
            {
                y = 3 * x + 1;
            }

            System.out.println("Valor do y: " + y);

            if (y != 1) 
            {
                System.out.println("--------");
            }

            x = y;
            
        }
        
    }
}
