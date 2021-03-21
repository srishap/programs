 class Leap {
   public static void main(String[] args)
    {
       int year = 2016;
       // or we can do by using nested if-else but 400 else shud written and else condition written separate
            
       if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
               System.out.println("Year " + year + " is a leap year");
       else
               System.out.println("Year " + year + " is not a leap year");
    }
}
