// An employee ID can't be more than 999
// Keep executing until user enters four valid employee IDs
// This program throws a FixDebugEmployeeIDException
package miscCode.cp2406_farrell8_ch12.DebuggingExercises;

import javax.swing.*;
public class FixDebugTwelve4
{
   public static void main(String[] args) throws Exception
   {
      String inStr, outString = "";
      final int MAX = 999;
      int[] emp = new int[4];
      for(int x = 0; x < emp.length; ++x)
      {
         inStr = JOptionPane.showInputDialog(null, "Enter employee ID number");  
         try
         {
            emp[x] = Integer.parseInt(inStr);
            if(emp[x] > MAX)
            {
               throw(new DebugEmployeeIDException());
            }
         }
         catch(NumberFormatException error)
         {	
            --x;
            JOptionPane.showMessageDialog(null, inStr + "\nNonnumeric ID");
         }
         catch(DebugEmployeeIDException error)
         {	
	    --x;
            JOptionPane.showMessageDialog(null, "Number too high " + emp[x+1]);
         }
      }
      for(int x = 0; x < emp.length; ++x)
      {
         outString = outString + emp[x] + " ";
      }
      JOptionPane.showMessageDialog(null, "Four valid IDS are: " + outString);    
   }
}