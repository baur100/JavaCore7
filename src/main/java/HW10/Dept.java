package HW10;

public class Dept {

    private String dept;
    private String share;
    private int noofpeople;

    public void setDept(String n){
        dept = n;
    }
    public String getDept(){
        return this.dept;
    }

    public void setShare(String share) {
        this.share = share;
    }
    public String getShare(){
        return this.share;
    }
    public void setNoofpeople(int noofpeople) {
        this.noofpeople = noofpeople;
    }
    public Dept(int noofpeople, String dept, String share){
        this.noofpeople = noofpeople;
        this.dept = dept;
        this.share = share;
    }
    public Dept(){}

    public void printDeptInfo(){
        System.out.println("There is "+noofpeople+" people in "+dept+" that are "+share);
    }
}
