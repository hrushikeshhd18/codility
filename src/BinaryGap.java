import java.util.*;

class BinaryGap {
    public static int solution(int number) {
        int i = 0;
        List<Integer> indexArray = new ArrayList();
        List<Integer> listOfGaps = new ArrayList();
        String binaryString = Integer.toBinaryString(number);
        System.out.println(binaryString);
        while (i < binaryString.length()) {
            if (binaryString.charAt(i) == '1') {
                indexArray.add(i);
            }

            i++;

        }
        for (int j = 0; j < indexArray.size(); j++) {
            if (j < indexArray.size() - 1) {

                Integer firstelement = indexArray.get(j);
                Integer secondelement = indexArray.get(j + 1);
                Integer integerGap = secondelement - 1 - firstelement;
                listOfGaps.add(integerGap);
            }


        }

        return (Collections.max(listOfGaps));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive no: ");
        int number = sc.nextInt();
        int value = solution(number);
        System.out.println(value);
    }

}

