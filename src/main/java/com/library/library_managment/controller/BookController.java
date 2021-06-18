package com.library.library_managment.controller;

import com.library.library_managment.exception.ResourseNotFoundException;
import com.library.library_managment.model.Book;
import com.library.library_managment.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("api/v1/")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    //get all
    @GetMapping("/books")
    public List<Book> getAllBook(){
    return bookRepository.findAll();}

    @GetMapping("/book")
    public Book getBookByID(long id){
        return bookRepository.getById(id);
    }

    //add book
    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        return bookRepository.save(book);
    }
    //update book
    @PutMapping("/books/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable long id,@RequestBody Book bookDetails){
        Book book =bookRepository.findById(id).orElseThrow(()-> new ResourseNotFoundException("Employee not exit with id :" + id));
        book.setBookName(bookDetails.getBookName());

       Book updatedBook = bookRepository.save(book);
       return ResponseEntity.ok(updatedBook);
    }

    //delete book
    @DeleteMapping("/books/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteBook(@PathVariable Long id){
        Book book =bookRepository.findById(id).orElseThrow(()-> new ResourseNotFoundException("Employee not exit with id :" + id));

        bookRepository.delete(book);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}
