public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveStudentFromDB();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
    }

    private static Student retriveStudentFromDB() {
        Student student = new Student();
        student.setName("anthony0727");
        student.setRollNo("42");
        return student;
    }
}
