package it.unipd.mtss;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArabsToRomansTest
{
    static ArabsToRomans converter;

    @BeforeClass
    public static void startPrinter() {
        converter = new ArabsToRomans();
    }

    // test sulle lettere

    @Test
    public void NumberToLetter3() throws ZeroException,NegativeNumberException,BiggerThan4000Exception{
        String[] romans= {"I", "II", "III"};
        for(int i=1;i<=3;i++){
            assertEquals(converter.Converter(i), romans[i-1]);
        }
    }

    @Test
    public void NumberToLetter6() throws ZeroException,NegativeNumberException,BiggerThan4000Exception{
        String roman="VI";
        assertEquals(converter.Converter(6),roman);
    }

    @Test
    public void NumberToLetter10() throws ZeroException,NegativeNumberException,BiggerThan4000Exception{
        assertEquals("X",converter.Converter(10));
    }

    @Test
    public void NumberToLetter20() throws ZeroException,NegativeNumberException,BiggerThan4000Exception{
        String roman="XX";
        assertEquals(converter.Converter(20),roman);
    }

    @Test
    public void NumberToLetter50() throws ZeroException,NegativeNumberException,BiggerThan4000Exception{
        String roman="L";
        assertEquals(converter.Converter(50),roman);
    }

    @Test
    public void NumberToLetter100() throws ZeroException,NegativeNumberException,BiggerThan4000Exception{
        String roman="C";
        assertEquals(converter.Converter(100),roman);
    }

    @Test
    public void NumberToLetter500() throws ZeroException,NegativeNumberException,BiggerThan4000Exception{
        String roman="D";
        assertEquals(converter.Converter(500),roman);
    }

    @Test
    public void NumberToLetter1000() throws ZeroException,NegativeNumberException,BiggerThan4000Exception{
        String roman="M";
        assertEquals(converter.Converter(1000),roman);
    }

    //test casi particolari

    @Test
    public void CasoParticolare4() throws ZeroException,NegativeNumberException,BiggerThan4000Exception{
        String roman="IV";
        assertEquals(converter.Converter(4),roman);
    }
    @Test
    public void CasoParticolare9() throws ZeroException,NegativeNumberException,BiggerThan4000Exception{
        String roman="IX";
        assertEquals(converter.Converter(9),roman);
    }
    @Test
    public void CasoParticolare40() throws ZeroException,NegativeNumberException,BiggerThan4000Exception{
        assertEquals(converter.Converter(40),"XL");
    }
    @Test
    public void CasoParticolare900() throws ZeroException,NegativeNumberException,BiggerThan4000Exception{
        assertEquals(converter.Converter(900),"CM");
    }

    //Caso_Max

    @Test
    public void CasoMax3999() throws ZeroException,NegativeNumberException,BiggerThan4000Exception{
        assertEquals(converter.Converter(3999),"MMMCMXCIX");
    }
    //Testing exception
    @Test(expected = ZeroException.class)
    public void convertZero() throws ZeroException, BiggerThan4000Exception, NegativeNumberException{
        int zero=0;

        ArabsToRomans.Converter(zero);
    }

    @Test(expected = NegativeNumberException.class)
    public void convertNegative() throws ZeroException, BiggerThan4000Exception, NegativeNumberException{
        int negative=-1;

        ArabsToRomans.Converter(negative);
    }

    @Test(expected = BiggerThan4000Exception.class)
    public void convertGreaterThan5000() throws ZeroException, BiggerThan4000Exception, NegativeNumberException{
        int bigger=4000;

        ArabsToRomans.Converter(bigger);
    }

}
