package Day1.quanlyhocsinh;

public class Student {
    private int id;
    private String name;
    private int score;
    private Class clazz;
    private Date date;

    public Student(int id, String name, int score, Class clazz, Date date) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.clazz = clazz;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;

    }

    public String printNameOfKhoa(){
        return clazz.getNameKhoa();
    }

    public boolean pass(){
        return this.score>=7;
    }

    public boolean checkDate(Student anotherStudent){
        return this.date.getDay()==anotherStudent.date.getDay();
    }

}
