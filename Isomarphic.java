package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Isomarphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        String s = sc.next();
        String t = sc.next ();
        boolean res = IsomarphicResult(s,t);
        System.out.println (res);

    }

    private static boolean IsomarphicResult(String s, String t) {
        Map<Character, Character> map = new HashMap<> ();
        int len1 = s.length ();
        int len2 = t.length ();
        if(len1 != len2) return false;
        for(int i=0;i<len1;i++){
            char si = s.charAt ( i );
            char ti = t.charAt ( i );
            if(map.containsKey ( si ) && !map.get ( si ).equals ( ti )){
                return false;
            } else if(!map.containsKey ( si ) && map.containsValue ( ti )){
                return false;
            }
            map.put ( si,ti );
        }
        return true;

    }
}
