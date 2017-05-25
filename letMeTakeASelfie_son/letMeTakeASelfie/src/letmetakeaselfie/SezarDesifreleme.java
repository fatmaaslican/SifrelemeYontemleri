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
public class SezarDesifreleme {
     public String Alphabet;
    public int shift=3;
    
    public SezarDesifreleme(String Alphabet)
    {
        this.Alphabet=Alphabet;
   
    }
    
    public String Desifrele(String metin) {
       
        String txt="";
    
        //String text=MetinAl();
      
        for (int i = 0; i < metin.length(); i++) {
            if(metin.charAt(i)==' '){
                txt+=" ";
                continue;
            }
            if(Alphabet.indexOf(metin.charAt(i))-shift<0) 
                txt+=Alphabet.charAt(Alphabet.indexOf(metin.charAt(i))-shift+Alphabet.length());
            else
                txt+=Alphabet.charAt(Alphabet.indexOf(metin.charAt(i))-shift);
        }
        return txt;
    }
         //public String MetinAl(){
         //  System.out.println("Lutfen desifrelenecek metni giriniz:");
        //Scanner scan=new Scanner(System.in);
        //String sifrelenecek=scan.nextLine();
        //return sifrelenecek;
        //}
}
