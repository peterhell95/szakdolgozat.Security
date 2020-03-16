package szakdolgozat.rate.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import szakdolgozat.rate.model.Book;

public interface RateRepository extends JpaRepository<Book, String> {

    Optional<Book> findById(Long id);

    void deleteById(Long id);

}