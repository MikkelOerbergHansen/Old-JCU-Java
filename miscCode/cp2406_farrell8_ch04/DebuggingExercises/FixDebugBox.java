package DebuggingExercises;

class FixDebugBox
{
   private int width;
   private int length;
   private int height;
   FixDebugBox()
   {
      length = 1;
      width = 1;
      height = 1;
   }
   FixDebugBox(int MyWidth, int MyLength, int MyHeight)
   {
      width = MyWidth;
      length = MyLength;
      height = MyHeight;
   }
   void showData()
   {
     System.out.println("Width: "  + width + "  Length: " +
       length + "  Height: " + height);
   }
   double getVolume()
   { 
     return (length * width * height);
   }
}
