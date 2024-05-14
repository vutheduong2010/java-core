public class Department {
    private int id;
    private String name;

    // Constructor không có parameters
    public Department() {
        this.id = 0;
        this.name = "Unknown";
    }

    // Constructor có 1 parameter là nameDepartment, default id = 0
    public Department(String name) {
        this.id = 0;
        this.name = name;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setNameDepartment(String nameDepartment) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", nameDepartment='" + name + '\'' +
                '}';
    }
}
