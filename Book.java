/* Book.java extends Media.java
 * This class uniquely has to it the author and length (Pages) variable
 * This also houses a simple toString method so as to make the forEach loop work
 */ 

public class Book extends Media {

  String author;    // Unique to Book.java
  int length;       // Unique to Book.java
  
  public Book (int ID, String title, String author, int length) {
    super (ID, title);        // Uses Media.java to set the ID and title
    this.author = author;     // Sets this.author
    this.length = length;     // Sets this.length
  }

  public String toString () {
    return "Book(" + title + ", " + author + ", " + length + " pages, " + status + ")";
  }
}
