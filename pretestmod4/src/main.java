class student {
    String name;
    Integer age;
    String jurusan;

    public student(String name, Integer age, String jurusan) {

        this.name = name;
        this.age = age;
        this.jurusan = jurusan;

    }
}
public class App {
    public static void main(String[] args) throws Exception {
        student student1 = new student("Silviana", 19, "Ilmu komputer");
    }
}