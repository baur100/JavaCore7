package MyHomeworkQA.HwEnums;


import java.util.Arrays;

public class Student {

    private String fullName;
    private int age;

    private ClassLevel studentLevel;
    private Courses[] myCourses = new Courses[5];

    public Student(String name, int age, ClassLevel level)
    {
        this.fullName = name;
        this.age = age;
        this.studentLevel = level;
    }

    public void addCourses(Courses[] courses)
    {
        if (courses.length <= 5)
        {
            this.myCourses = courses;
            System.out.println("Number of courses added: "+courses.length);
        }
        else
        {
            System.out.println("Maximum course load exceeded (5)");
        }
    }

    public String getFullName(){
        return this.fullName;
    }

    public String getCourses(){
        return "Courses: "+Arrays.toString(myCourses);
    }

    public int getAge(){
        return this.age;
    }

    public ClassLevel getStudentLevel() {
        return this.studentLevel;
    }

    public void displayStudentInfo(){
        System.out.println("\nName: "+getFullName()+", Age:"+getAge()+"\n+++++++++++++++++++\n"+
                "Level: "+getStudentLevel()+"\n+++++++++++++++++++\n"+getCourses());
    }
}
