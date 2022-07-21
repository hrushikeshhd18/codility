public class PassingCars {
    public int solution(int[] A) {
        int countOfZeros = 0, count = 0;

        for (int i = 0; i < A.length; i++){
            if (A[i] == 0) countOfZeros++;
            if (A[i] == 1) count += countOfZeros;
            if (count > 1000000000) return -1;
        }
        return count;
    }

    public static void main(String args[]) {
        TapeEquilibrium TE = new TapeEquilibrium();
        System.out.println(TE.solution(new int[]{0,1,0,1,1}));
    }
}
