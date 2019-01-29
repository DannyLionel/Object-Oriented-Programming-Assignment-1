import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;
import java.util.*;
import java.io.IOException;
import java.io.FileWriter;
public class SpellChecker2{
  public static void main(String[] args){
    Scanner console = new Scanner(System.in);
    System.out.println("Please enter the name of input file:");
    String fileName = console.nextLine();


            // This will reference one line at a time
            String line = null;
            String [] arr = new String[100];


            try {
                // FileReader reads text files in the default encoding.
                FileReader fileReader =
                    new FileReader(fileName);

                // Always wrap FileReader in BufferedReader.
                Scanner s1 = new Scanner(new File("dictionary.txt"));
                ArrayList<String> list1 = new ArrayList<String>();
                while (s1.hasNext()){
                  list1.add(s1.next());
                }
                s1.close();

                 Scanner s = new Scanner(new File("bonk.txt"));
                  ArrayList<String> list = new ArrayList<String>();
                  while(s.hasNext()){
                    list.add(s.next());
                  }
                  s.close();
                  list.retainAll(list1);
                  System.out.println(list);
                }
                  catch (IOException e1) {

  			e1.printStackTrace();
    }
}
}
