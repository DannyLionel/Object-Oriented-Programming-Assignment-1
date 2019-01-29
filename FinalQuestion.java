import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;
import java.util.*;
import java.io.IOException;
import java.io.FileWriter;

/**
* FinalQuestion1 class
* @author Dhanushga Lionel
* @version 25.00, 16 Nov 2017
*/
public class FinalQuestion
{
  public static void main(String[] args)throws Exception{


    Scanner console = new Scanner(System.in);
    System.out.println("Please enter the name of input file:");
    String fileName = console.nextLine();


            // This will reference one line at a time
            String line = null;
            String [] arr = new String[100];

            int i = 0;
            try {
                // FileReader reads text files in the default encoding.
                FileReader fileReader =
                    new FileReader(fileName);

                // Always wrap FileReader in BufferedReader.
                BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

                    System.out.println("Original Data:");
                while((line = bufferedReader.readLine()) != null) {

                    System.out.println(line);
                    arr[i++] = line;



                }
                //Write to a text file
                System.out.println("Data that is either good or bad:");
                BufferedWriter bw = null;
                FileWriter fw = null;
                String FileName = "good.txt";
                System.out.println("");
                String line1 = arr[0];
                double[] ary1 = new double [6];
                int a = 0;
                Scanner sc = new Scanner(line1);
                while(sc.hasNextDouble()){
                  ary1[a++] = sc.nextDouble();
                }

                double x;
                x = ((ary1[0]+ary1[1])*ary1[3]*ary1[5])/((ary1[2]+ary1[3])*ary1[0]*ary1[4]);
                if (x == 7.5 ){
                try{
                  File file = new File(FileName);
                  if(!file.exists()){
                    file.createNewFile();
                  }
                  fw = new FileWriter(file.getAbsoluteFile(),true);
                  bw = new BufferedWriter(fw);
                  bw.write(line1 +"\r\n");

                  System.out.println("Line 1 was printed onto data");
                }
                catch (IOException e1) {

			e1.printStackTrace();

		}
    finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex1) {

				ex1.printStackTrace();

			}
		}


                }
                else{
                  System.out.println(line1);
                }



                String line2 = arr[1];
                double[] ary2 = new double [6];
                int b = 0;
                Scanner sc1 = new Scanner(line2);
                while(sc1.hasNextDouble()){
                  ary2[b++] = sc1.nextDouble();
                }


                double x1;
                x1 = ((ary2[0]+ary2[1])*ary2[3]*ary2[5])/((ary2[2]+ary2[3])*ary2[0]*ary2[4]);
                if(x1==7.5){
                  try{
                    File file = new File(FileName);
                    if(!file.exists()){
                      file.createNewFile();
                    }
                    fw = new FileWriter(file.getAbsoluteFile(),true);
                    bw = new BufferedWriter(fw);
                    bw.write(line2 + "\r\n");

                    System.out.println("Line 2 was printed onto data");
                  }
                  catch (IOException e2) {

                  e2.printStackTrace();

                  }
                  finally {

                  try {

                  if (bw != null)
                  bw.close();

                  if (fw != null)
                  fw.close();

                } catch (IOException ex2) {

                  ex2.printStackTrace();

                  }
                  }



                }
                else{
                System.out.println(line2);
              }


                String line3 = arr[2];
                double[] ary3 = new double [6];
                int c = 0;
                Scanner sc2 = new Scanner(line3);
                while(sc2.hasNextDouble()){
                  ary3[c++] = sc2.nextDouble();
                }
                double x2;
                x2 = ((ary3[0]+ary3[1])*ary3[3]*ary3[5])/((ary3[2]+ary3[3])*ary3[0]*ary3[4]);
                if(x2==7.5){

                  try{
                    File file = new File(FileName);
                    if(!file.exists()){
                      file.createNewFile();
                    }
                    fw = new FileWriter(file.getAbsoluteFile(),true);
                    bw = new BufferedWriter(fw);

                    bw.write(line3 + "\r\n");

                    System.out.println("Line 3 was printed onto data");
                  }
                  catch (IOException e3) {

                  e3.printStackTrace();

                  }
                  finally {

                  try {

                  if (bw != null)
                  bw.close();

                  if (fw != null)
                  fw.close();

                } catch (IOException ex3) {

                  ex3.printStackTrace();

                  }
                  }


                }
                else{
                System.out.println(line3);
              }

