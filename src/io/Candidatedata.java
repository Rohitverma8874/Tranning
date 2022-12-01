package io;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Candidatedata {
    public static void main(String args[]) throws IOException {
        String line = "";
        BufferedReader reader = new BufferedReader(new FileReader("data.csv"));
        while ((line = reader.readLine()) != null) {

            String[] employee = line.split(",");
            System.out.println("Employee[Candidateid = " + employee[1] + ",Candidatename= "
                    + employee[2] + ",courseEnrolledIn=" + employee[3]);

        }
    }
}