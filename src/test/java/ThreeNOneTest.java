import org.junit.Test;

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

    }

}