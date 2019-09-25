

public class FirstHundredFibonacci
{
  public static void fibonacci()
  {
    int prev = 1;
    int current = 1;
    int sum = 0;
    
    System.out.println(sum);
    System.out.println(prev);
    System.out.println(current);
    for(int x = 0; x < 98; x++)
    {
      sum = prev + current;
      System.out.println(sum);
      prev = current;
      current = sum; 
    }
  
  
  }
   
   public static void main(String [] args)
   {
     fibonacci(); 
   }
  






}