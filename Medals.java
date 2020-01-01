/**
   This program prints a table of medal winner counts with row totals.
*/
public class Medals
{
   public static void main(String[] args)
   {
      final int COUNTRIES = 8;
      final int MEDALS = 3;

      String[] countries = {  "United States", "Great Britain", "China", "Russia",
                              "Germany", "Japan", "French", "Korea" };

      // if counts is declared as:
      //    int[][] counts = new int[COUNTRIES][MEDALS];
      // modify the code to initialize counts.
      int[][] counts =  {   { 46, 37, 38 },
                            { 27, 23, 17 },
                            { 26, 18, 26 },
                            { 19, 18, 19 },
                            { 17, 10, 15 },
                            { 12, 8, 21 },
                            { 10, 18, 14 },
                            { 9, 3, 9 }
                        };
      
      System.out.println("        Country    Gold  Silver  Bronze   Total");
      
      // Print countries, counts, and row totals
      for (int i ...)
      {
         // Process the ith row
         System.out.printf("%15s", countries[i]);
  

         // Print each row element and update the row total
         for (int j ...)
         {
            System.out.printf("%7d", counts[i][j]);
            ...
         }
         
         // Display the row total and print a new line
         System.out.printf("%10d\n", total);
      }
   }
}
