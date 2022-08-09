package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {

        int i = 0;
        while (i <= Math.abs(multiplyByAndToInclusive)){
            if (multiplyByAndToInclusive == 0){
                break;
            }
                System.out.println(multiplyByAndToInclusive * i);
            i++;
        }
    }
}
