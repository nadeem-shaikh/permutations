package com.nadeem;

import java.util.ArrayList;
import java.util.List;

/**
 * Program to Permutaions
 */
public class Permutations {
    private static List<String> replaceStarInString (String s ) {
        List<String> sOutput = new ArrayList<String>(); // Create an List object
        String sTemp = "";
        char[] sChars;
        int l = s.length();
        for (int i =0; i< l ; i ++)
        {
            if (s.charAt(i) == '*' )
            {
                sChars = s.toCharArray();
                sTemp = "";
                sChars[i]='0';
                sTemp= String.valueOf(sChars);
                sOutput.add(sTemp);

                sChars = s.toCharArray();
                sTemp = "";
                sChars[i]='1';
                sTemp= String.valueOf(sChars);
                sOutput.add(sTemp);
                break;
            }
        }
        sOutput=parseList(sOutput);
        return sOutput;
    }

    private static List<String> parseList (List<String> sList ) {
        int size = sList.size();

        for (int i=0 ; i < size ; i++)
        {
            List<String> s_output_temp = new ArrayList<String>(); // Create an ArrayList object
            if (sList.get(i).contains("*"))
            {
                s_output_temp=replaceStarInString(sList.get(i));
                for (String s : s_output_temp) {
                    sList.add(s);
                }
            }
        }
        return sList;
    }
    public static void main(String[] args) {
        try {
        
            String s = args[0];
            List<String> sOutputTemp = new ArrayList<String>(); // Create an List 
            List<String> sOutput = new ArrayList<String>(); // Create an List

            System.out.println(" \n \n input is - " + s);

            sOutputTemp = replaceStarInString(s);

            for (String sTemp : sOutputTemp) {
                if (sTemp.indexOf('*') == -1)
                sOutput.add(sTemp);
            }

            System.out.println("\n \n outputs is - " + sOutput + "\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
