import java.util.*;
import javax.swing.*;

public class CalculateGraphics 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x;
        float a , b, c;
        double x1 , x2 , x3 , Delta;
        char ch;
        String r , z , y , m;
        
        try
        {
            while (true)
            {
                String n = JOptionPane.showInputDialog(null, "Welcome to Calculator\n1.Multiply(x)\n2.Plus(+)"
                        + "\n3.Minus(-)\n4.Divide(÷)\n5.Pow(^)\n6.Radical(√)\n7.(a*x)^2 + b*x + c = 0"
                        ,"Calculator" , JOptionPane.INFORMATION_MESSAGE);
                    x = Integer.parseInt(n);

                if (x == 6)
                {
                    z = JOptionPane.showInputDialog(null, "Enter a:", "Input", JOptionPane.QUESTION_MESSAGE);
                        a = Float.parseFloat(z);
                    String sqrt = String.format("√%f = %.2f", a , Math.sqrt(a));
                    JOptionPane.showMessageDialog(null, sqrt ,"Calculator" , JOptionPane.PLAIN_MESSAGE);

                    r = JOptionPane.showInputDialog(null,"Do you want Continue ? [Y/N] :" , "Question", JOptionPane.QUESTION_MESSAGE);
                        ch = r.toLowerCase().charAt(0);
                    if (ch == 'y')
                        continue;
                    else
                    {
                    JOptionPane.showMessageDialog(null, "Goodbye!",null ,JOptionPane.OK_OPTION);
                        break;
                    }
                }
                else if (x == 7)
                {
                    z = JOptionPane.showInputDialog(null, "Enter a:", "Input", JOptionPane.QUESTION_MESSAGE);
                        a = Float.parseFloat(z);
                    y = JOptionPane.showInputDialog(null, "Enter b:", "Input", JOptionPane.QUESTION_MESSAGE);
                        b = Float.parseFloat(y);
                    m = JOptionPane.showInputDialog(null , "Enter c: ", "Input", JOptionPane.QUESTION_MESSAGE);
                        c = Float.parseFloat(m);

                    Delta = (b*b) - 4*a*c;
                    if (Delta > 0) 
                    {
                        x1 = (-b + Math.sqrt(Delta)) / (2*a);
                        x2 = (-b - Math.sqrt(Delta)) / (2*a);
                        String d1 = String.format("x1 = %.2f , x2 = %.2f", x1, x2);
                        JOptionPane.showMessageDialog(null, d1 ,"Calculator" , JOptionPane.PLAIN_MESSAGE);
                    }
                    else if(Delta == 0)
                    {
                        x3 = -b/(2*a);
                        String d2 = String.format("x = %.2f", x3);
                        JOptionPane.showMessageDialog(null, d2 ,"Calculator" , JOptionPane.PLAIN_MESSAGE);
                    }
                    else
                    {
                        String d3 = String.format("(%.2f*x)^2 + %.2f*x + %.2f = No Roots!", a, b, c);
                        JOptionPane.showMessageDialog(null, d3 ,"Calculator" , JOptionPane.PLAIN_MESSAGE);
                    }
                }
                else
                {
                    z = JOptionPane.showInputDialog(null, "Enter a:", "Input", JOptionPane.QUESTION_MESSAGE);
                        a = Float.parseFloat(z);

                    y = JOptionPane.showInputDialog(null, "Enter b:", "Input", JOptionPane.QUESTION_MESSAGE);
                        b = Float.parseFloat(y);   
                    switch(x)
                    {
                        case 1:
                            String multiply = String.format("%.2f x %.2f = %.2f", a , b , a*b);
                            JOptionPane.showMessageDialog(null, multiply ,"Calculator" , JOptionPane.PLAIN_MESSAGE);
                                break;
                        case 2:
                            String plus = String.format("%.2f + %.2f = %.2f", a , b , a+b);
                            JOptionPane.showMessageDialog(null, plus ,"Calculator" , JOptionPane.PLAIN_MESSAGE);
                                break;
                        case 3:
                            String minus = String.format("%.2f - %.2f = %.2f", a , b , a-b);
                            JOptionPane.showMessageDialog(null, minus ,"Calculator" , JOptionPane.PLAIN_MESSAGE);
                                break;
                        case 4:
                                String divide = String.format("%.2f ÷ %.2f = %.2f", a , b , a/b);
                                JOptionPane.showMessageDialog(null, divide ,"Calculator" , JOptionPane.PLAIN_MESSAGE);
                                break;
                        case 5:
                            String pow = String.format("%.2f ^ %.2f = %.2f", a , b , Math.pow(a, b));
                            JOptionPane.showMessageDialog(null, pow ,"Calculator" , JOptionPane.PLAIN_MESSAGE);
                                break;
                        default:
                            JOptionPane.showMessageDialog(null, "ERROR!" ,"Calculator" , JOptionPane.WARNING_MESSAGE);
                    }
                }              
                r = JOptionPane.showInputDialog(null,"Do you want Continue ? [Y/N] :" , "Question", JOptionPane.QUESTION_MESSAGE);
                    ch = r.toLowerCase().charAt(0);
                if (ch == 'y')
                    continue;
                else
                {
                    JOptionPane.showMessageDialog(null, "Goodbye!",null ,JOptionPane.PLAIN_MESSAGE);
                        break;
                }
            }
        }
        catch(Exception e){}
    }
}
