public abstract class  DebugBoat
{
    String boatType;
   public int passengers;
   public String power;

   public DebugBoat(String bt)
   {
      boatType = bt;
   }

   // override equals() method to satisfy
   // requirements of Debug Exercise 3.
   public boolean equals(DebugBoat otherBoat)
   {
      boolean result;
      if((passengers == otherBoat.passengers) && (power.equals(otherBoat.power)))
         result = true;
      else
         result = false;
      return result;
   }


   @Override
   public String toString()
   {
      return("This " + boatType + "boat carries " + passengers +
        " and is powered by " + power);
   }

   public abstract void setPower();
   public abstract void setPassengers();


}