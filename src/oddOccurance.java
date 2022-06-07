import java.util.Arrays;

public class oddOccurance {
    public int solution(int[] A) {
        Arrays.sort(A);
        for(int i = 0; i < A.length; i = i+2){
            if(i == A.length-1)
                return A[i];

            if (A[i]!=A[i+1])
                return A[i];
        }
        return 0;
    }
}
