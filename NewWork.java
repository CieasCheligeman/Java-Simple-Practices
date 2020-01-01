import java.util.Scanner;
import java.util.ArrayList;
public class NewWork
{
public static void main (String[] args)
   {   
       String [] list = { "against" , "forms" , "belief" , "government" , "democratic" , "movement" , "understanding"};
       //test code: expected outcome should be like abcdefg
       sortAndPrint(list);
    } 
   public static void sortAndPrint (String [] list)
   {   
      ArrayList<String> ff = new ArrayList<String>();
      String [] k = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o"
          ,"p","q","r","s","t","u"
          ,"v","w","x","y","z"};//24 abc.
      for ( int i = 0; i < k.length; i ++)
      {   for (int c = 0; c < list.length; c++)
          {if ( k[i].compareTo(list[c].substring(0,1)) == 0 )
            {       ff.add(list[c]);}}
      
}
System.out.println(ff);
}
}