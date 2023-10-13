public class Student {
    public String name;
    public int age;
    public String cardId;
    public boolean hasValidStudentCardId;
    public int semesterNumber;
    public float averageGrade;

    public void sayHello()
    {
        System.out.println("Hello from "+ name);
    }

    public void displayName()
    {
        System.out.println("Name: "+ name);
    }

    public void displayAge()
    {
        System.out.println("Age: "+ age);
    }

    public void displayStudentDetails()
    {
        System.out.println(name + " " + semesterNumber + " " + averageGrade );
    }
    
    public void changeStudentCardIdStatus(boolean status)
    {
        hasValidStudentCardId = status;
        System.out.println(hasValidStudentCardId ? "Valid" : "Invalid");
    }

    public void displayNameCardIdAndStatus()
    {
        String status = hasValidStudentCardId == true ? "Valid Student Card" : "Invalid Student Card";
        System.out.println(name + " " + cardId + " " + status);
    }


}