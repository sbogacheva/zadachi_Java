package TaskBonus;
import java.util.*;
public class Main
{
    public static void bonus(int a) 
    {
        if (a<0) 
        {
            System.out.println ("Incorrect data");}
            else 
            {
                if (a<40000) {
                System.out.println ("Премия равна = "+ (a*0.5));}
                else {
                    if(a>=80000) {
                   System.out.println ("Премия равна = "+ (a*1.1));}
                    else {
                        if((a>=40000)&&(a<80000)) {
                
                    System.out.println ("Премия равна = "+ (a*0.7));}
                    
                }
            }
        }
    }
            public static void main(String[]args){
                bonus(76666);
            }              
    
}
