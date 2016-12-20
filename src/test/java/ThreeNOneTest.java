import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by snoop on 16. 12. 14.
 */
public class ThreeNOneTest {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @Test
    public void testFirst() throws Exception {

        ThreeNOne t = new ThreeNOne();

        int result = t.start(1, 10);

        assertEquals(result, 20);


        int logicResult = t.logic(10);

        assertEquals(logicResult, 10/2);

        logicResult = t.logic(11);

        assertEquals(logicResult, 11 * 3 + 1);

        List<Integer> fullList = t.fullList(1, 10);

        assertEquals(fullList.size(), 10 + 1 - 1);


        int cycle = t.cycle(22);

        assertEquals(cycle, 16);

        result = t.start(100, 200);
        assertEquals(result, 125);


        result = t.start(201, 210);
        assertEquals(result, 89);


        result = t.start(900, 1000);
        assertEquals(result, 174);


    }


//    @Test
    public void testInput() throws Exception {

        ThreeNOne t = new ThreeNOne();

        int result = t.input();

        assertEquals(result, 1);

    }

    @Test
    public void testPrint() throws Exception {


        ThreeNOne t = new ThreeNOne();

        t.print(1, 10);

        t.print(100, 200);
        t.print(201, 210);
        t.print(900, 1000);

    }

}