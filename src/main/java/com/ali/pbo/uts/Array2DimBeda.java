package com.ali.pbo.uts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array2DimBeda
{
    private int size;
    private List<List<Integer>> elements;

    public Array2DimBeda(List<List<Integer>> elements)
    {
        this.elements = elements;
    }

    public Array2DimBeda(Integer[][] elements)
    {
        int i = 0;
        for (Integer[] integers : elements)
        {
            this.elements.add(i, new ArrayList<Integer>());
            this.elements.get(i).addAll(Arrays.asList(integers));
            i++;
        }
    }

    private static <T> void printList(List<T> list)
    {
        int end = list.size();
        System.out.print("[");
        for(int i = 0; i < end - 1; i++)
        {
            System.out.print(list.get(i) + ", ");
        }
        System.out.print(list.get(end - 1) + "]");
    }

    public void tampil()
    {
        for (List<Integer> list : this.elements)
        {
            printList(list);
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        final Array2DimBeda A = new Array2DimBeda(new Integer[][]{{1, 2, 3, 4}, {5, 6}, {8, 9}});

        A.tampil();
    }
}