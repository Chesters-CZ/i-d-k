import java.util.*;
import java.lang.*;

public class Reverzo {
    public static void main(String[] args){
        System.out.println("Reverzo vjec. Reverznu ti reverzaka.");

        Scanner scanner = new Scanner(System.in);
        String impot = scanner.nextLine();

        String reverz = "";

        String[] Splitto =  impot.split("", 0);
        for (int i = Splitto.length-1; i >= 0; i--) {
            reverz = reverz + Splitto[i];
        }

        System.out.println(reverz);
    }
}