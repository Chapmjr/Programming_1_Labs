package Lab_9;
import java.util.Random;
import java.util.Scanner;


public class Lab_9_Array_Stuff {
    private static Scanner pipe, in;

    public static void main(String... args)
    {
        //Part A-----------------
        int dataPoints[]=new int[100];
        Random ranObj=new Random();

        System.out.println("Elements after assigning random number from 1 to 100");
        //Part B----------
        for(int i=0;i<100;i++)
        {
            dataPoints[i]=ranObj.nextInt(100)+1;
            System.out.printf("%d | ",dataPoints[i]);

            if(i==50)System.out.println("\n");
        }
        System.out.println("\n");
        //PART C-------------------------
        int[] datapoints = new int[100];
        Random ranObj1=new Random();



        System.out.println("\n");

        // Part D--------------

        int sum = 0;

        double avg = 0;

        for (int i = 0; i < 100; i++) {

            int j = datapoints[i]; i++;

            sum = j;

        }

        avg = (double) sum / datapoints.length;

        System.out.printf("The sum of the random array datapoints is %d\n", sum);

        System.out.printf("The average of the random array datapoints is %f\n", avg);

        // 2.a------------Linear Scan-----------

        int input = 0;

      //  Scanner in;
        String prompt = "";
      //  input = SafeInput.getRangedInt(pipe, prompt, 1, 100);
       //  input = pipe.nextInt();
        // 2.b

        int n = 0;

        for (int i = 0; i < 100; i++) {

            if (datapoints[i] == input) {

                n++;

            }

        }

        System.out.printf("The number of times the input value of %d matches is %d\n", input, n);




        // 2.c

        int input2 = 0;

        input2 = SafeInput.getRangedInt(pipe, prompt, 1, 100);
        int pos = -1;

        for (int i = 0; i < 100; i++) {

            if (datapoints[i] == input) {

                pos = i;

                break;

            }

        }

        if (pos > -1) {

            System.out.printf("The value %d was found at array index %d\n", input2, pos);

        } else {

            System.out.printf("The value %d was not found\n", input2);




        }

    System.out.println("Enter a value between 1 and 100:");
//reading the input into n D

    int num = in.nextInt();

    int i, flag = 0;
for (i = 0; i < 100; i++)
    {
        if(num == dataPoints[i])
        {

            //if the value in found set flag to 1 to indicate that the value was found and exit from loop
            flag = 1;
            break;
        }
    }


//if flag was set to 1 it means the value was found, so print the position

if(flag == 1)
            System.out.println("The value " + num + " was found at array index " + i);
//if flag  = 0 it means the value of flag was not changed(initially it was zero) and the value was not found

else
        System.out.println("The value " + num + " was not found in the array");

}
    public static int getRangedInt(int a,int b){
        int n;
        while(true){
            System.out.print("Enter the number between range "+a+" and "+b+": ");
            n=Integer.parseInt(pipe.nextLine());
            if(n>=a && n<=b){
                break;
            }else{
                System.out.println("Value entered in not in range , Please re-enter!!!!!!!");
            }
        }
        return n;
    }

//main class
    //function to find the average of data points
    public static void main (String...args)
    public static double getAverage(int values[]){
        double avg=0;
        for(int i=0;i<100;i++) {
            avg += values[i];

        avg=avg/100;

        return avg;

        int dataPoints[] = new int[100];
        int count = 0;
        int index = 0;
        int min, max;
        Random rand = new Random();

        //initializing array with random numbers between 1 to 100
        for (int i = 0; i < 100; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        //printing array values
        System.out.println("Values in dataPoints......");
        for (int i = 0; i < 99; i++) {
            System.out.print(dataPoints[i] + " | ");
        }
        System.out.println(dataPoints[99] + " ");

        //requesting a value between 1 to 100 from user
        int number;
        //finding the count of value entered
        for (int i = 0; i < 100; i++) {
            if (number == dataPoints[i])
                count++;
        }
        System.out.println("Count of " + number + " in array: " + count + " ");

        //requesting a value between 1 to 100 from user
        //finding the first index where value occurs
        for (i = 0; i < 100; i++) {
            if (number == dataPoints[i]) {
                index = i;
                break;
            }
        }
        if (i < 100)
            System.out.println("The value " + number + " was found at array index " + index);
        else {
            System.out.println("Value " + number + " not found in array");
        }
        System.out.println(" ");

        //finding the minimum and maximum values
        min = dataPoints[0];
        max = dataPoints[0];
        for (i = 1; i < 100; i++) {
            if (min > dataPoints[i])
                min = dataPoints[i];
            if (max < dataPoints[i])
                max = dataPoints[i];
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

        //finding the average value of dataPoints in array
        System.out.println("Average of dataPoints values: " + getAverage(dataPoints));

    }}


