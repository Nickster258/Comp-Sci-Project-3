public class LibraryTest {
  
  public static void main (String[] args) {
    
    //Create library object
    
    Library lib = new Library ();
    
    // Add Members to the library
    
    lib.addMember (new Member (0, "Casey Bowman"     ));
    lib.addMember (new Member (1, "Burt Reynolds"    ));
    lib.addMember (new Member (2, "Hillary Clinton"  ));
    lib.addMember (new Member (3, "Donald Trump"     ));
    lib.addMember (new Member (4, "Homer Simpson"    ));
    lib.addMember (new Member (5, "David Hasselhoff" ));
    lib.addMember (new Member (6, "Sarah Palin"      ));
    lib.addMember (new Member (7, "Marge Simpson"    ));
    lib.addMember (new Member (8, "Mallory Archer"   ));
    
    // Add Media items to the library (Books and Movies)
    
    //                      ID, title,                                       creator,                length 
    
    lib.addMedia (new Book (0,  "The Stand",                                 "Stephen King",         823  ));
    lib.addMedia (new Book (1,  "It",                                        "Stephen King",         1138 ));
    lib.addMedia (new Book (2,  "Infinite Jest",                             "David Foster Wallace", 1104 ));
    lib.addMedia (new Book (3,  "The Hobbit",                                "J.R.R. Tolkien",       304  ));
    lib.addMedia (new Book (4,  "The Fellowship of the Ring",                "J.R.R. Tolkien",       479  ));
    lib.addMedia (new Book (5,  "The Two Towers",                            "J.R.R. Tolkien",       415  ));
    lib.addMedia (new Book (6,  "The Return of the King",                    "J.R.R. Tolkien",       347  ));
    lib.addMedia (new Book (7,  "Dune",                                      "Frank Herbert",        412  ));
    lib.addMedia (new Book (8,  "Harry Potter and the Philosopher’s Stone",  "J.K. Rowling",         223  ));
    lib.addMedia (new Book (9,  "Harry Potter and the Chamber of Secrets",   "J.K. Rowling",         251  ));
    lib.addMedia (new Book (10, "Harry Potter and the Prisoner of Azkaban",  "J.K. Rowling",         317  ));
    lib.addMedia (new Book (11, "Harry Potter and the Goblet of Fire",       "J.K. Rowling",         636  ));
    lib.addMedia (new Book (12, "Harry Potter and the Order of the Phoenix", "J.K. Rowling",         766  ));
    lib.addMedia (new Book (13, "Harry Potter and the Half-Blood Prince",    "J.K. Rowling",         607  ));
    lib.addMedia (new Book (14, "Harry Potter and the Deathly Hallows",      "J.K. Rowling",         607  ));
    
    
    lib.addMedia (new Movie (15, "Batman Begins",                            "Christopher Nolan",    140  ));
    lib.addMedia (new Movie (16, "The Dark Knight",                          "Christopher Nolan",    152  ));
    lib.addMedia (new Movie (17, "The Dark Knight Rises",                    "Christopher Nolan",    166  ));
    lib.addMedia (new Movie (18, "Army of Darkness",                         "Sam Raimi",            81   ));
    lib.addMedia (new Movie (19, "Ghostbusters",                             "Ivan Reitman",         105  ));
    lib.addMedia (new Movie (20, "Gettysburg",                               "Ron Maxwell",          271  ));
    lib.addMedia (new Movie (21, "Ben-Hur",                                  "William Wyler",        212  ));
    lib.addMedia (new Movie (22, "Dune",                                     "David Lynch",          137  ));
    lib.addMedia (new Movie (23, "Terminator 2: Judgement Day",              "James Cameron",        137  ));
    lib.addMedia (new Movie (24, "Rocky",                                    "John G. Avildsen",     120  ));
    lib.addMedia (new Movie (25, "One Flew Over the Cuckoo's Nest",          "Milos Forman",         133  ));
    lib.addMedia (new Movie (26, "Toy Story",                                "John Lasseter",        81   ));
    lib.addMedia (new Movie (27, "The Black Hole",                           "Gary Nelson",          98   ));
    lib.addMedia (new Movie (28, "Goodfellas",                               "Martin Scorsese",      146  ));
    lib.addMedia (new Movie (29, "Close Encounters of the Third Kind",       "Steven Spielberg",     137  ));
    
    // Check out some Media items
    //            ID, itemID
    lib.checkOut (0, 0);   // Casey Bowman checks out The Stand
    lib.checkOut (0, 7);   // Casey Bowman checks out Dune (book)
    lib.checkOut (1, 22);  // Burt Reynolds checks out Dune (movie)
    lib.checkOut (2, 19);  // Hillary Clinton checks out Ghostbusters
    lib.checkOut (3, 27);  // Donald Trump checks out The Black Hole
    lib.checkOut (4, 1);   // Homer Simpson checks out It
    lib.checkOut (5, 6);
    lib.checkOut (5, 29);
    lib.checkOut (6, 21);
    lib.checkOut (7, 20);
    lib.checkOut (8, 8);
    
    // Print Members
    
    lib.printAllMembers ();   // You'll need to make sure to implement this! 
    System.out.println ();
    
    // Print Library
    
    lib.printLibrary ();      // You'll need to make sure to implement this!
    System.out.println ("\n");  
    
    // Check in some media
    
    lib.checkIn (0);    // Check The Stand back in
    lib.checkIn (1);    // Check It back in
    lib.checkIn (27);   // Check The Black Hole back in
    lib.checkIn (19);   // Check Ghostbusters back in
    lib.checkIn (29);
    lib.checkOut (0, 28);
    lib.checkOut (2, 26);
    lib.checkOut (3, 24);
    lib.checkOut (3, 15);
    lib.checkOut (4, 18);
    lib.checkOut (6, 2);
    
    lib.printAllMembers ();
    System.out.println ();
    
    lib.printLibrary ();
    System.out.println ();
    
    
  } // main
  
} // LibraryTest
