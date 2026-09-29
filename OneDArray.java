import java.util.*;
public class OneDArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] M; //Declared your Array
        // indexing: 0 1 2 3 4 5
        // accessing value at idx: marks[2];
        M = new int[10];
        double[] marksDecimal = new double[170];
        int marks[] =new int[10]; // Another way of Declaring array
        // java creats an array: initalize the array with a value
        //int[]: 0
        //double[]: 0.0
        //char[]:  (blank character)
        //String[]: null
        //boolean[]: false
        /*
        propertise of array :
        1- Same dataType
        2- fixed Sixe
        3- zero-based indexing
        4- congious memory : int : 4 byte*100 = 400 bytes
        */
        //int[] marks = new int [5];
        for(int i=0;i<5;i++){
            marks[i] = sc.nextInt();
        }
        
    }
    
}
