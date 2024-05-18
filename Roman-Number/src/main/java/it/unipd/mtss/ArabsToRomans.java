////////////////////////////////////////////////////////////////////
// Gabriele Isacco Magnelli 2075542
// Teodora Mihajlovic 2068221
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class ArabsToRomans {
    public static String Converter(int a) throws ZeroException,NegativeNumberException, BiggerThan4000Exception{

        if(a==0) {throw new ZeroException(); }
        if(a<0) {throw new NegativeNumberException();}
        if(a>3999) {throw new BiggerThan4000Exception();}

        String[] thousands = {"", "M","MM","MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return (thousands[a / 1000] + hundreds[(a % 1000) / 100] + tens[(a % 100) / 10] + units[a % 10]);
    }
}