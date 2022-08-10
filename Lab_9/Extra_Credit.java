package Lab_9;
import java.util.*;


    class Myclass {
        public static void main (String[] args) {
            Myclass m= new Myclass();
            int arr[]= {23,13,67,8,134,13,3};
            System.out.println("Minimum element in the array is: "+m.min(arr));
            System.out.println("Maximum element in the array is: "+m.max(arr));

            int target= 13;
            System.out.println("The number of times "+target+" found is: "+m.occuranceScan(arr,target));
            System.out.println("The sum of array elements are: "+m.sum(arr));
            if(m.contains(arr, target)){
                System.out.println("The array contains the target element "+target);
            }else{
                System.out.println("The array does not contain the target element "+target);
            }
        }
        public static int min(int values[]){
            int min = Integer.MAX_VALUE;

            for(int i=0;i<values.length ;i++){
                min= Math.min(min,values[i]);
            }

            return min ;
        }
        public static int max(int values[]){
            int max = Integer.MIN_VALUE;

            for(int i=0;i<values.length ;i++){
                max = Math.max(max,values[i]);
            }

            return max ;
        }
        public static int occuranceScan(int values[], int target){
            int count =0;
            for(int i=0;i<values.length ;i++){
                if(values[i] == target)
                    count++ ;
            }

            return count;
        }
        public static int sum(int values[]){
            int sum=0;
            for(int i=0;i<values.length ;i++){
                sum+=values[i];
            }

            return sum ;
        }
        public boolean contains(int values[],int target){
            for(int i=0;i<values.length ;i++){
                if(values[i] == target)
                    return true;
            }

            return false;
        }

    }

