/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }
    
    /**
     * This method satisfies the requirement of problem 2.83
     * Returns the author of the book.
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * This method satisfies the requirement of problem 2.83
     * Returns the title of the book.
     */
    public String getTitle()
    {
        return title;
    }
}
