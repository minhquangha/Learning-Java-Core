package Day1.quanlyhocsinh;

public class App {
    public static void main(String[] args) {
        Class class1 = new Class("10a1","k68");
        Date date1 = new Date(1,2,2023);
        Student student1 = new Student(1,"Quang", 9,class1,date1);
        Student student2 = new Student(2,"Quang", 9,class1,date1);
        System.out.println("Name of khoa: " + student1.getClazz().getNameKhoa());
        System.out.println("student 1 can pass?"+ student1.pass());
        System.out.println("so sanh ngay sinh: " +student1.checkDate(student2));
    }
}
