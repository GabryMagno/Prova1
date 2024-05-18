////////////////////////////////////////////////////////////////////
//  Gabriele Isacco Magnelli 2075542
//  Teodora Mihajlovic 2068221
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class BiggerThan4000Exception extends Exception {
    public BiggerThan4000Exception(){
        super("Numbers greater than 4000 are not supported!");
    }
}