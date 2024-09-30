package com.ali.pbo.quiz;

import java.util.List;
import com.ali.pbo.Helper;

public class Matriks
{
    private int col;
    private int row;
    private int[][] elements;

    public Matriks()
    {
        this.col = 0;
        this.row = 0;
        this.elements = new int[0][0];
    }

    public Matriks(List<List<Integer>> elements)
    {
        this.col = elements.get(0).size();
        this.row = elements.size();
        for (int i = 0; i < this.col; i++)
        {
            for (int j = 0; j < this.row; j++)
            {
                this.elements[i][j] = elements.get(i).get(j);
            }
        }
    }

    public Matriks(int[][] elements)
    {
        this.col = elements[0].length;
        this.row = elements.length;
        this.elements = elements;
    }

    public Matriks(Matriks m)
    {
        this.col = m.col;
        this.row = m.row;
        this.elements = m.elements;
    }

    public Matriks(int col, int row)
    {
        this.col = col;
        this.row = row;
        this.elements = new int[row][col];
    }

    public Matriks jumlah2Matriks(Matriks m)
    {
        int usedCol = Math.min(this.col, m.col);
        int usedRow = Math.min(this.row, m.row);
        Matriks result = new Matriks(usedCol, usedRow);
        for (int i = 0; i < usedRow; i++)
        {
            for (int j = 0; j < usedCol; j++)
            {
                result.elements[i][j] = this.elements[i][j] + m.elements[i][j];
            }
        }
        return result;
    }

    public static Matriks jumlah2Matriks(Matriks m1, Matriks m2)
    {
        int usedCol = Math.min(m1.col, m2.col);
        int usedRow = Math.min(m1.row, m2.row);
        Matriks result = new Matriks(usedCol, usedRow);
        for (int i = 0; i < usedRow; i++)
        {
            for (int j = 0; j < usedCol; j++)
            {
                result.elements[i][j] = m1.elements[i][j] + m2.elements[i][j];
            }
        }
        return result;
    }

    public Matriks selisih2Matriks(Matriks m)
    {
        int usedCol = Math.min(this.col, m.col);
        int usedRow = Math.min(this.row, m.row);
        Matriks result = new Matriks(usedCol, usedRow);
        for (int i = 0; i < usedRow; i++)
        {
            for (int j = 0; j < usedCol; j++)
            {
                result.elements[i][j] = this.elements[i][j] - m.elements[i][j];
            }
        }
        return result;
    }

    public static Matriks selisih2Matriks(Matriks m1, Matriks m2)
    {
        int usedCol = Math.min(m1.col, m2.col);
        int usedRow = Math.min(m1.row, m2.row);
        Matriks result = new Matriks(usedCol, usedRow);
        for (int i = 0; i < usedRow; i++)
        {
            for (int j = 0; j < usedCol; j++)
            {
                result.elements[i][j] = m1.elements[i][j] - m2.elements[i][j];
            }
        }
        return result;
    }
    
    public void tampilMatriks()
    {
        for (int[] element : this.elements)
        {
            Helper.printArray(element);
        }
    }

    public static void tampilMatriks(Matriks m)
    {
        for (int[] element : m.elements)
        {
            Helper.printArray(element);
        }
    }

    public int[] getSortedIndicesFromColumn(int columnIndex)
    {
        int[] arrayToSort = new int[this.row];
        for (int i = 0; i < row; i++)
        {
            arrayToSort[i] = this.elements[i][columnIndex];
        }
        return Helper.sortIndices(arrayToSort);
    }
}