public class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    // Update Student Name
    public void setStudentName(String name) {
        model.setName(name);
    }

    // Update Student ID
    public void setStudentId(int id) {
        model.setId(id);
    }

    // Update Student Grade
    public void setStudentGrade(String grade) {
        model.setGrade(grade);
    }

    // Display Student Details
    public void updateView() {
        view.displayStudentDetails(
                model.getName(),
                model.getId(),
                model.getGrade()
        );
    }

}