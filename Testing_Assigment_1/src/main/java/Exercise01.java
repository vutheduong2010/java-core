public class Exercise01 {
    // Question 1a: Constructor không có parameters
    public void question1a() {
        Department department1 = new Department();
        System.out.println(department1);
    }

    // Question 1b: Constructor có 1 parameter là nameDepartment, default id = 0
    public void question1b() {
        Department department2 = new Department("Human Resources");
        System.out.println(department2);
    }

    public static void main(String[] args) {
        Exercise01 exercise1 = new Exercise01();
        exercise1.question1a();
        exercise1.question1b();
    }



}

