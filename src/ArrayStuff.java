import java.util.Random;
import java.util.Scanner;

public class ArrayStuff
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int[] dataPoints;
        dataPoints = new int[100]; // 0 - 99 (100)
        //loop that initializes each array entry with a random value
        for (int x = 0; x < dataPoints.length; x++)
        {
            dataPoints[x] = rnd.nextInt(100) + 1;
        }
        //loop to display datapoints array value like: val1 | val2 | val3 | etc,.
        for (int x = 0; x < dataPoints.length; x++)
        {
            System.out.print(dataPoints[x] + " | ");
        }
        //loop to calculate sum and average of values
        int dataSum = 0;
        int dataAve = 0;
        for (int x = 0; x < dataPoints.length; x++)
        {
            dataSum = dataSum + dataPoints[x];
        }
        dataAve = dataSum / dataPoints.length;
        System.out.println("\nThe Sum of the data is: " + dataSum);
        System.out.println("The Average of the data is: " + dataAve);
        //linear scan search
        int searchValue = 0;
        searchValue = SafeInput.getRangedInt(in,"Enter a value to search for ", 1, 100);
        int valuesFound = 0;
        for (int x = 0; x < dataPoints.length; x++)
        {
            if (dataPoints[x] == searchValue)
            {
                System.out.println("Found the value " + searchValue + " at array index: " + x);
                valuesFound++;
            }
        }
        System.out.println("The value " + searchValue + " was found " + valuesFound + " times in the array!");
        //short circuit search
        searchValue = 0;
        searchValue = SafeInput.getRangedInt(in, "Enter a value to search for ", 1, 100);
        boolean valueFound = false;
        for (int x = 0; x < dataPoints.length; x++)
        {
            if (dataPoints[x] == searchValue)
            {
                System.out.println("Break! Found the value " + searchValue + " at array index: " + x);
                valueFound = true;
                break;
            }
        }
        if (!valueFound)
        {
            System.out.println("Value " + searchValue + " was not found in the data array.");
        }
        //loop scanning for min and max value of the array
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int x = 0; x < dataPoints.length; x++)
        {
            if (min > dataPoints[x])
            {
                min = dataPoints[x];
            }
            if (max < dataPoints[x])
            {
                max = dataPoints[x];
            }
        }
        System.out.println("The minimum value of the array is: " + min);
        System.out.println("The maximum value of the array is: " + max);
        //code to call method to return average of array of double values
        System.out.println("The average of the data points is: " + getAverage(dataPoints));

    }
    //method to calculate double average from a set of data
    public static double getAverage(int values[])
    {
        double sum = 0;
        for (int e = 0; e < values.length; e++)
        {
           sum = sum + values[e];
        }
        return sum / values.length;
    }
}
