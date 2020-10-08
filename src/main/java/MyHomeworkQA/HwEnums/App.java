package MyHomeworkQA.HwEnums;

public class App {

    public static void main(String[] args) {
        Student student1 = new Student("Harris Abe", 17, ClassLevel.JUNIOR);
        Student student2 = new Student("Gloria Kelly", 15, ClassLevel.FRESHMAN);

        Courses[] student1Courses = {Courses.COMP_SCI,Courses.ENGLISH,Courses.MATHS};

        Courses[] student2Courses = {Courses.COMP_SCI,Courses.ENGLISH, Courses.MUSIC,
                Courses.GEOGRAPHY,Courses.PHYS_ED};

        student1.addCourses(student1Courses);
        student2.addCourses(student2Courses);

        student1.displayStudentInfo();
        student2.displayStudentInfo();


        Teacher saul = new Teacher("Saul Whitaker", new Courses[]{Courses.PHYS_ED,Courses.MUSIC});
        Teacher patty = new Teacher("Patty Ryan", new Courses[]{Courses.BIOLOGY,Courses.COMP_SCI});

        patty.displayTeacherInfo();
        saul.displayTeacherInfo();

    }

}
