package com.prosky.fundamentalsalgorithmspart3.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntegerListTest {
    private final IntegerList IntegerList = new IntegerList();

    @BeforeEach

    public void List() {
        IntegerList.add(33);
        IntegerList.add(15);
        IntegerList.add(1);
    }

    @Test
    public void addTest() {
        IntegerList.add(6);
        IntegerList.add(8);
        Integer expected = 7;
        Integer actual = IntegerList.add(7);
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void addExceptionTest() {
//        assertThrows(ArrayIndexOutBondsException.class, () -> {
//            IntegerList.add(44);
//            IntegerList.add(66);
//            IntegerList.add(77);
//        });
//    }

    @Test
    public void addIndexTest() {
        assertEquals(66, IntegerList.add(1, 66));
    }

    @Test
    public void addIndexExceptionTest() {
        assertThrows(ArrayIndexOutBondsException.class, () -> {
            IntegerList.add(4, 90);
        });
    }

    @Test
    public void setTest() {
        assertEquals(85, IntegerList.set(1, 85));
    }

    @Test
    public void setIndexExceptionTest() {
        assertThrows(ArrayIndexOutBondsException.class, () -> {
            IntegerList.set(4, 76);
        });
    }

    @Test
    public void removeTest() {
        Integer actual = 15;
        assertEquals(15, IntegerList.remove(actual));
    }

    @Test
    public void removeIndexTest() {
        assertEquals(15, IntegerList.remove(1));
    }

    @Test
    public void removeIndexExceptionTest() {
        assertThrows(ElementMissingException.class, () -> {
            IntegerList.remove(4);
        });
        assertThrows(ArrayIndexOutBondsException.class, () -> {
            IntegerList.remove(5);
        });
    }

    @Test
    public void containsTest() {
        Assertions.assertTrue(IntegerList.contains(15));
        Assertions.assertFalse(IntegerList.contains(75));
    }

    @Test
    public void indexOfTest() {
        assertEquals(-1, IntegerList.indexOf(76));
        assertEquals(0, IntegerList.indexOf(33));
    }
    @Test
    public void lastIndexOfTest() {
        assertEquals(-1, IntegerList.lastIndexOf(55));
        assertEquals(0, IntegerList.lastIndexOf(33));
    }

    @Test
    public void getTest() {
        assertEquals(15, IntegerList.get(1));
    }
    @Test
    public void getTestException() {
        assertThrows(ArrayIndexOutBondsException.class, () -> {
            IntegerList.get(6);
        });
    }

    @Test
    public void sizeTest() {
        assertEquals(3, IntegerList.size());
    }

    @Test
    public void isEmptyTrueTest() {
        IntegerList.clear();
        Assertions.assertTrue(IntegerList.isEmpty());
    }    @Test
    public void isEmptyFalseTest() {
        Assertions.assertFalse(IntegerList.isEmpty());
    }
    @Test
    @AfterEach
    public void clearTest() {
        Assertions.assertNull(IntegerList.clear());
    }

    @Test
    public void toArrayTest() {
        Integer[] expected = {33, 15, 1, null, null};
        Integer[] actual = IntegerList.toArray();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void grow() {
        Assertions.assertEquals(7, IntegerList.grow());
    }
}
