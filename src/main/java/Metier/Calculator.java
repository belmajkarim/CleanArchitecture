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
        int sum = 0;
        List<Integer> listOfStrings = new ArrayList<>();

        Scanner sc = new Scanner(new FileReader("src/main/java/Donnees/mydoc.txt")).useDelimiter(",\\s*");


        while (sc.hasNext()) {
            int number = sc.nextInt();
            Integer.parseInt(String.valueOf(number));
            listOfStrings.add(number);
        }


        for (int i = 0; i < listOfStrings.size(); i++) {
            if (op.equals("+")) {
                sum += listOfStrings.get(i);
            } else if (op.equals("-")) {
                sum -= listOfStrings.get(i);
            } else {
                sum *= listOfStrings.get(i);
            }
        }
        System.out.println("Result: " + sum);

    }
}


