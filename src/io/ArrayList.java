package io;
import java.io.*;
import java.util.*;

public class ArrayList {
    public static void main(String[] args) {

        int[] num = {1, 3, 9, 10};

        {

            List<String> Employees = new java.util.ArrayList<>();
            Employees.add("Rohit");
            Employees.add("Priyanka");
            Employees.add("Shweta");
            Employees.add("RAm");
            Employees.add("Rajni");

            for (String name : Employees) {
                if (name.startsWith("S")){
                    System.out.println(name);
                }

            }
        }
    }
}

