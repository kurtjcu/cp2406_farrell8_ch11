public class DebugRowboat extends DebugBoat
{
    public DebugRowboat()
    {
        super("row");
        setPassengers();
        setPower();
    }
    public void setPassengers()
    {
        super.passengers = 2;
    }
    public void setPower()
    {
        super.power = "oars";
    }

    public static void main(String[] args) {
        DebugRowboat boat = new DebugRowboat();
        System.out.println(boat);
    }
}