import java.util.*;
import java.lang.*;

public class Pallindromme {
    public static void main(String[] args){
        System.out.println("is yor vjec palestindromm?m.");

        Scanner scanner = new Scanner(System.in);
        String impot = scanner.nextLine();
        String bakup = impot;

        String reverz = "";

        String[] Splitto =  impot.split("", 0);
        for (int i = Splitto.length-1; i >= 0; i--) {
            reverz = reverz + Splitto[i];
        }

        bakup = bakup.toLowerCase();
        reverz = reverz.toLowerCase();
        boolean scam = Objects.equals(bakup, reverz);

        if (scam) {
            System.out.println("yees");
        }
        else {
            System.out.println("nape");
        }
    }
}