public class Lamp {
    boolean status = false;

    public Lamp(boolean status)
    {
        this.status = status;
    }

    public void switchOn()
    {
        status = true;
    }

    public void switchOff()
    {
        status = false;
    }

    public void displayStatus()
    {
        System.out.println(String.format("Lamp is: %s", status == true ? "on" : "off"));
    }
}
