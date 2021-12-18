package Strings;

import java.util.Scanner;

class JavaRegex {
    public static String zeroTo255 = "([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])";
    public static String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(pattern));
        }
    }
}