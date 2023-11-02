public class Task22 {
    public static void main(String[] args) {
        int speed = 25;
        displaySpeed(speed);
        boolean validationResult = validateSpeed(speed);
        displayValidationResult(validationResult);
    }

    public static void displaySpeed(int speed)
    {
        System.out.println(String.format("Vehicle speed: %s ", speed));
    }

    public static boolean validateSpeed(int speed)
    {
        return (speed < 40 || speed > 140 ) ? false : true;
    }

    public static void displayValidationResult(boolean result)
    {
        System.out.println(String.format("Speed is valid: %s", result));
    }
}
