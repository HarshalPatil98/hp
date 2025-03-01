package com.app.bansira;

public class BookTest {

    @Test
    public void testGettersAndSetters() {
        Book book = new Book("Title", "Author", "123456", "Genre", 2020, "Department", true);

        assertEquals("Title", book.getTitle());
        assertEquals("Author", book.getAuthor());
        assertEquals("123456", book.getISBN());
        assertEquals("Genre", book.getGenre());
        assertEquals(2020, book.getPublicationYear());
        assertEquals("Department", book.getDepartment());
        assertTrue(book.isAvailability());

        book.setTitle("New Title");
        book.setAuthor("New Author");
        book.setISBN("654321");
        book.setGenre("New Genre");
        book.setPublicationYear(2021);
        book.setDepartment("New Department");
        book.setAvailability(false);

        assertEquals("New Title", book.getTitle());
        assertEquals("New Author", book.getAuthor());
        assertEquals("654321", book.getISBN());
        assertEquals("New Genre", book.getGenre());
        assertEquals(2021, book.getPublicationYear());
        assertEquals("New Department", book.getDepartment());
        assertFalse(book.isAvailability());
    }
}
