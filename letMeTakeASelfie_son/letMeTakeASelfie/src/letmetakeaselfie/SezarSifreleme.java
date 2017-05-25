/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letmetakeaselfie;

/**
 *
 * @author Aslican
 */
public class SezarSifreleme {
    public String Alphabet;
    public static final int shift=3;
    
    public SezarSifreleme(String Alphabet)
    {
        
        this.Alphabet=Alphabet;
        
    }
    
    public String Sifrele(String metin) {
       
        String txt="";
    
      
        for (int i = 0; i < metin.length(); i++) {
            if(metin.charAt(i)==' '){
                txt+=" ";
                continue;
            }
            if(Alphabet.indexOf(metin.charAt(i))<=(Alphabet.length()-1)-shift) 
                txt+=Alphabet.charAt(Alphabet.indexOf(metin.charAt(i))+shift);
            else
                txt+=Alphabet.charAt(Alphabet.indexOf(metin.charAt(i))+shift-Alphabet.length());
        }
        return txt;
    }
        //public String MetinAl(String metin){
        // System.out.println("Lutfen sifrelenecek metni giriniz:");
        //Scanner scan=new Scanner(System.in);
        //String sifrelenecek=scan.nextLine();
        //return sifrelenecek;
        // return metin;
        //}
   
    }

