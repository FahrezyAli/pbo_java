package com.ali.pbo.week13.teori.soal3;

import java.util.Arrays;

import com.ali.pbo.Helper;

public class Array1DimInteger
{
    private int size;
    private int[] elements;
    
    public Array1DimInteger(int[] elements)
    {
        this.elements = elements;
    }

    public Array1DimInteger(int size)
    {
        this.size = size;
        this.elements = new int[size];
    }

    public void setElements(int[] elements)
    {
        if (elements.length > this.size)
        {
            throw new IllegalArgumentException("Subscript out of range");
        } else this.elements = elements;
    }

    public void displayArray()
    {
        Helper.printList(Arrays.asList(this.elements));
    }


    public static void main(String[] args)
    {
        Array1DimInteger array = new Array1DimInteger(5);

        try
        {
            array.setElements(new int[]{1, 2, 3, 4, 5, 6});
            array.displayArray();
        } catch (Exception e)
        {
            Helper.printError(e);
        }
    }
}