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
    private int pages;
    private String refNumber;

    /**
     * Set the author, title, pages fields and initialize the reference number 
     * when this object is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
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
    
    /**
     * This method satisfies the requirement of problem 2.85
     * Returns the number of pages in the book.
     */
    public int getPages()
    {
        return pages;
    }
    
    /**
     * This method satisfies the requirement of problem 2.84
     * Prints the author of the book to the terminal.
     */
    public void printAuthor()
    {
        System.out.println("Author: " + author);
    }
    
    /**
     * This method satisfies the requirement of problem 2.84
     * Prints the title of the book to the terminal.
     */
    public void printTitle()
    {
        System.out.println("Title: " + title);
    }
    
    /**
     * This method satisfies the requirement of problem 2.87
     * Prints the details of the book to the terminal.
     */
    public void printDetails()
    {
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
    }
    
    /**      
    * This method sets the reference number for the book.
    * Satisfies the requirement of problem 2.88
    */
    public void setRefNumber(String ref)
    {
        refNumber = ref;
    }
    
    /**      
    * This method returns the reference number of the book.
    * Satisfies the requirement of problem 2.88
    */
    public String getRefNumber()
    {
        return refNumber;
    }
}