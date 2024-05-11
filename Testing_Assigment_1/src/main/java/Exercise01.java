public class Exercise01 {
    void question01 () {
        Department department = new Department();
        department.departmentName = "Bảo vệ";
        Account account = new Account();

        if (account.department == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là: " + account.department.departmentName);
        }
    }

    void question02 () {
        Department department = new Department();
        department.departmentName = "Bảo vệ";
        Account account = new Account();

        String result = (account.department == null) ? "Nhân viên chưa có phòng ban" : "Phòng ban của nhân viên này là: " +account.department.departmentName;
        System.out.println(result);
    }

    void question04 () {
        Account account1 = new Account();
        account1.position = "Dev";

        String result = (account1.position == "Dev") ? "Đây là Developer" : "Người này không phải là Developer";
        System.out.println(result);

    }

    void question07 () {
        Account account1 = new Account();
        account1.position = "Dev";

        switch (account1.position) {
            case "Dev":
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Người này không phải là Developer");
                break;
        }
    }


}

