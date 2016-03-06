package com.william.sandbox.stackoverflow.samples20160306;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by wlee on 3/6/16.
 */
public class Demo {

    public static void main(String args[]) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/com/william/sandbox/stackoverflow/samples20160306/Demo.java"));
        String line = bufferedReader.readLine();
        int lineCount = 0;
        while(line != null){
            lineCount += 1;
            line = bufferedReader.readLine();
        }
        System.out.println("Line count is: " + lineCount);

        bufferedReader.close();
        bufferedReader = new BufferedReader(new FileReader("src/main/java/com/william/sandbox/stackoverflow/samples20160306/Demo.java"));

        line = bufferedReader.readLine();
        while(line != null){
            System.out.println(line);
            line = bufferedReader.readLine();
        }
    }
}
