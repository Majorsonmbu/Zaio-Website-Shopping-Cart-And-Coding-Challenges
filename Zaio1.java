

public class Zaio1
{
    public static void main(String[] args)
    {
      int x;
      for( x = 1; x <=100; x++)
      {
         if( x % 3 == 0)
         {
           if ( x % 3==0 && x % 5==0)
           {
            System.out.println("FizzBuzz");
            }
           else
           {
             System.out.println("Fizz");
           }        
         }
         else if( x % 5 == 0)
         {
           if ( x % 3==0 && x % 5==0)
           {
            System.out.println("FizzBuzz");
            }
           else
           {
            System.out.println("Buzz");
            }
         }
         
         else{
              System.out.println(x);
            }
         
      }
    
    }

}