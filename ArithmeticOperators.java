import java.lang.Math.*;

public class ArithmeticOperators
{
 //Demonstrate the basic arithmethic operators 
 public static void main(String[] args)
 {
  // arithmethic using intergers 
  char tab = 9;
  char lyn = 10;
  int i = 1 + 1; // sum = augend + addend i = 2
  int n = i * 3; //Product = multiplicand x multiplier n = 6
  int m = (n/4); // Quotient = Dividend / Divisor (interger division) m = 1
  int m2 = n % 4; // m2 = 2 
  int p = m - i; // Difference = Minuend - subtrehend p = -1
  int o = n % 4; // Modulus operator returns the remainder o = 2
  int q = -p;    // q = 1
  int x = 5;  
  int y = 6;
  int z = y/x;  //Interger division z = 1
  System.out.println(lyn + "interger Arithmethic");
  System.out.printf("%s%c%s%d%n","Printf # 1",tab,"i =\t",i);
  System.out.printf("%s%c%s%d%n","Printf # 2",tab,"n =\t",n);
  System.out.printf("%s%c%s%d%n","Printf # 3",tab,"m =\t",m);
  System.out.printf("%s%s%d%n","Printf # 3B"," m2 = \t",m2);
  System.out.printf("%s%c%s%d%n","Printf # 4",tab,"o =\t",o);
  System.out.printf("%s%c%s%d%n","Printf # 5",tab,"p =\t",p);
  System.out.printf("%s%c%s%d%n","Printf # 6",tab,"q =\t",q);
  System.out.printf("%s%c%s%d%n","Printf # 7",tab,"x =\t",x);
  System.out.printf("%s%c%s%d%n","Printf # 8",tab,"y =\t",y);
  System.out.printf("%s%c%s%d%n","Printf # 9",tab,"z =\t",z);
  // When you Pre-increment, the value is incremented first then its used
  System.out.print(lyn + "Pre-incrementation and Post-incrementation" + lyn);
  System.out.print("llla. Answer to ++x: When x = [" + x +
                    "] and you pre-increment it, x becomes: " + (++x) + lyn);
  // When you pre-decrement, the value is decremented first then its used
  System.out.print("lllb. Answer to --x: When x = [" + x +
                    "] and you pre-decrement it, x becomes: " + (--x) + lyn);
  // When you post increment, the value is used first and then its incremented
  System.out.print("lllc. Answer to y++: When y = [" + y + "] you print the [" + y++ +
                    "] and then you increment it: " + y + lyn);
  //When you post decrement, the value is used first and then its decremented
  System.out.print("llld. Answer to y--: When y = [" + y + "] you print the [" + y-- +
                    "] and then you decrement it: " + y + lyn);
  // arithmetic using doubles
  System.out.print("\nFloating Point Arithmetric");
  double a;
  double b;
  double c;
  double d;
  double e;
  System.out.println("F1.a = " + (a = 1 + 1)); //a = 2.0
  System.out.println("F2.b = " + (b = a * 3)); //b = 6.0
  System.out.println("F3.c = " + (c = b / 4)); //c = 1.5
  System.out.println("F4.d = " + (d = c - a)); //d = -0.5
  System.out.println("F5.e = " + (e = -d)); // e = 0.5
  System.out.println("" + lyn + "Math Class l");
  System.out.println("la.x [" + x + "] to the second power = " + Math.pow(x,2) + lyn);
  System.out.println("Math Class ll");
  System.out.println("lla. The square root of b ["+ b +"] = " + 
            String.format("%.2f", Math.sqrt(b)));
  System.out.println("llb. The Square of b [" + b + "], equals [" +
            String.format("%.2f", Math.sqrt(b)) + 
            "] raised to the second power = " + 
            String.format("%.4f",Math.pow(Math.sqrt(b),2)));
  System.out.println("llc. The square root of b [" + b +"], equals [" +
            String.format("%.2f", Math.pow(b,.5)) + "]" + lyn);
  System.out.println("End of Execution!");
 }
}