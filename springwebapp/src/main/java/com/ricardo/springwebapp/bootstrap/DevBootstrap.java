package com.ricardo.springwebapp.bootstrap;

import com.ricardo.springwebapp.model.Author;
import com.ricardo.springwebapp.model.Book;
import com.ricardo.springwebapp.repositories.AuthorRepository;
import com.ricardo.springwebapp.repositories.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@AllArgsConstructor

/*  Adding @Component
 * Now this class now is a Spring Bean, it's going to be wired up by the Spring
 * This class is going to be created and managed by the Spring Framework in the runtime */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository; // Going to be auto wired
    private BookRepository bookRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData() {
        // The legend
        Author tolkien = new Author("John", "Ronald Reuel Tolkien");
        Book bookOne = new Book("The Fellowship of the Ring ", "1234", "J. R. R. Tolkien");
        tolkien.getBooks().add(bookOne);
        bookOne.getAuthors().add(tolkien);

        // Saving tolkien and the first book in the database
        authorRepository.save(tolkien);
        bookRepository.save(bookOne);

        // The second legend
        Author martin = new Author("George", "Raymond Richard Martin");
        Book bookTwo = new Book("A Game of Thrones", "4321", "George R. R. Martin");
        martin.getBooks().add(bookTwo);

        // Saving martin and the second book in the database
        authorRepository.save(martin);
        bookRepository.save(bookTwo);
    }
}
