package com.journaldev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JUnit5Sample2Test_Assertions {

    @Test
    void testAssertEqual() {
        assertEquals("ABC", "ABC");
        assertEquals(20, 20, "optional assertion message");
        assertEquals(2 + 2, 4);
    }

    @Test
    void testAssertFalse() {
        assertFalse("FirstName".length() == 10);
        assertFalse(10 > 20, "assertion message");
    }

    @Test
    void testAssertNull() {
        String str1 = null;
        String str2 = "abc";
        assertNull(str1);
        assertNotNull(str2);
    }

    @Test
    void testAssertAll() {
        String str1 = "abc";
        String str2 = "pqr";
        String str3 = "xyz";
        assertAll("numbers",
                () -> assertEquals(str1,"abc"),
                () -> assertEquals(str2,"pqr"),
                () -> assertEquals(str3,"xyz")
        );
        /*
        El código agrupa tres aserciones bajo el nombre "numbers" utilizando assertAll.
        Cada aserción verifica si una cadena de texto es igual a un valor específico
         utilizando el método assertEquals.
         */

        //uncomment below code and understand each assert execution
     /*assertAll("numbers",
		  () -> assertEquals(str1,"abc"),
		  () -> assertEquals(str2,"pqr1"),
		  () -> assertEquals(str3,"xyz1")
	 );*/
    }

    @Test
    void testAssertTrue() {
        assertTrue("FirstName".startsWith("F"));
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("Illegal Argument Exception occurred");
        });
        /*
        Después de ejecutar estas líneas de código, si el bloque de código dentro de la expresión lambda lanza
        efectivamente una  IllegalArgumentException, entonces esa excepción se captura y se almacena
        en la variable exception.
         */
        assertEquals("Illegal Argument Exception occurred", exception.getMessage());
    }

}
