package com.ali.pbo.quiz;

import com.ali.pbo.Helper;

public class Run
{
    public static void main(String[] args)
    {
        Matriks matriks = new Matriks(new int[][]{{3, 4, 6}, {1, 7, 2}, {5, 11, 8}, {2, 9, 14}});
        matriks.tampilMatriks();

        // Fungsi 1
        int[] sortedIndexes = matriks.getSortedIndicesFromColumn(1);
        Helper.print("Sorted Indices of Column 2 = ");
        Helper.printArray(sortedIndexes);
    }
}
