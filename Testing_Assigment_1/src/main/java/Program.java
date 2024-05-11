import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {
    public static void main(String[] args) {
        // Khởi tạo Department
        Department department1 = new Department();
        department1.departmentID = 1;
        department1.departmentName = "IT";

        Department department2 = new Department();
        department2.departmentID = 2;
        department2.departmentName = "HR";

        Department department3 = new Department();
        department3.departmentID = 3;
        department3.departmentName = "Finance";
        System.out.println("department1 = " + department1);

        // Khởi tạo Position
        Position position1 = new Position();
        position1.positionID = 1;
        position1.positionName = "Web Developer";

        Position position2 = new Position();
        position2.positionID = 2;
        position2.positionName = "Software Engineer";

        Position position3 = new Position();
        position3.positionID = 3;
        position3.positionName = "Project Manager";
        System.out.println("position1 = " + position1);

        // Khởi tạo Account
        Account Account1 = new Account();
        Account1.email = "abc@gmail.com";
        Account1.username = "abc";
        Account1.fullname = "abc";
        Account1.department = department1;
        Account1.position = "Finance";
        Account1.createDate = LocalDate.now();

        Account Account2 = new Account();
        Account2.email = "abcd@gmail.com";
        Account2.username = "abcd";
        Account2.fullname = "abcd";
        Account2.department = department2;
        Account2.position = "Dev";
        Account2.createDate = LocalDate.now();

        Account Account3 = new Account();
        Account3.email = "abcde@gmail.com";
        Account3.username = "abcde";
        Account3.fullname = "abcde";
        Account3.department = department3;
        Account3.position = "IT";
        Account3.createDate = LocalDate.now();
        System.out.println("Account1 = " + Account1);


        // Khởi tạo Group
        Group group1 = new Group();
        group1.groupID = 1;
        group1.groupName = "Group1";
        group1.creator = Account1;
        group1.createDate = LocalDate.now();

        Group group2 = new Group();
        group1.groupID = 2;
        group1.groupName = "Group2";
        group1.creator = Account1;
        group1.createDate = LocalDate.now();

        Group group3 = new Group();
        group1.groupID = 3;
        group1.groupName = "Group3";
        group1.creator = Account1;
        group1.createDate = LocalDate.now();
        System.out.println("group2 = " + group2);

        // Khởi tạo GroupAccount
        GroupAccount groupAccount1 = new GroupAccount();
        groupAccount1.groupID = 1;
        groupAccount1.accountID = 1;

        GroupAccount groupAccount2 = new GroupAccount();
        groupAccount2.groupID = 2;
        groupAccount2.accountID = 2;

        GroupAccount groupAccount3 = new GroupAccount();
        groupAccount3.groupID = 3;
        groupAccount3.accountID = 3;
        System.out.println("groupAccount1 = " + groupAccount1);


        //  Khởi tạo TypeQuestion
        TypeQuestion typeQuestion1 = new TypeQuestion();
        typeQuestion1.typeID = 1;
        typeQuestion1.typeName = "Type1";

        TypeQuestion typeQuestion2 = new TypeQuestion();
        typeQuestion2.typeID = 2;
        typeQuestion2.typeName = "Type2";

        TypeQuestion typeQuestion3 = new TypeQuestion();
        typeQuestion3.typeID = 3;
        typeQuestion3.typeName = "Type3";
        System.out.println("typeQuestion1 = " + typeQuestion1);


        // Khởi tạo CategoryQuestion
        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
        categoryQuestion1.categoryID = 1;
        categoryQuestion1.categoryName = "Category1";

        CategoryQuestion categoryQuestion2 = new CategoryQuestion();
        categoryQuestion2.categoryID = 2;
        categoryQuestion2.categoryName = "Category2";

        CategoryQuestion categoryQuestion3 = new CategoryQuestion();
        categoryQuestion3.categoryID = 3;
        categoryQuestion3.categoryName = "Category3";
        System.out.println("categoryQuestion3 = " + categoryQuestion3);

        // Khởi tạo Question
        Question question1 = new Question();
        question1.questionID = 1;
        question1.content = "This is a question1";
        question1.category = categoryQuestion1;
        question1.type = typeQuestion1;
        question1.creator = Account1;
        question1.createDate = LocalDate.now();

        Question question2 = new Question();
        question2.questionID = 2;
        question2.content = "This is a question2";
        question2.category = categoryQuestion2;
        question2.type = typeQuestion2;
        question2.creator = Account2;
        question2.createDate = LocalDate.now();

        Question question3 = new Question();
        question3.questionID = 3;
        question3.content = "This is a question3";
        question3.category = categoryQuestion3;
        question3.type = typeQuestion3;
        question3.creator = Account3;
        question3.createDate = LocalDate.now();
        System.out.println("question1 = " + question1);

        // Khởi tạo Answer
        Answer answer1 = new Answer();
        answer1.answerID = 1;
        answer1.content = "This is a answer1";
        answer1.question = question1;
        answer1.isCorrect = true;

        Answer answer2 = new Answer();
        answer2.answerID = 2;
        answer2.content = "This is a answer2";
        answer2.question = question2;
        answer2.isCorrect = true;

        Answer answer3 = new Answer();
        answer3.answerID = 3;
        answer3.content = "This is a answer3";
        answer3.question = question3;
        answer3.isCorrect = false;
        System.out.println("answer1 = " + answer1);


        // Khởi tạo Exam]
        Exam exam1 = new Exam();
        exam1.examID = 1;
        exam1.code = "Code1";
        exam1.title = "Title1";
        exam1.category = categoryQuestion1;
        exam1.duration = 180;
        exam1.creator = Account1;
        exam1.createDate = LocalDateTime.now();

        Exam exam2 = new Exam();
        exam2.examID = 2;
        exam2.code = "Code2";
        exam2.title = "Title2";
        exam2.category = categoryQuestion2;
        exam2.duration = 180;
        exam2.creator = Account2;
        exam2.createDate = LocalDateTime.now();

        Exam exam3 = new Exam();
        exam3.examID = 3;
        exam3.code = "Code3";
        exam3.title = "Title3";
        exam3.category = categoryQuestion3;
        exam3.duration = 180;
        exam3.creator = Account3;
        exam3.createDate = LocalDateTime.now();
        System.out.println(exam1);


        // Khởi tạo ExamQuestion
        ExamQuestion examQuestion1 = new ExamQuestion();
        examQuestion1.examId = 1;
        examQuestion1.questionId = 1;

        ExamQuestion examQuestion2 = new ExamQuestion();
        examQuestion2.examId = 2;
        examQuestion2.questionId = 1;

        ExamQuestion examQuestion3 = new ExamQuestion();
        examQuestion2.examId = 1;
        examQuestion2.questionId = 1;
        System.out.println("examQuestion3 = " + examQuestion3);


    }
}
