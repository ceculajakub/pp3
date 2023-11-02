public class Task27 {
    public static void main(String[] args) {
        Lamp firstLamp = new Lamp(false);
        Lamp secondLamp = new Lamp(false);

        firstLamp.switchOn();
        secondLamp.switchOff();
        firstLamp.displayStatus();
        secondLamp.displayStatus();
    }
}
