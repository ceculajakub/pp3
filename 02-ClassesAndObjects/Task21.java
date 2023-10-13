
public class Task21 
{
    public static void main(String[] args)
    {
        int height = 170;
        double feetConverter = 0.032808399d;
        double inchesConverter = 0.393701d;
        double heightInInches = height * inchesConverter;
        double heightInFeet = height * feetConverter;

        System.out.println("I am "+ height +" tall, i.e. " + heightInFeet +" feet and " + heightInInches + " inches");

	}
}
