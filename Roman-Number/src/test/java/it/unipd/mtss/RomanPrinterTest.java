package it.unipd.mtss;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RomanPrinterTest {

    static RomanPrinter printer;

    @BeforeClass
    public static void startPrinter() {
        printer = new RomanPrinter();
    }
    /**
     * Test singola lettera I
     * @throws ZeroException,NegativeNumberException, BiggerThan4000Exception
     */
    @Test
    public void test_I() throws ZeroException,NegativeNumberException, BiggerThan4000Exception{
        String i = "  _____ \n |_   _|\n   | |  \n   | |  \n  _| |_ \n |_____|\n";
        assertEquals(i, printer.print(1));
    }
    /**
     * Test singola lettera V
     * @throws ZeroException,NegativeNumberException, BiggerThan4000Exception
     */
    @Test
    public void test_V() throws ZeroException,NegativeNumberException, BiggerThan4000Exception{
        String v = " __      __\n \\ \\    / /\n  \\ \\  / / \n   \\ \\/ /  \n    \\  /   \n     \\/    \n";
        assertEquals(v, printer.print(5));
    }
    /**
     * Test singola lettera X
     * @throws ZeroException,NegativeNumberException, BiggerThan4000Exception
     */
    @Test
    public void test_X() throws ZeroException,NegativeNumberException, BiggerThan4000Exception {
        String x = " __   __\n \\ \\ / /\n  \\ V / \n   > <  \n  / . \\ \n /_/ \\_\\\n";
        assertEquals(x, printer.print(10));
    }
    /**
     * Test singola lettera L
     * @throws ZeroException,NegativeNumberException, BiggerThan4000Exception
     */
    @Test
    public void test_L()  throws ZeroException,NegativeNumberException, BiggerThan4000Exception{
        String l = "  _      \n | |     \n | |     \n | |     \n | |____ \n |______|\n";
        assertEquals(l, printer.print(50));
    }
    /**
     * Test singola lettera C
     * @throws ZeroException,NegativeNumberException, BiggerThan4000Exception
     */
    @Test
    public void test_C() throws ZeroException,NegativeNumberException, BiggerThan4000Exception {
        String c = "   _____ \n  / ____|\n | |     \n | |     \n | |____ \n  \\_____|\n";
        assertEquals(c, printer.print(100));
    }
    /**
     * Test singola lettera D
     * @throws ZeroException,NegativeNumberException, BiggerThan4000Exception
     */
    @Test
    public void test_D()throws ZeroException,NegativeNumberException, BiggerThan4000Exception {
        String d = "  _____  \n |  __ \\ \n | |  | |\n | |  | |\n | |__| |\n |_____/ \n";
        assertEquals(d, printer.print(500));
    }
    /**
     * Test singola lettera M
     * @throws ZeroException,NegativeNumberException, BiggerThan4000Exception
     */
    @Test
    public void test_M() throws ZeroException,NegativeNumberException, BiggerThan4000Exception{
        String m = "  __  __ \n |  \\/  |\n | \\  / |\n | |\\/| |\n | |  | |\n |_|  |_|\n";
        assertEquals(m, printer.print(1000));
    }

    /**
     * Test numero 256
     * @throws ZeroException,NegativeNumberException, BiggerThan4000Exception
     */
    @Test
    public void testNumero_256() throws ZeroException,NegativeNumberException, BiggerThan4000Exception{
        String s = "   _____    _____   _       __      __  _____ \n  / ____|  / ____| | |      \\ \\    / / |_   _|\n | |      | |      | |       \\ \\  / /    | |  \n | |      | |      | |        \\ \\/ /     | |  \n | |____  | |____  | |____     \\  /     _| |_ \n  \\_____|  \\_____| |______|     \\/     |_____|\n";
        assertEquals(s, printer.print(256));
    }

    /**
     * Test numero 94
     * @throws ZeroException,NegativeNumberException, BiggerThan4000Exception
     */
    @Test
    public void testNumero_94()  throws ZeroException,NegativeNumberException, BiggerThan4000Exception{
        String s = " __   __   _____   _____  __      __\n \\ \\ / /  / ____| |_   _| \\ \\    / /\n  \\ V /  | |        | |    \\ \\  / / \n   > <   | |        | |     \\ \\/ /  \n  / . \\  | |____   _| |_     \\  /   \n /_/ \\_\\  \\_____| |_____|     \\/    \n";
        assertEquals(s, printer.print(94));
    }
    /**
     * Test numero 3999
     * @throws ZeroException,NegativeNumberException, BiggerThan4000Exception
     */
    @Test
    public void testNumeroLimite() throws ZeroException,NegativeNumberException, BiggerThan4000Exception  {
        String s = "  __  __   __  __   __  __    _____   __  __  __   __   _____   _____  __   __\n |  \\/  | |  \\/  | |  \\/  |  / ____| |  \\/  | \\ \\ / /  / ____| |_   _| \\ \\ / /\n | \\  / | | \\  / | | \\  / | | |      | \\  / |  \\ V /  | |        | |    \\ V / \n | |\\/| | | |\\/| | | |\\/| | | |      | |\\/| |   > <   | |        | |     > <  \n | |  | | | |  | | | |  | | | |____  | |  | |  / . \\  | |____   _| |_   / . \\ \n |_|  |_| |_|  |_| |_|  |_|  \\_____| |_|  |_| /_/ \\_\\  \\_____| |_____| /_/ \\_\\\n";
        assertEquals(s, printer.print(3999));
    }
}
