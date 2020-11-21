package techInterview;

public class NumAddRangeRecurtion {
    public static void main(String[] args) {
        var result = sumRange(5,10);
        System.out.println(result);
    }

    private static int sum(int i) {
        if(i>0) {
            return i + sum(i-1);
        }else{
            return 0;
        }
    }

    private static int sumRange(int start, int end) {
        if(end > start) {
            return end + sumRange(start, end-1);
        } else {
            return end;
        }
    }
}
