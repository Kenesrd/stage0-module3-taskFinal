package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int num = 0;
        while (number > 0){
            int endNum = number % 10;
            num = num * 10 + endNum;
            number /= 10;
        }
        System.out.println(num);
    }
}
