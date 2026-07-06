public class MVCPatternTest {

    public static void main(String[] args) {

        // Create Model
        Student student = new Student("Jyothika", 101, "A");

        // Create View
        StudentView view = new StudentView();

        // Create Controller
        StudentController controller = new StudentController(student, view);

        // Display Initial Details
        System.out.println("Initial Student Details:\n");
        controller.updateView();

        System.out.println();

        // Update Student Details
        controller.setStudentName("Sai Jyothika");
        controller.setStudentGrade("A+");

        // Display Updated Details
        System.out.println("Updated Student Details:\n");
        controller.updateView();

    }

}