/* Library.java handles the information stored within Member.java, Media.java, Book.java, and Movie.java
 * Library.java handles the item status information and sets the inventory status of each member.
 */

import java.util.ArrayList;

public class Library {

  ArrayList<Member> members = new ArrayList<Member> ();
  ArrayList<Media> media = new ArrayList<Media> ();

  public void checkOut (int member, int mediaID) {
    Member tempMember = members.get(member);      // Creating temporary Member object to manipulate
    Media tempID = media.get(mediaID);            // Creating temporary Media object to manipulate
    tempID.count++;                               // Incrementing check out counter
    tempMember.items.add(tempID.title);           // Adding the title to the user's list
    tempID.status = "checked out";                // Changing item status
  }

  public void checkIn (int mediaID) {
    Media tempID = media.get(mediaID);            // Creating temporary Media object to manipulate
    tempID.status = "available";                  // Changing item status
    String title = tempID.title;                  // Fetching title of temporary object
    for (int i=0; i<members.size(); i++) {    // Loop that looks for the member who had it checked out
      Member member = members.get(i);             // and removes the item from their list
      if (member.items.contains(title)) member.items.remove(title);
    }
  }
  
  /* addMember creates a new member object with the variables as set by LibraryTest
   * and simply adds the member to the ArrayList "members".
   */
  public void addMember (Member member) {
    members.add(member);
  }
  
  /* addMedia works much the same way as addMember but it creates a new book object 
   * with the variables as set by LibraryTest and simply adds the book to the 
   * ArrayList "media".
   */
  public void addMedia (Book book) {
    media.add(book);
  }

  /* addMedia works much the same way as addMember but it creates a new movie object 
   * with the variables as set by LibraryTest and simply adds the movie to the 
   * ArrayList "media".
   */
  public void addMedia (Movie movie) {
    media.add(movie);
  }
  
  /* Simple forEach loop to execute the toString() method within Members to 
   * return all of the members and information regarding said member.
   */
  public void printAllMembers () {
    members.forEach(System.out::println);
  }

  /* Simple forEach loop to execute the toString() method within Media to 
   * return all of the Media items and information regarding said item.
   */
  public void printLibrary () {
    media.forEach(System.out::println);
  } 
}




