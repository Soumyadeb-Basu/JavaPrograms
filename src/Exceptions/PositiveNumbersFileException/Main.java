package Exceptions.PositiveNumbersFileException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, PositiveNumberException {
        File file =new File("C:\\Users\\Soumyadeb Basu\\Downloads\\Test.txt");
        Scanner sc= new Scanner(file);
        while (sc.hasNextInt()){
            if(sc.nextInt()>0)
                throw new PositiveNumberException("Positive Number");
        }
        sc.close();
    }
}
