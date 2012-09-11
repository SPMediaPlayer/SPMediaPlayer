/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Markus
 */
public class JavaTest {
    
    public void print(String s)
    {
        System.out.println(s);
    }    
    public static void main(String[] args) {
               
        new JavaTest().print("Hello World!");
        //JavaTest instance = new JavaTest();
        //instance.print("Hello World!");
        
        System.out.println("Enter a mark: ");
        boolean loop = true;
        while(loop) {            
            try {
                BufferedReader in = new BufferedReader
                                  ( new InputStreamReader(System.in));
                
                double mark = Double.parseDouble(in.readLine());
                
                if  ( mark < 1)     throw new MarkException
                                        ("Mark to too good.");
                else if(mark > 5)   throw new MarkException
                                        ("Mark is too bad");
                   
                loop = false;
            }
            catch(MarkException e) {
                //System.out.println(e.getMessage());
                System.out.println("  " + e.getLocalizedMessage());
            }
            catch(NumberFormatException e) {
                System.out.println("  A parsing error occured: " 
                                        + e.getMessage());                
            }
            catch(Exception e) {
                System.out.println("  " + e.getMessage());
                //System.out.println("An error occured.");
            }
        }
        
        // ----------------------------------------------------- //
        
        new Window().setVisible(true);
        
        // ----------------------------------------------------- //
        
        long now = System.currentTimeMillis();
        slow();
        System.out.println("slow elapsed " 
                + (System.currentTimeMillis() - now) + " ms");

        now = System.currentTimeMillis();
        fast();
        System.out.println("fast elapsed " 
                + (System.currentTimeMillis() - now) + " ms");
    }

    private static void fast()
    {
        StringBuilder s = new StringBuilder();
        for(int i=0;i<100000;i++)
            s.append("*");   
        String tmp = s.toString();
    }

    private static void slow()
    {
        String s = "";
        for(int i=0;i<100000;i++)
            s+="*";        
    }
}