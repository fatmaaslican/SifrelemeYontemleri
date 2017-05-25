/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letmetakeaselfie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Aslican
 */
public class LetMeTakeASelfie {
    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        
        hillSifreleme obj = new hillSifreleme();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int choice;
        System.out.println("Menu:\n1: Şifreleme\n2: Deşifreleme");
        choice = Integer.parseInt(in.readLine());
        System.out.println("Şifrelenecek/Deşifrelenecek metin giriniz: ");
        String line = in.readLine();
        System.out.println("Anahtar metin giriniz: ");
        String key = in.readLine();
        double sq = Math.sqrt(key.length());
        if (sq != (long) sq)
            System.out.println("Geçersiz anahtar uzunluğu!!! Bir kare matris oluşturmaz.");
        else
        {
            int s = (int) sq;
            if (obj.check(key, s))
            {
                System.out.println("Sonuç:");
                obj.divide(line, s);
                obj.cofact(obj.keymatrix, s);
            }
        }        
    }
}

