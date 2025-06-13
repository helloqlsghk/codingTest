package TakeBox;

public class TakeBox {


    public static void main(String[] args) {

        int[] array =new int[] {10,14,11,5,24,3,1,7,6,3};

    
    }



    public static int[] selectionSort(int[] array){

        for (int i = 0; i < array.length; i++) {
           int temp;
           for (int j = i+1; j < array.length; j++) {
               if (array[j] < array[i]) {
                   temp = array[i];
                   array[i] = array[j];
                   array[j] = temp;
               }
           }
        }



        return array;
    }

    public static int[] bubbleSort(int[] array){


        return array;
    }





}


