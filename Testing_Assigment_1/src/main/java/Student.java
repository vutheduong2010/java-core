public class Student {
    private int id;
    private String name;
    private String hometown;
    private float grade;

    private static int count = 0; // Static variable to keep track of the number of students

    // Constructor cho phép khởi tạo tên, hometown và điểm học lực = 0
    public Student(String name, String hometown) {
        this.id = ++count; // Auto-increment ID
        this.name = name;
        this.hometown = hometown;
        this.grade = 0.0f; // Default grade
    }

    // Method cho phép set điểm vào
    public void setGrade(float grade) {
        this.grade = grade;
    }

    // Method cho phép cộng thêm điểm
    public void addGrade(float grade) {
        this.grade += grade;
    }

    // Method để in ra thông tin của sinh viên
    public void printStudentInfo() {
        String academicPerformance;
        if (this.grade < 4.0) {
            academicPerformance = "Yếu";
        } else if (this.grade >= 4.0 && this.grade < 6.0) {
            academicPerformance = "Trung bình";
        } else if (this.grade >= 6.0 && this.grade < 8.0) {
            academicPerformance = "Khá";
        } else {
            academicPerformance = "Giỏi";
        }

        System.out.println("Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hometown='" + hometown + '\'' +
                ", grade=" + grade +
                ", academicPerformance='" + academicPerformance + '\'' +
                '}');
    }
}
