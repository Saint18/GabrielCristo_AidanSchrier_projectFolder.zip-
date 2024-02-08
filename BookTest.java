/*
 * /******
Name: Gabriel Cristo
Assignment: Getting Started in Java
Date: 1/19
Notes: Tests person class 
******/
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * A JUnit test class for the Person class.
 */
public class BookTest {

  private Person john;
  private Person herman;
  private Person poe;
  private Book moby;
  private Book book; 
  private Book raven; 
  

  @Before
  public void setUp() {

    john = new Person("john", "doe", 1989);
    herman = new Person("Herman", "Melville", 1819);
    poe = new Person("edgar", "poe", 1947);
    moby = new Book("Moby Dick", herman, 10);
    raven = new Book("The Raven", poe, 12);
    book = new Book("Title", john, 4);
 
  }

  @Test
  public void testGettitle() {
    assertEquals("Moby Dick", moby.getTitle());
    assertEquals("Title", book.getTitle());
    assertEquals("The Raven", raven.getTitle());
  }

  @Test
  public void testGetAuthor() {
    assertEquals(herman, moby.getAuthor());
    assertEquals(poe, raven.getAuthor());
    assertEquals(john, book.getAuthor());
  }

  @Test
  public void testgetPrice() {
    assertEquals(10, moby.getPrice());
    assertEquals(12, raven.getPrice());
    assertEquals(4, book.getPrice());
  }

}
