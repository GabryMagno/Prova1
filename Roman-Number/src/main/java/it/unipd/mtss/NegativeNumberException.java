////////////////////////////////////////////////////////////////////
//  Gabriele Isacco Magnelli 2075542
//  Teodora Mihajlovic 2068221
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class NegativeNumberException extends Exception {
    public NegativeNumberException(){
        super("Negative numbers don't exist in Roman numerals !");
    }
}