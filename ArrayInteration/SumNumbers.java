package ArrayInteration;

public class SumNumbers {

    public int arrayInt(int[] x) {

        int soma = 0;

        if (x == null) {
            return 0;
        }

        for (int num : x) {
            soma += x[num];
        }

        return soma;

    }

}
