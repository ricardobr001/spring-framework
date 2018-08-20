package com.ricardo.springwebapp.repositories;

import com.ricardo.springwebapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/* All methods commented on AuthorRepository */
public interface BookRepository extends CrudRepository<Book, Long> {
}
