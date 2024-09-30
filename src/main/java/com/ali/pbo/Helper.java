package com.ali.pbo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Helper
{    
    public static void print(Object object)
    {
        System.out.print(object);
    }

    public static void println(Object object)
    {
        print(object + "\n");
    }

    public static void printError(Exception e)
    {
        print("Exception Occurred: " + e.getMessage());
    }

    public static void newLine()
    {
        println("");
    }

    public static void printBorder(int count)
    {
        for (int i = 0; i < count; i++)
        {
            print("-");
        }
        newLine();
    }

    public static <T> void printList(List<T> list)
    {
        int end = list.size();
        print("[");
        for(int i = 0; i < end - 1; i++)
        {
            print(list.get(i) + ", ");
        }
        print(list.get(end - 1) + "]");
        Helper.newLine();
    }

    public static void printArray(int[] array)
    {
        Helper.printList(Arrays.stream(array).boxed().collect(Collectors.toList()));
    }

    public static int fpb(int a, int b)
    {
        if (b == 0)
        {
            return a;
        }
        return fpb(b, a % b);
    }
    
    public static int kpk(int a, int b)
    {
        return (a / fpb(a, b)) * b;
    }

    public static int[] sortIndices(int[] input)
    {
        Integer[] indices = new Integer[input.length];
        for (int i = 0; i < input.length ; i++)
        {
            indices[i]=i;
        }
        Arrays.sort(indices, (o1, o2) -> input[o1] - input[o2]);
        int[] indicesInt = new int[input.length];
        Arrays.setAll(indicesInt, i -> indices[i]);
        return indicesInt;
    }
}
