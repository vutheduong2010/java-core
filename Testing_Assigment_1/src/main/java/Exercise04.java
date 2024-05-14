public class Exercise04 {
    public void demo() {
        // Tạo đối tượng Student
        Student student1 = new Student("Nguyen Van A", "Hanoi");
        student1.printStudentInfo();

        // Set điểm học lực
        student1.setGrade(3.5f);
        student1.printStudentInfo();

        // Cộng thêm điểm học lực
        student1.addGrade(2.0f);
        student1.printStudentInfo();

        // Tạo đối tượng Student khác
        Student student2 = new Student("Le Thi B", "HCM City");
        student2.setGrade(7.0f);
        student2.printStudentInfo();
    }

    public static void main(String[] args) {
        Exercise04 exercise04 = new Exercise04();
        exercise04.demo();
    }
}
