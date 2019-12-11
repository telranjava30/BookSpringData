package telran.book.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.book.model.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, String> {

	//List<Publisher> findByBooksAuthorsName(String authorName);

}
