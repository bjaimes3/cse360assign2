import org.junit.Test;

import static org.junit.Assert.*;

public class AddingMachineTest {


    //test the return function getTotal using a new addingMachine class which should return 0
    @Test
    public void getTotal() {
        cse360assign2.AddingMachine getToalTest = new cse360assign2.AddingMachine();
        assertEquals(0, getToalTest.getTotal());

    }

    //Creates new AddingMachine Class uses add function to add 3 expecting a value of 3
    @Test
    public void add() {
        cse360assign2.AddingMachine addTest = new cse360assign2.AddingMachine();
        addTest.add(3);
        assertEquals(3, addTest.getTotal());
    }

    //Creates new AddingMachine Class uses sub function to subtract 3 expecting a value of -3
    @Test
    public void subtract() {
        cse360assign2.AddingMachine subTest = new cse360assign2.AddingMachine();
        subTest.subtract(3);
        assertEquals(-3, subTest.getTotal());
    }

    //Creates new AddingMachine Class uses add function to the function and print the results stored
    @Test
    public void testToString() {
        cse360assign2.AddingMachine stringTest = new cse360assign2.AddingMachine();
        stringTest.subtract(3);
        stringTest.add(5);
        assertEquals("0 - 3 + 5", stringTest.toString());
    }

    //Creates new AddingMachine uses sub and add to fill the string and sum uses clear to reset expecting "0"
    @Test
    public void testClearString() {
        cse360assign2.AddingMachine clearTest = new cse360assign2.AddingMachine();
        clearTest.subtract(3);
        clearTest.add(5);
        clearTest.clear();
        assertEquals("0", clearTest.toString());
    }

    //Creates new AddingMachine uses sub and add to fill the string and sum uses clear to reset expecting a val of 0
    @Test
    public void testClearTotal() {
        cse360assign2.AddingMachine clearTest = new cse360assign2.AddingMachine();
        clearTest.subtract(3);
        clearTest.add(5);
        clearTest.clear();
        assertEquals(0, clearTest.getTotal());
    }
}