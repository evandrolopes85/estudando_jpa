package com.teste;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class AssertTest {

	@Test
	@DisplayName("verifica se dois arrays sao iguais")
	public void testAssertArrayEquals() {
		byte[] esperado = "teste".getBytes();
		byte[] atual    = "teste".getBytes();
		
		assertArrayEquals(esperado, atual);
	}
	
	@Test
	public void testAssertEquals() {
		assertEquals("text", "text");
		assertTrue('a' > 'b', () -> "Assertion messages can be lazily evaluated -- to avoid constructing complex messages unnecessarily.");
	}
	
	@Test
	public void testAssertFalse() {
		assertFalse(false); //Testa para ver se é falso ou verdadeiro
	}
	
	@Test
	public void testAssertNotNull() {
		assertNotNull(new Object()); // para garantir que objeto não está retornado um valor nullo
	}
	
	@Test
	public void testAssertNotSame() {
		assertNotSame(new Object(), new Object()); // Verifica se os objetos não sao os mesmos
	}
	
	@Test
	public void TestAssertNull() {
		assertNull(null); // para garantir que o objeto está null em um determinado momento
	}
	
	@Test
	public void testAssertSame() {
		Integer aNumber = Integer.valueOf(765);
		assertSame(aNumber, aNumber); // Verifica se o objeto é o mesmo
	}
}
