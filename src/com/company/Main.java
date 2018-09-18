package com.company;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("here");
        String a = urlToString("http://erdani.com/tdpl/hamlet.txt");
        System.out.println(CountOc(a,"prince"));
    }



    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static int CountOc(String text, String lookFor) {
        //conver all string to lower case and separate at spaces
        String[] ReadHere = (text.toLowerCase()).split("\\P{L}+");
        //convertlookfor to lower case
        String SearchFor = lookFor.toLowerCase();
        int coun = 0;
        for (int i = 0; i < ReadHere.length; i++) {
            if (SearchFor.equals(ReadHere[i])) {
                coun++;
            }
        }
        return (coun);
    }

}
