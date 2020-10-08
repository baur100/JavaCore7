package MyHomeworkQA.HwEnums;

import java.util.Arrays;

public class Teacher {

    private String fullName;

    private Courses[] iTeach = new Courses[2];

    public Teacher(String name, Courses[] subjects)
    {
        if (subjects.length == 2)
        {
            this.fullName = name;
            this.iTeach = subjects;  // A teacher MUST teach two subjects
        }
        else {
            System.out.println("All teachers must teach 2 courses");
        }
    }

    public String getFullName(){
        return this.fullName;
    }

    public String getCourses(){
        return "Courses: "+Arrays.toString(iTeach);
    }

    public void displayTeacherInfo(){
        System.out.println("\nTeacher: "+getFullName()+"\n+++++++++++++++++++\n"+
                getCourses());
    }



    /*@Override
    public String toString() {
        return "Teacher{" +
                "fullName='" + fullName + '\'' +
                ", iTeach=" + Arrays.toString(iTeach) +
                '}';
    }*/
}
