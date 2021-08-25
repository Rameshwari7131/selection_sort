/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raeshwari.jadhav;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Rameshwari
 */
public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter all the elements : ");
        for(int i = 0; i< size; i++)
            {
                a[i] = sc.nextInt();
         
            }
//        Selection_Sort.selectionSort(a);
        Selection_Sort ss = new Selection_Sort();
        ss.optimizationSelectionSort(a);
        System.out.println("After sorting : ");
//        System.out.println(Arrays.toString(a));
        for(int i = 0; i< size; i++)
            {
                System.out.println(a[i]);
         
            }
        }
    

        public static void selectionSort(int a[])
        {
            int i;
            int j;
            int temp =0;
            int size = a.length;
            for(i = 0;i<size - 1; i++)
            {
                for(j = i+1; j < size; j++)
                {
                    if(a[i] > a[j])
                    {
                        temp =  a[j];
                        a[j] = a[i];
                        a[i] = temp;
                    }
                }
            }
            
        }
        
    /**
     *
     * @param a
     */
    public void optimizationSelectionSort(int a[])
        {
            int i;
            int j;
            int temp =0;
            int size = a.length;
            boolean sorted;
            for(i = 0;i<size - 1; i++)
            {
                sorted = false;
                for(j = i+1; j < size; j++)
                {
                    sorted = true;
                    if(a[i] > a[j])
                    {
                        temp =  a[j];
                        a[j] = a[i];
                        a[i] = temp;
                    }
                }
                
                if(sorted == false)
                {
                    break;
                }
            }
        };
    }

