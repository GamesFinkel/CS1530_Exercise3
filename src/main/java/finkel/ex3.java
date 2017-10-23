package finkel;
public class ex3
{
public static void main(String[] args)
{
  if(args.length!=1)
  {
    System.out.println("Incorrect number of arguments!");
    System.exit(1);
  }
  try
  {
    int x = Integer.parseInt(args[0]);
    int t = tri(x);
    int l = LC(x);
    System.out.println("Tri("+x+") = "+t);
    System.out.println("Lazy("+x+") = "+l);
  }
  catch (NumberFormatException ex)
  {
    System.out.println("Enter an integer buddy");
    System.exit(1);
  }
}
public static int tri(int x)
{
  if(x<=1)
  return x;
  else return (x*(x+1))/2;

}
public static int LC(int x)
{
return (x*x+x+2)/2;
}
}
