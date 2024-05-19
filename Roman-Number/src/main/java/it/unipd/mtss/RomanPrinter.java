////////////////////////////////////////////////////////////////////
//  Gabriele Isacco Magnelli 2075542
//  Teodora Mihajlovic 2068221
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;//

public class RomanPrinter {

    private static String[] lettera_I = {
            "  _____ ",
            " |_   _|",
            "   | |  ",
            "   | |  ",
            "  _| |_ ",
            " |_____|"
    };
    /**
     * ASCII-ART per lettera V
     */
    private static String[] lettera_V = {
            " __      __",
            " \\ \\    / /",
            "  \\ \\  / / ",
            "   \\ \\/ /  ",
            "    \\  /   ",
            "     \\/    "
    };
    /**
     * ASCII-ART per lettera X
     */
    private static String[] lettera_X = {
            " __   __",
            " \\ \\ / /",
            "  \\ V / ",
            "   > <  ",
            "  / . \\ ",
            " /_/ \\_\\"
    };
    /**
     * ASCII-ART per lettera L
     */
    private static String[] lettera_L = {
            "  _      ",
            " | |     ",
            " | |     ",
            " | |     ",
            " | |____ ",
            " |______|"
    };
    /**
     * ASCII-ART per lettera C
     */
    private static String[] lettera_C = {
            "   _____ ",
            "  / ____|",
            " | |     ",
            " | |     ",
            " | |____ ",
            "  \\_____|"
    };
    /**
     * ASCII-ART per lettera D
     */
    private static String[] lettera_D = {
            "  _____  ",
            " |  __ \\ ",
            " | |  | |",
            " | |  | |",
            " | |__| |",
            " |_____/ "
    };
    /**
     * ASCII-ART per lettera M
     */
    private static String[] lettera_M = {
            "  __  __ ",
            " |  \\/  |",
            " | \\  / |",
            " | |\\/| |",
            " | |  | |",
            " |_|  |_|"
    };

    /**
     * <p> Dato un intero num in input ne crea un ascii-art in numerazione romana
     * @param num intero [1,3999] da convertire in numerazione romana
     * @return stringa ascii-art
     */
    public static String print(int num) throws ZeroException,NegativeNumberException, BiggerThan4000Exception{
        
        if(num==0) {throw new ZeroException(); }
        if(num<0) {throw new NegativeNumberException();}
        if(num>3999) {throw new BiggerThan4000Exception();}
        
        else return printAsciiArt(ArabsToRomans.Converter(num));
      
    }

    /**
     * <p> Data in input una stringa di numerazione romana, ne produce una contenente l'ascii-art
     * @param romanNumber numero in numerazione romana
     * @return stringa in ascii-art di romanNumber
     */
    private static String printAsciiArt(String romanNumber) {
        String s = "";
        for(int j = 0; j < 6; j++) {
            for(int k = 0; k < romanNumber.length(); k++) {
                switch(romanNumber.charAt(k)) {
                    case 'I':
                        s += lettera_I[j];
                        break;
                    case 'V':
                        s += lettera_V[j];
                        break;
                    case 'X':
                        s += lettera_X[j];
                        break;
                    case 'L':
                        s += lettera_L[j];
                        break;
                    case 'C':
                        s += lettera_C[j];
                        break;
                    case 'D':
                        s += lettera_D[j];
                        break;
                    case 'M':
                        s += lettera_M[j];
                        break;
                }
            }
            s += "\n";
        }
        return s;
    }
}
