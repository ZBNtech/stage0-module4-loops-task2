package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        while (i <= printToInclusive){
            System.out.println(facts(i));
            i++;
        }
    }

    public int facts(int num) {
        int i, fact = 1;
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
