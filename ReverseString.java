

public class ReverseString
{
  public static void main(String[] args)
  {
    String s = "Majorson";
    int x = s.length();
    String rev = "";
    for(int i = x-1; i>=0; i--)
    {
      rev += s.charAt(i);
    }
    System.out.println(rev);
  
  
  }
   


}