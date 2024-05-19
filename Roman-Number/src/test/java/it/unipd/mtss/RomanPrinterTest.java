package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;

public class RomanPrinterTest {
    /**
     * Test singola lettera I
     * @throws Exception
     */
    @Test
    public void test_I(){
        String i = "  _____ \n |_   _|\n   | |  \n   | |  \n  _| |_ \n |_____|\n";
        assertEquals(i, RomanPrinter.print(1));
    }
    /**
     * Test singola lettera V
     * @throws Exception
     */
    @Test
    public void test_V(){
        String v = " __      __\n \\ \\    / /\n  \\ \\  / / \n   \\ \\/ /  \n    \\  /   \n     \\/    \n";
        assertEquals(v, RomanPrinter.print(5));
    }
    /**
     * Test singola lettera X
     * @throws Exception
     */
    @Test
    public void test_X()  {
        String x = " __   __\n \\ \\ / /\n  \\ V / \n   > <  \n  / . \\ \n /_/ \\_\\\n";
        assertEquals(x, RomanPrinter.print(10));
    }
    /**
     * Test singola lettera L
     * @throws Exception
     */
    @Test
    public void test_L()  {
        String l = "  _      \n | |     \n | |     \n | |     \n | |____ \n |______|\n";
        assertEquals(l, RomanPrinter.print(50));
    }
    /**
     * Test singola lettera C
     * @throws Exception
     */
    @Test
    public void test_C()  {
        String c = "   _____ \n  / ____|\n | |     \n | |     \n | |____ \n  \\_____|\n";
        assertEquals(c, RomanPrinter.print(100));
    }
    /**
     * Test singola lettera D
     * @throws Exception
     */
    @Test
    public void test_D() {
        String d = "  _____  \n |  __ \\ \n | |  | |\n | |  | |\n | |__| |\n |_____/ \n";
        assertEquals(d, RomanPrinter.print(500));
    }
    /**
     * Test singola lettera M
     * @throws Exception
     */
    @Test
    public void test_M() {
        String m = "  __  __ \n |  \\/  |\n | \\  / |\n | |\\/| |\n | |  | |\n |_|  |_|\n";
        assertEquals(m, RomanPrinter.print(1000));
    }

    /**
     * Test numero 256
     * @throws Exception
     */
    @Test
    public void testNumero_256() {
        String s = "   _____    _____   _       __      __  _____ \n  / ____|  / ____| | |      \\ \\    / / |_   _|\n | |      | |      | |       \\ \\  / /    | |  \n | |      | |      | |        \\ \\/ /     | |  \n | |____  | |____  | |____     \\  /     _| |_ \n  \\_____|  \\_____| |______|     \\/     |_____|\n";
        assertEquals(s, RomanPrinter.print(256));
    }

    /**
     * Test numero 94
     * @throws Exception
     */
    @Test
    public void testNumero_94()  {
        String s = " __   __   _____   _____  __      __\n \\ \\ / /  / ____| |_   _| \\ \\    / /\n  \\ V /  | |        | |    \\ \\  / / \n   > <   | |        | |     \\ \\/ /  \n  / . \\  | |____   _| |_     \\  /   \n /_/ \\_\\  \\_____| |_____|     \\/    \n";
        assertEquals(s, RomanPrinter.print(94));
    }
    /**
     * Test numero 3999
     * @throws Exception
     */
    @Test
    public void testNumeroLimite()  {
        String s = "  __  __   __  __   __  __    _____   __  __  __   __   _____   _____  __   __\n |  \\/  | |  \\/  | |  \\/  |  / ____| |  \\/  | \\ \\ / /  / ____| |_   _| \\ \\ / /\n | \\  / | | \\  / | | \\  / | | |      | \\  / |  \\ V /  | |        | |    \\ V / \n | |\\/| | | |\\/| | | |\\/| | | |      | |\\/| |   > <   | |        | |     > <  \n | |  | | | |  | | | |  | | | |____  | |  | |  / . \\  | |____   _| |_   / . \\ \n |_|  |_| |_|  |_| |_|  |_|  \\_____| |_|  |_| /_/ \\_\\  \\_____| |_____| /_/ \\_\\\n";
        assertEquals(s, RomanPrinter.print(3999));
    }
}
