package myLibrary.com.example.myLibraryRest.service;

import java.util.Collection;

import org.springframework.dao.DataAccessException;

import myLibrary.com.example.myLibraryRest.model.Book;
import myLibrary.com.example.myLibraryRest.model.BorrowHistory;
import myLibrary.com.example.myLibraryRest.model.User;

public interface LibraryService {

	Collection<User> findByLastName(String lastName) throws DataAccessException;

	void save(User user) throws DataAccessException;

	User findByUserId(int id) throws DataAccessException;

	User findByUserName(String userName) throws DataAccessException;

	Collection<Book> findByTitle(String title) throws DataAccessException;

	void save(Book book) throws DataAccessException;

	Book findByBookId(int id) throws DataAccessException;

	Collection<BorrowHistory> findBorrowHistoryByUserId(int id) throws DataAccessException;

	Collection<BorrowHistory> findBorrowHistoryByBookId(int id) throws DataAccessException;

	BorrowHistory findBorrowHistoryById(int id) throws DataAccessException;

	void save(BorrowHistory borrowHistory) throws DataAccessException;

	Collection<Book> findAllBooks() throws DataAccessException;

	Collection<User> findAllUsers() throws DataAccessException;

	void delete(User user) throws DataAccessException;

	void delete(Book book) throws DataAccessException;
}
