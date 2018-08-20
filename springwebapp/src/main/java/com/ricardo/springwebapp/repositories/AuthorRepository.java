package com.ricardo.springwebapp.repositories;

import com.ricardo.springwebapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/* Spring CrudRepository is going to implement for us
 * the Create, Read, Update and Delete (CRUD)
 *
 * It have the following methods:
 *
 * S extends Author
 * ID extends Long
 *
 * S save(S entity) - save an object
 * Iterable<S> saveAll(Iterable<S> var) - save a list of objects
 * Optional<Author> findById(ID var) - search an Author by the id, and return the encountered Author in Optional if exists, else null
 * boolean existsById(ID var) - verify if the following id exists in the database
 * Iterable<T> findAll() - recover all Authors stored in the database
 * Iterable<T> findAllById(Iterable<ID> var) - recover all Author that have the same value
 * long count() - Return how many Authors we have stored in the database
 * void deleteById(ID id) - Remove an Author from the database by the value of id
 * void delete(Author entity) - Delete an Author from the database
 * void deleteAll(Iterable<? extends Author> entities) - Delete all Author from the database that are on the list
 * void deleteAll() - Delete everything from the database */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
