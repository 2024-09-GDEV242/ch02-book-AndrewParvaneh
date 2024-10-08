/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Andrew Parvaneh)
 * @version (9/17/24)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private final boolean courseText;

    /**
     * Set the author, title, pages fields, initialize the reference number,
     * and set the courseText field when this object is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = isCourseText;
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
     * This method returns whether the book is a course text.
     * satisfies the requirement of problem 2.92
     */
    public boolean isCourseText()
    {
        return courseText;
    }
    
    /**
     * This method increases the borrowed count by 1 each time it is called.
     * This method satisfies the requirement of problem 2.91
     */
    public void borrow()
    {
        borrowed++;
    }
    
    /**
     * This method returns the number of times the book has been borrowed.
     * This method satisfies the requirement of problem 2.91
     */
    public int getBorrowed()
    {
        return borrowed;
    }
    
    /**
     * This method satisfies the requirement of problem 2.87
     * This method satisfies the requirement of problem 2.89
     * Prints the details of the book to the terminal.
     */
    public void printDetails()
    {
        String refToPrint = (refNumber.length() > 0) ? refNumber : "ZZZ";
        System.out.println("Title: " + title + ", Author: " + author + 
        ", Pages: " + pages + ", Ref Number: " + refToPrint + 
        ", Times Borrowed: " + borrowed + ", Course Text: " + (courseText ? "Yes" : "No"));
    }
    
    /**      
    * This method sets the reference number for the book.
    * Satisfies the requirement of problem 2.88
    * Satisfies the requirement of problem 2.90
    */
    public void setRefNumber(String ref)
    {
        if (ref.length() >= 3){
            refNumber = ref;
        }else {
            System.out.println("Error: Reference number must be at least 3 characters long.");
        }
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