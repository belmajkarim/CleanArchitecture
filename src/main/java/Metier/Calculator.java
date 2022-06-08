package Metier;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    public void calculatrice() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Operator: ");
        String op = br.readLine();
        Integer sum = 0;
        List<Integer> listOfInts = new ArrayList<>();

        Scanner sc = new Scanner(new FileReader("src/main/java/Donnees/mydoc.txt"));


        while (sc.hasNext()) {
            Integer number = sc.nextInt();
            listOfInts.add(number);
        }


        for (Integer i = 0; i < listOfInts.size(); i++) {
            if (op.equals("+")) {
                sum += listOfInts.get(i);
            } else if (op.equals("-")) {
                sum -= listOfInts.get(i);
            } else {
                sum *= listOfInts.get(i);
            }
        }
        System.out.println("Result: " + sum);

    }
}