                String line4 = arr[3];
                double[] ary4 = new double [6];
                int d = 0;
                Scanner sc3 = new Scanner(line4);
                while(sc3.hasNextDouble()){
                  ary4[d++] = sc3.nextDouble();
                }
                double x3;
                x3 = ((ary4[0]+ary4[1])*ary4[3]*ary4[5])/((ary4[2]+ary4[3])*ary4[0]*ary4[4]);
                if(x3==7.5){

                  try{
                    File file = new File(FileName);
                    if(!file.exists()){
                      file.createNewFile();
                    }
                    fw = new FileWriter(file.getAbsoluteFile(),true);
                    bw = new BufferedWriter(fw);

                    bw.write(line4 + "\r\n");

                    System.out.println("Line 4 was printed onto data");
                  }
                  catch (IOException e4) {

                  e4.printStackTrace();

                  }
                  finally {

                  try {

                  if (bw != null)
                  bw.close();

                  if (fw != null)
                  fw.close();

                } catch (IOException ex4) {

                  ex4.printStackTrace();

                  }
                  }


                }

                else{
                System.out.println(line4);
              }

                String line5 = arr[4];
                double[] ary5 = new double [6];
                int e = 0;
                Scanner sc4 = new Scanner(line5);
                while(sc4.hasNextDouble()){
                  ary5[e++] = sc4.nextDouble();
                }
                double x4;
                x4 = ((ary5[0]+ary5[1])*ary5[3]*ary5[5])/((ary5[2]+ary5[3])*ary5[0]*ary5[4]);
                if(x4==7.5){

                  try{
                    File file = new File(FileName);
                    if(!file.exists()){
                      file.createNewFile();
                    }
                    fw = new FileWriter(file.getAbsoluteFile(),true);
                    bw = new BufferedWriter(fw);
                    bw.write(line5 + "\r\n");

                    System.out.println("Line 5 was printed onto data");
                  }
                  catch (IOException e5) {

                  e5.printStackTrace();

                  }
                  finally {

                  try {

                  if (bw != null)
                  bw.close();

                  if (fw != null)
                  fw.close();

                } catch (IOException ex5) {

                  ex5.printStackTrace();

                  }
                  }


                }

                else{
                System.out.println(line5);
              }

                String line6 = arr[5];
                double[] ary6 = new double [6];
                int f = 0;
                Scanner sc5 = new Scanner(line6);
                while(sc5.hasNextDouble()){
                  ary6[f++] = sc5.nextDouble();
                }
                double x5;
                x5 = ((ary6[0]+ary6[1])*ary6[3]*ary6[5])/((ary6[2]+ary6[3])*ary6[0]*ary6[4]);
                if(x5==7.5){

                  try{
                    File file = new File(FileName);
                    if(!file.exists()){
                      file.createNewFile();
                    }
                    fw = new FileWriter(file.getAbsoluteFile(),true);
                    bw = new BufferedWriter(fw);

                    bw.write(line6 + "\r\n");
                    System.out.println("Line 6 was printed onto data");
                  }
                  catch (IOException e6) {

                  e6.printStackTrace();

                  }
                  finally {

                  try {

                  if (bw != null)
                  bw.close();

                  if (fw != null)
                  fw.close();

                } catch (IOException ex6) {

                  ex6.printStackTrace();

                  }
                  }


                }


                else{
                System.out.println(line6);
              }

                String line7 = arr[6];
                double[] ary7 = new double [6];
                int g = 0;
                Scanner sc6 = new Scanner(line7);
                while(sc6.hasNextDouble()){
                  ary7[g++] = sc6.nextDouble();
                }
                double x6;
                x6 = ((ary7[0]+ary7[1])*ary7[3]*ary7[5])/((ary7[2]+ary7[3])*ary7[0]*ary7[4]);
                if(x6==7.5){

                  try{
                    File file = new File(FileName);
                    if(!file.exists()){
                      file.createNewFile();
                    }
                    fw = new FileWriter(file.getAbsoluteFile(),true);
                    bw = new BufferedWriter(fw);

                    bw.write(line7 + "\r\n");
                    System.out.println("Line 7 was printed onto data");
                  }
                  catch (IOException e7) {

                  e7.printStackTrace();

                  }
                  finally {

                  try {

                  if (bw != null)
                  bw.close();

                  if (fw != null)
                  fw.close();

                } catch (IOException ex7) {

                  ex7.printStackTrace();

                  }
                  }


                }

                else{
                System.out.println(line7);
              }

