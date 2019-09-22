package kz.iitu.jd3.bookinfo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/book/info")
public class BookController {


    @GetMapping("/{userId}")
    public UserBook getBooksByUserId(
            @PathVariable("userId") String userId) {

        List<Book> userBookList =  Arrays.asList(
    new Book("1", "Title 1", "Tt", "Desc 1"),
    new Book("2", "Title 2", "Ttt", "Desc 2"));

        UserBook userBook = new UserBook(userBookList);

        return userBook;
    }
}
