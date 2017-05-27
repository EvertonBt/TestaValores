package br.com.projeto;

import junit.framework.TestCase;

public class ValoresTesteCase extends TestCase {

	private Valores lista;

	
	protected void setUp() throws Exception{
		
		super.setUp();
		lista = new Valores();
		lista.ins(5);
		lista.ins(12);
		lista.ins(1);
		lista.ins(30);
		lista.ins(152);
		lista.ins(6);
	}
	
	public void testInserir(){
		assertEquals(false,lista.ins(-10));
		assertEquals(false,lista.ins(0));
		lista.ins(2);
		assertEquals(7,lista.size());
		lista.ins(3);
		assertEquals(8,lista.size());
		lista.ins(4);
		assertEquals(9,lista.size());
		lista.ins(5);
		assertEquals(10,lista.size());
		assertEquals(false,lista.ins(11));
		
	}
	
	public void testDel() {


	  	assertEquals(5,lista.del(0));
		assertEquals(6,lista.del(4));
		assertEquals(-1,lista.del(4));
		assertEquals(1,lista.del(1));
		assertEquals(12,lista.del(0));
		assertEquals(30,lista.del(0));
		assertEquals(152,lista.del(0));
		assertEquals(-1,lista.del(0));
	   

	}

	public void testSize(){
		
		assertEquals(6, lista.size());

	}
	
	public void testMean(){
		
	  	assertEquals(34.333333333333336,lista.mean());
	}
	
	public void testGreater(){
		
	  	assertEquals(152,lista.greater());
	}

   public void testLower(){
	   
	   assertEquals(1, lista.lower());
   }


}
