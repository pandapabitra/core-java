package com.mycompany.day8bookauthorprojectsolution;

import java.util.Scanner;

public class AuthorBookMain {
    static Scanner sc = new Scanner(System.in);
    static int choice;
    public static void menu(){
        System.out.println("Please enter a value from the below list of available options:");
        System.out.println("0: Enter number of books and authors");
        System.out.println("1: Add authors");
        System.out.println("2: Add books");
        System.out.println("3: Search a book by book name");
        System.out.println("4: Display a book details");
        System.out.println("5: Display an author details");
        System.out.println("6: Display all books");
        System.out.println("7: Display all authors");
        System.out.println("99: Exit Program");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
        sc.nextLine();//is this correct
    }
    public static void main(String[] args){
        Book books[] = null;
        Book book = null;//Variable 'book' initializer 'null' is redundant
        Author authors[] = null;
        Author author = null;//Created the reference//Why is this null in gray color: //Variable 'author' initializer 'null' is redundant
        int noOfAuthors = 0;
        int noOfBooks = 0;
        while(true)
        {
            menu();
            switch(choice)
            {
                case 0:
                    System.out.println("Enter the number of Authors you want");
                    noOfAuthors = sc.nextInt();
                    authors = new Author[noOfAuthors];
                    System.out.println("Enter the number of Books you want");
                    noOfBooks = sc.nextInt();
                    books = new Book[noOfBooks];
                    break;
                case 1:
                    System.out.println("Add "+noOfAuthors+" Author details");
                    //Create object of Author and add to the author array
                    for (int i = 0; i<noOfAuthors; i++)
                    {
                        System.out.println("Enter author ID");
                        int authorId = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter author name");
                        String authorName = sc.nextLine();
                        author = new Author();
                        author.setAuthorId(authorId);
                        author.setAuthorName(authorName);
                        authors[i] = author;//doubt, can we directly set the author[i]
                    }
                    break;
                case 2:
                    System.out.println("Add "+noOfBooks+" Book details");
                    //Create object of Book and add to the book array
                    for (int i = 0;i<noOfBooks;i++)
                    {
                       System.out.println("Enter Book ID");
                       int bookId = sc.nextInt();
                       sc.nextLine();
                       System.out.println("Enter Book name");
                       String bookTitle = sc.nextLine();
                       System.out.println("Enter Book Description");
                       String description = sc.nextLine();
                       System.out.println("Enter book price");
                       double price = sc.nextDouble();
                       // Display User all available authors and ask to choose one author
                       System.out.println("Available authors");
                       System.out.println("----------------------------------------------------");
                       for(Author a : authors)
                       {
                            System.out.println("Author ID : "+a.getAuthorId());
                            System.out.println("Author Name is : "+a.getAuthorName());
                            System.out.println("----------------------------------------------------");
                       }
                       System.out.println("Enter the author Id of the author for this book");
                       int authId = sc.nextInt();
                       //System.out.println(authId);
                       Author tempAuthor = null;
                       for(Author a: authors)
                       {
                           //System.out.println(a.getAuthorId());
                           if(a.getAuthorId()==authId)
                           {
                               tempAuthor = a;
                               break;
                           }
                       }
                       if(tempAuthor==null)
                       {
                            System.out.println("No matching author found!");
                       }
                       else
                       {
                           System.out.println("Your chosen Author Name is "+tempAuthor.getAuthorName());
                       }
                       book = new Book();
                       book.setBookId(bookId);
                       book.setBookTitle(bookTitle);
                       book.setDescription(description);
                       book.setPrice(price);
                       book.setAuthor(tempAuthor);
                       books[i] = book;
                    }
                    break;
                case 3:
                    System.out.println("Search a book by book name");
                    System.out.println("Enter the name of the book to search");
                    String bookName = sc.nextLine();
                    bookName=bookName.trim();
                    Book tempBook1 = null;//Should tempBook be declared outside switch case globally?
                    for(Book b: books)
                    {
                        if(b.getBookTitle().trim().equalsIgnoreCase(bookName.trim()))
                        {
                            tempBook1 = b;
                            break;
                        }
                    }
                    if(tempBook1==null)
                    {
                        System.out.println("No matching book found!");
                    }
                    else
                    {
                        System.out.println("----------------------------------------------------");
                        System.out.println("Book ID:"+tempBook1.getBookId());
                        System.out.println("Book Name:"+tempBook1.getBookTitle());
                        System.out.println("Book Description:"+tempBook1.getDescription());
                        System.out.println("Book price:"+tempBook1.getPrice());
                        System.out.println("Book author:"+tempBook1.getAuthor().getAuthorId());
                        System.out.println("Book author:"+tempBook1.getAuthor().getAuthorName());
                        System.out.println("----------------------------------------------------");
                    }
                    break;
                case 4:
                    System.out.println("Display a book details");
                    System.out.println("Enter the book id of the book");
                    int bookId = sc.nextInt();
                    Book tempBook = null;
                    for(Book b: books)
                    {
                        if(b.getBookId() == bookId)
                        {
                            tempBook = b;
                            break;
                        }
                    }
                    if(tempBook == null)
                        {
                            System.out.println("No matching book found!");
                        }
                    else
                    {
                        System.out.println("----------------------------------------------------");
                        System.out.println("Book ID:"+tempBook.getBookId());
                        System.out.println("Book Name:"+tempBook.getBookTitle());
                        System.out.println("Book Description:"+tempBook.getDescription());
                        System.out.println("Book price:"+tempBook.getPrice());
                        System.out.println("Book author:"+tempBook.getAuthor().getAuthorId());
                        System.out.println("Book author:"+tempBook.getAuthor().getAuthorName());
                        System.out.println("----------------------------------------------------");
                    }
                    break;
                case 5:
                    System.out.println("Display an author details");
                    System.out.println("Enter the author ID of the Author");
                    int authId = sc.nextInt();
                    Author tempAuthor = null;
                    for(Author a: authors)
                    {
                        if(a.getAuthorId()==authId)
                        {
                            tempAuthor = a;
                            break;
                        }
                    }
                    if(tempAuthor==null)
                    {
                        System.out.println("No matching Author found!");
                    }
                    else
                    {
                        System.out.println("----------------------------------------------------");
                        System.out.println("Author ID : "+tempAuthor.getAuthorId());
                        System.out.println("Author Name is : "+tempAuthor.getAuthorName());
                        System.out.println("----------------------------------------------------");
                    }
                    break;
                case 6:
                    System.out.println("Display all books");
                    System.out.println("----------------------------------------------------");
                    for(Book b: books)
                    {
                        System.out.println("Book ID:"+b.getBookId());
                        System.out.println("Book Name:"+b.getBookTitle());
                        System.out.println("Book Description:"+b.getDescription());
                        System.out.println("Book price:"+b.getPrice());
                        System.out.println("Book author:"+b.getAuthor().getAuthorId());
                        System.out.println("Book author:"+b.getAuthor().getAuthorName());
                        System.out.println("----------------------------------------------------");
                    }
                    break;
                case 7:
                    System.out.println("Display all authors");
                    System.out.println("----------------------------------------------------");
                    for(Author a : authors)
                    {
                        System.out.println("Author ID : "+a.getAuthorId());
                        System.out.println("Author Name is : "+a.getAuthorName());
                        System.out.println("----------------------------------------------------");
                    }
                    break;
                case 99:
                    System.out.println("Exiting the Application");
                    System.exit(0);
                default:
                    System.out.println("Wrong Input! Please Try Again");
                    break;//Why is this required
            }

        }
    }
}
