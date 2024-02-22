public class ArrayOps {
    public static void main(String[] args) {

        //System.out.println(findMissingInt(new int[] {4, 0, 1, 2, 5}));

    }
    
    public static int findMissingInt (int [] array) {

        int num = 0;
        int sum1 = 0;
        for (int i = 0; i <= array.length; i++ ) {
                sum1= sum1 + i;
        }

        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum2 = sum2 + array[i];
        }

        return (sum1 - sum2);
    }

    public static int secondMaxValue(int [] array) {
        
        int max = array[0];
        int second_max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                second_max = max;
                max = array[i];
            }
            if ((array[i] < max) && (array[i] > second_max)) {
                second_max = array[i];
            }
        }
        return second_max;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {


        for (int i = 0; i < array1.length; i++) {
            boolean t = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    t = true;
                    break;
                }
            } 
            if (t == false) {
                return false;
            }
        }

    

        for (int j = 0; j < array2.length; j++) {
            boolean t = false;
            for (int i = 0; i < array1.length; i++) {
                if (array2[j] == array1[i]) {
                    t = true;
                }
            } 
            if (t == false) {
                return false;
            }
        }
        return true; 
    }

    public static boolean isSorted(int [] array) {
        
        if (array[0] == array[array.length - 1]) {
            return false;
        }

        if (array[0] < array[array.length - 1]) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] <= array[i + 1]) {
                } else {
                    return false;
                }
            }    
        }


        if (array[0] > array[array.length - 1]) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] >= array[i + 1]) {
                } else {
                    return false;
                }
            }    
        }
        return true;   
    }
}


