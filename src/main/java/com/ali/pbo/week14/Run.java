package com.ali.pbo.week14;

import java.util.ArrayList;
import java.util.List;

import com.ali.pbo.Helper;

public class Run
{
    public static void main(String[] args)
    {
        // Baca File
        Helper.println("Baca File");
        String fileA = DocReader.readFile("fileA.txt");
        Helper.println(fileA);
        Helper.newLine();

        // Nomor 1
        Helper.println("Nomor 1: List kalimat");
        List<String> listKalimatA = DocReader.separateString(fileA, "\n");
        Helper.printList(listKalimatA);
        Helper.newLine();

        // Nomor 2
        Helper.println("Nomor 2: List kata");
        List<String> listKataA = new ArrayList<>();
        for (String string : listKalimatA)
        {
            listKataA.addAll(DocReader.separateString(string, " "));
        }
        Helper.printList(listKataA);
        Helper.newLine();

        // Nomor 3
        Helper.println("Nomor 3: Jumlah kata");
        WordCounter countA = new WordCounter(fileA, listKataA);
        countA.display();
        Helper.newLine();

        //Nomor 4 Poin A: Membaca 2 file dengan membuat obj File baru
        Helper.println("Nomor 4 Poin A: Baca lebih dari 1 file");
        String fileB = DocReader.readFile("fileB.txt");
        Helper.println(fileB);
        Helper.newLine();

        //Nomor 4 Poin B dan C: Metode dan Indikator Membandingkan dua file
        //Membandingkan dengan indikator seluruh kata per kata sama
        Helper.println("Nomor 4 Poin B dan C: Metode dan Indikator Membandingkan dua file");
        String fileC = DocReader.readFile("fileC.txt");
        Helper.println("File A sama dengan File B? " + fileA.equals(fileB));
        Helper.println("File A sama dengan File C? " + fileA.equals(fileC));

        //Membandingkan dengan indikator ada kemiripan 50% seluruh kata
        Helper.println("File A mirip dengan File B? " + DocReader.isSimilar(fileA, fileB));
    }
}
