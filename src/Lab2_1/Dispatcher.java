package Lab2_1;

import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Dispatcher {
    static int array_result(int[] A, int P)
    {
        for (int i = 0; i < 25; i++)
        {
            if ((A[i] % 2 == 0) || (i % 8 != 0))
            {
                P += A[i];
            }
        }
        return P;
    }
    static int output(int[] A, int P)
    {
    	System.out.println("Array: ");
        for (int i = 0; i < 25; i++)
        {
        	System.out.print("[" + i + "] " + A[i] + "   ");
        	if(i == 13) {
        		System.out.println("");
        	}
        }
        return 1;
    }
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

        //-------Done-------
        int[] A = {46, 22, 39, 45, 94, 69, 53, 23, 57, 79, 40, 70, 66, 92, 66, 46, 30, 67, 62, 41, 86, 29, 37, 68, 27};
        //-------Random-------
        //int Min = 5;
        //int Max = 90;
        //int[] A = new int[25];
        //for (int i = 0; i < A.length; i++)
        //{
        //    A[i] = ThreadLocalRandom.current().nextInt(Min, Max);
        //}
        //-------Input-------
        //int[] A = new int[25];
        //for (int i = 0; i < A.length; i++)
        //{
        //    System.out.print("A[" + i + "] = ");
        //    A[i] = scan.nextInt();
        //}
        int P = 0;
        System.out.println("Result: " + array_result(A, P));
        System.out.println("Array: " + output(A, P));
	}
}
