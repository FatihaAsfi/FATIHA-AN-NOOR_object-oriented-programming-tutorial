package Week_6;

public class Main {

    public static void main(String[] args) {

        Lecturer lecturer = new Lecturer(
                "L100",
                "Dr Ahmed",
                "Java Programming",
                "Faculty of Information Technology"
        );

        lecturer.displayInfo();
        lecturer.displaySubject();
        lecturer.displayDepartment();
    }
}