package src;

public class TekrarEdenCiftSayilariBulma {
    static boolean isFind(int[] arr , int value){
        for (int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;

        }

    public static void main(String[] args) {
        int[] list = {6,4,11,7,87,96,75,54,85,74,14,4,96};
        int[] evenNumber = new int [list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if((i != j) && (list[i] == list[j])) {
                    if (list[i] % 2 == 0) {
                        if (!isFind(evenNumber, list[i])) {
                            evenNumber[startIndex++] = list[i];
                        }
                        break;
                    }
                }
            }
        }
        for (int value : evenNumber) {
            if (value != 0) {
                System.out.println(value);
            }
        }


    }
}
