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
public class ShiftCipherDesifreleme {
     public String Alphabet;
    public int shift;
    
    public ShiftCipherDesifreleme(String Alphabet,int shift)
    {
        this.Alphabet=Alphabet;
        this.shift=shift;
    }
    
    public String ShiftDesifrele(String metin) {
       
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
        //System.out.println("Lutfen desifrelenecek metni giriniz:");
        //Scanner scan=new Scanner(System.in);
        //String sifrelenecek=scan.nextLine();
      //  return sifrelenecek;
    //}
    
}
