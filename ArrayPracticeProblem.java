/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypracticeproblem;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Lobo
 */
public class ArrayPracticeProblem {

    public static int[] shuffle (int[] values){
        int[] newValues= new int[values.length];
        Random rnd=new Random();
        int temp=0;
        int holder=0;
        for (int i=0; i<values.length;i++){
            temp=values[i];
            holder=rnd.nextInt(values.length);
            newValues[i]=values[holder];
            newValues[holder]=temp;
        }
        return newValues;
    }
    public static void printArray(int[] values, int[] newValues){
        for(int i=0; i<values.length;i++){
            System.out.println(values[i]+ "\t "+newValues[i]);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] values= new int[200];
        for (int i=0;i<values.length;i++){
            values[i]=i;
        }
        int[] newValues=new int[values.length];
        newValues=shuffle(values);
        System.out.println("Before: "+" After: ");
        printArray(values, newValues);
    }
    
}
