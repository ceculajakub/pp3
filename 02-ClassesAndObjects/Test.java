public class Test {

	public static void main(String[] args){
        Task16();
	}


    public static void Task16()
    {
        Student student = new Student();
        student.name = "Jakub";
        student.age = 21;

        student.sayHello();
        student.displayName();
        student.displayAge();
    }

    public static void Task18()
    {
        Student firstStudent = new Student();
        Student secondStudent = new Student();

        firstStudent.name = "Jakub";
        firstStudent.age = 21;
        secondStudent.name = "Kacper";
        secondStudent.age = 60;

        firstStudent.sayHello();
        firstStudent.displayName();
        firstStudent.displayAge();
        System.out.println();
        secondStudent.sayHello();
        secondStudent.displayName();
        secondStudent.displayAge();

    }

    public static void Task19()
    {
        Student firstStudent = new Student();
        Student secondStudent = new Student();

        firstStudent.name = "Jakub";
        firstStudent.cardId = "1";
        firstStudent.hasValidStudentCardId = true;
        firstStudent.semesterNumber = 3;
        firstStudent.averageGrade = 3.5f;

        secondStudent.name = "Kacper";
        secondStudent.cardId = "2";
        secondStudent.hasValidStudentCardId = false;
        secondStudent.semesterNumber = 6;
        secondStudent.averageGrade = 4.75f;

        firstStudent.displayStudentDetails();
        firstStudent.changeStudentCardIdStatus(false);
        firstStudent.displayNameCardIdAndStatus();

        secondStudent.displayStudentDetails();
        secondStudent.changeStudentCardIdStatus(true);
        secondStudent.displayNameCardIdAndStatus();
    }
}

