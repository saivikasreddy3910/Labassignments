import java.util.*;
import java.util.stream.*;
public class Exercise3
{
    public static void main(String[] args) {
    Integer[] intArray = {2,4,8,16,32,64,128,256,512};
 
    System.out.println("Original Array:");
    for(int i=0;i<intArray.length;i++)
         System.out.print(intArray[i] + "  ");
     
    System.out.println();
     
    System.out.println("Original Array printed in reverse order:");
         for(int i=intArray.length-1;i>=0;i--)
         System.out.print(intArray[i] + "  ");
    }
}
