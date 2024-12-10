package com.ali.pbo.quiz;

import com.ali.pbo.Helper;

public class Run
{
    public static void main(String[] args)
    {
        Matriks matriks = new Matriks(new int[][]{{3, 4, 6}, {1, 7, 2}, {5, 11, 8}, {2, 9, 14}});
        Matriks matriks2 = new Matriks(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        Matriks hasiljumlah = matriks.jumlah2Matriks(matriks2);

        matriks.tampilMatriks();

        Helper.printBorder(10);
        hasiljumlah.tampilMatriks();

        // Fungsi 1
        int[] sortedIndexes = matriks.getSortedIndicesFromColumn(0);
        Helper.print("Sorted Indices of Column 2 = ");
        Helper.printArray(sortedIndexes);

        Matriks hasil = matriks.sortBasedOnIndecis(sortedIndexes);
        hasil.tampilMatriks();
    }
}
