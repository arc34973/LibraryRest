package myLibrary.com.example.myLibraryRest.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import myLibrary.com.example.myLibraryRest.rest.JacksonCustomBorrowHistoryDeserializer;
import myLibrary.com.example.myLibraryRest.rest.JacksonCustomBorrowHistorySerializer;

@Entity
@Table(name = "borrow_history")
@JsonSerialize(using = JacksonCustomBorrowHistorySerializer.class)
@JsonDeserialize(using = JacksonCustomBorrowHistoryDeserializer.class)
public class BorrowHistory extends BaseEntity  {
	
	
	//userID,bookId,dateBorrowOut,dateTurnBack
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn (name = "user_id")
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book_id")
	private Book book;
	
	@Column(name = "date_borrow")
	@DateTimeFormat(pattern = "yyyy/mm/dd")
	private LocalDate dateBorrow;
	
	@Column(name = "date_turnback")
	@DateTimeFormat(pattern = "yyyy/mm/dd")
	private LocalDate dateTurnBack;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public LocalDate getDateBorrow() {
		return dateBorrow;
	}
	public void setDateBorrow(LocalDate dateBorrow) {
		this.dateBorrow = dateBorrow;
	}
	
	public LocalDate getDateTurnBack() {
		return dateTurnBack;
	}
	public void setDateTurnBack(LocalDate dateTurnBack) {
		this.dateTurnBack = dateTurnBack;
	}
	
	
	
	

}
