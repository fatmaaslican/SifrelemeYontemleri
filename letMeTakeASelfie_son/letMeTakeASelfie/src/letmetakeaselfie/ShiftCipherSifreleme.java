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
public class ShiftCipherSifreleme {
    public String Alphabet;
    public int shift;
    
    public ShiftCipherSifreleme(String Alphabet,int shift)
    {
        this.Alphabet=Alphabet;
        this.shift=shift;
    }
    
    public String ShiftSifrele(String metin) {
       
        String txt="";
    
      //  String text=MetinAl();
      
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
    //public String MetinAl(){
        //System.out.println("Lutfen sifrelenecek metni giriniz:");
        //Scanner scan=new Scanner(System.in);
        //String sifrelenecek=scan.nextLine();
       // return sifrelenecek;
    //}
   
}