                String line8 = arr[7];
                double[] ary8 = new double [6];
                int h = 0;
                Scanner sc7 = new Scanner(line8);
                while(sc7.hasNextDouble()){
                  ary8[h++] = sc7.nextDouble();
                }
                double x7;
                x7 = ((ary8[0]+ary8[1])*ary8[3]*ary8[5])/((ary8[2]+ary8[3])*ary8[0]*ary8[4]);
                if(x7==7.5){

                  try{
                    File file = new File(FileName);
                    if(!file.exists()){
                      file.createNewFile();
                    }
                    fw = new FileWriter(file.getAbsoluteFile(),true);
                    bw = new BufferedWriter(fw);

                    bw.write(line8 + "\r\n");
                    System.out.println("Line 8 was printed onto data");
                  }
                  catch (IOException e8) {

                  e8.printStackTrace();

                  }
                  finally {

                  try {

                  if (bw != null)
                  bw.close();

                  if (fw != null)
                  fw.close();

                } catch (IOException ex8) {

                  ex8.printStackTrace();

                  }
                  }


                }

                else{
                System.out.println(line8);
              }

                String line9 = arr[8];
                double[] ary9 = new double [6];
                int i1 = 0;
                Scanner sc8 = new Scanner(line9);
                while(sc8.hasNextDouble()){
                  ary9[i1++] = sc8.nextDouble();
                }
                double x8;
                x8 = ((ary9[0]+ary9[1])*ary9[3]*ary9[5])/((ary9[2]+ary9[3])*ary9[0]*ary9[4]);
                if(x8==7.5){

                  try{
                    File file = new File(FileName);
                    if(!file.exists()){
                      file.createNewFile();
                    }
                    fw = new FileWriter(file.getAbsoluteFile(),true);
                    bw = new BufferedWriter(fw);

                    bw.write(line9 + "\r\n");
                    System.out.println("Line 8 was printed onto data");
                  }
                  catch (IOException e9) {

                  e9.printStackTrace();

                  }
                  finally {

                  try {

                  if (bw != null)
                  bw.close();

                  if (fw != null)
                  fw.close();

                } catch (IOException ex9) {

                  ex9.printStackTrace();

                  }
                  }


                }
                else{
                System.out.println(line9);
              }

                String line10 = arr[9];
                double[] ary10 = new double [6];
                int j = 0;
                Scanner sc9 = new Scanner(line10);
                while(sc9.hasNextDouble()){
                  ary10[j++] = sc9.nextDouble();
                }
                double x9;
                x9 = ((ary10[0]+ary10[1])*ary10[3]*ary10[5])/((ary10[2]+ary10[3])*ary10[0]*ary10[4]);
                if(x9==7.5){

                  try{
                    File file = new File(FileName);
                    if(!file.exists()){
                      file.createNewFile();
                    }
                    fw = new FileWriter(file.getAbsoluteFile(),true);
                    bw = new BufferedWriter(fw);

                    bw.write(line10 + "\r\n");
                    System.out.println("Line 9 was printed onto data");
                  }
                  catch (IOException e10) {

                  e10.printStackTrace();

                  }
                  finally {

                  try {

                  if (bw != null)
                  bw.close();

                  if (fw != null)
                  fw.close();

                } catch (IOException ex10) {

                  ex10.printStackTrace();

                  }
                  }


                }
                else{
                System.out.println(line10);
              }

                String line11 = arr[10];
                double[] ary11 = new double [6];
                int k = 0;
                Scanner sc10 = new Scanner(line11);
                while(sc10.hasNextDouble()){
                  ary11[k++] = sc10.nextDouble();
                }
                double x10;
                x10 = ((ary11[0]+ary11[1])*ary11[3]*ary11[5])/((ary11[2]+ary11[3])*ary11[0]*ary11[4]);
                if(x10==7.5){

                  try{
                    File file = new File(FileName);
                    if(!file.exists()){
                      file.createNewFile();
                    }
                    fw = new FileWriter(file.getAbsoluteFile(),true);
                    bw = new BufferedWriter(fw);

                    bw.write(line11 + "\r\n");
                    System.out.println("Line 11 was printed onto data");
                  }
                  catch (IOException e11) {

                  e11.printStackTrace();

                  }
                  finally {

                  try {

                  if (bw != null)
                  bw.close();

                  if (fw != null)
                  fw.close();

                } catch (IOException ex11) {

                  ex11.printStackTrace();

                  }
                  }


                }
                else{
                System.out.println(line11);
              }

                // Always close files.
                bufferedReader.close();
            }
            catch(FileNotFoundException ex) {
                System.out.println(
                    "Unable to open file '" +
                    fileName + "'");
            }
            catch(IOException ex) {
                System.out.println(
                    "Error reading file '"
                    + fileName + "'");
                // Or we could just do this:
                // ex.printStackTrace();
            }

}

  }
