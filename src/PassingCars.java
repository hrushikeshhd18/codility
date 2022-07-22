public class PassingCars {
    public int solution(int[] A) {
      int eastBoundCarsSeen= 0;
      int passingCars = 0;

        for(int a : A){
            if(a == 0){
                eastBoundCarsSeen++;
            }else {
                passingCars += eastBoundCarsSeen;
            }
        }
         if(passingCars > 100000){
            return -1;
        }else{
             return passingCars;
         }
    }

    public static void main(String args[]) {
        PassingCars PC = new PassingCars();
        System.out.println(PC.solution(new int[]{0,1,0,1,1}));
    }
}
