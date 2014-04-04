package queue1;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Diese Klasse ist eine JUnit-TestKlasse welche den Konstruktor und alle Methoden testen soll
 * @author Philipp Adler
 * @version 2014-04-04
 */
public class JunitTest {
	
	/**
	 * Diese Methode soll überprüfen ob der Konstruktor der Klasse Queue1 richtig läuft
	 */
	@Test
	public void Queue1(){
		queue1.Queue1 q1 = new queue1.Queue1(0);
	}
	
	/**
	 * Diese Methode soll überprüfen ob die add Methode der Klasse Queue1 richtig läuft
	 */
	@Test
	public void add(){
		queue1.Queue1 q = new queue1.Queue1(1);
		try{
			q.add("Test");
		}catch(RuntimeException f){//wenn man nicht adden kann kommt es zu einer Fehlermeldung
			fail("add failed");
		}
	}
	
	/**
	 * Diese Methode soll überprüfen ob die get Methode der Klasse Queue1 richtig läuft
	 */
	@Test
	public void get(){
		queue1.Queue1 q = new queue1.Queue1(1);
		q.add("Test");
		try{	
			q.get();
		}catch(RuntimeException f){//wenn man nichts zurückbekommt kommt es zu einer Fehlermeldung
			fail("get failed");
		}
	}
	
	/**
	 * Diese Methode soll überprüfen ob die isfull Methode der Klasse Queue1 richtig läuft
	 */
	@Test
	public void isfull(){
		queue1.Queue1 q = new queue1.Queue1(2);
		q.add("Test");
		if(q.isFull()){//falls der Queue schon voll ist, sollte er aber nicht sein kommt es zu einer Fehlermeldung
			fail("isfull failed");
		}
	}
	
	/**
	 * * Diese Methode soll überprüfen ob die isEmpty Methode der Klasse Queue1 richtig läuft
	 */
	@Test
	public void isEmpty() {
		queue1.Queue1 q = new queue1.Queue1(1);
		if(!q.isEmpty()){//falls der Queue leer ist, sollte er aber nicht sein kommt es zu einer Fehlermeldung
			fail("isEmpty failed");
		}
	}
}
