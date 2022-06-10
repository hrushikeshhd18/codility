import java.util.HashSet;

public class PermMissingElement {
    public int solution(int[] A){
        HashSet<Integer> list = new HashSet<>();
        for(int i=1;i<=A.length+1;i++){
            list.add(i);
        }
        for (int i =0;i<A.length;i++){
            list.remove((Integer)A[i]);
        }
        return  list.iterator().next();

    }
    public static void main(String args[]) {
        PermMissingElement PE = new PermMissingElement();
        System.out.println(PE.solution(new int[]{1,2,4,5}));

    }
}
