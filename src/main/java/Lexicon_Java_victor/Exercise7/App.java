package Lexicon_Java_victor.Exercise7;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        
    	Scanner in = new Scanner(System.in);
    	
    	int sec;
    	int min;
    	int tim;
    	System.out.println("skriv ett antal secunder");
    	sec = in.nextInt();
    	min = (sec % 3600) / 60;
    	tim = sec / 3600;
    	int sec_ut = (sec % 3600) % 60;
    	
    	System.out.println("  " + tim + "    :   " + min + "    :    " + sec_ut );
    	System.out.println("timmar   minuter    secunder");
    	
    	
    	
  
}
}
