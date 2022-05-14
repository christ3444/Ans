/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ans;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author christ
 */
public class Ans {
    
    static BufferedWriter out = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        
       
        try {
            StringBuilder sb = new StringBuilder();
            File file = new File("E:/fic.txt"); 
            DataInputStream input = new DataInputStream( new FileInputStream( file ) );
            try {
                while( true ) {
                    sb.append( Integer.toBinaryString( input.readByte() ) );
                }
            } catch( EOFException eof ) {
            } catch( IOException e ) {
                e.printStackTrace();
            }
            System.out.println(sb.toString());
            
                 try {
             
               // creation de mon fichier .ANSGAR
               out = new BufferedWriter(new FileWriter(new File("E:/bin.ans")));
             
               try {
                 
                    // 2) Utilisation de l'objet
                    out.write(sb.toString());
                 
               } finally {
                 
                    // 3) Libération de la ressource exploitée par l'objet
                    out.close();
                 
               }
             
          } catch (IOException e) {
               e.printStackTrace();
          }
            
        } catch( FileNotFoundException e2 ) {
            e2.printStackTrace();
        }
    }
    
}
