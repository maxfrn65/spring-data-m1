package org.example.springdatam1.ihm;

import org.example.springdatam1.entity.Author;
import org.example.springdatam1.entity.Book;
import org.example.springdatam1.repository.AuthorRepository;
import org.example.springdatam1.repository.BookRepository;
import org.example.springdatam1.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class IHM implements CommandLineRunner {


    @Autowired
    private AuthorService authorService;

    @Autowired
    private BookRepository bookRepository;




    @Override
    public void run(String... args) throws Exception {
        create();
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Donne moi ton prenom : ");
        String name = scanner.next();
        System.out.println("Mon prenom est : " + name);*/

    }


    private void create() {
      //  Author author = new Author();
       // author.setName("Victor Hugo");

       // Author author1Saved = authorRepository.save(author);

       // System.out.println("Author created : " + author1Saved);

       /*Author author1 = new Author();
       author1.setName("Maho");
       Author author2Saved = authorRepository.save(author1);

        System.out.println("Author created : " + author2Saved);

        Book book1 = new Book();
        book1.setTitle("Les miseroides");
        Book book2 = new Book();
        book2.setTitle("Les fleurs me font mals");

        book1.setAuthor(author2Saved);

        Book bookSaved = bookRepository.save(book1);

        System.out.println("Book created : " + bookSaved);*/


        System.out.println(authorService.findById(6L));




    }





}
