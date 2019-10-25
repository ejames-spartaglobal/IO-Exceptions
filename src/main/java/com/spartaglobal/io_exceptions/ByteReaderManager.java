package com.spartaglobal.io_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class ByteReaderManager {

    public void readStream(){
        try (InputStream input=new FileInputStream("resources/TestFile.txt");){
            int data = 0;
            while (data != -1){
                data=input.read();
                System.out.println(data);

            }
           // System.out.println(input.read());
        } catch(IOException error){
            error.printStackTrace();
        }
    }

    public void charReader(){
        try (InputStream input=new FileInputStream("resources/TestFile.txt");){
            int data = 0;
            int aCount=0;
            while (data != -1){
                data=input.read();
                System.out.println((char) data);
                if((char) data =='a'){
                    aCount++;
                }
            }
            System.out.println(aCount);
            // System.out.println(input.read());
        } catch(IOException error){
            error.printStackTrace();
        }

    }
}
