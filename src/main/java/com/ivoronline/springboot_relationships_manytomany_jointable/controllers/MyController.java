package com.ivoronline.springboot_relationships_manytoone_jointable.controllers;

import com.ivoronline.springboot_relationships_manytoone_jointable.entities.Author;
import com.ivoronline.springboot_relationships_manytoone_jointable.entities.Book;
import com.ivoronline.springboot_relationships_manytoone_jointable.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;

@Controller
public class MyController {

  @Autowired
  AuthorRepository authorRepository;

  @ResponseBody
  @RequestMapping("/addAuthor")
  public String addAuthor() {

    //CREATE BOOKS
    Book    book1        = new Book();
            book1.title  = "Book about dogs";

    Book    book2        = new Book();
            book2.title  = "Book about cats";

    //CREATE AUTHORS
    Author  author1      = new Author();
            author1.name = "John";
            author1.age  = 20;

    Author  author2      = new Author();
            author2.name = "Bill";
            author2.age  = 30;

    //ADD BOOKS TO AUTHORS
    author1.books = new HashSet<Book>();
    author1.books.add(book1);
    author1.books.add(book2);

    author2.books = new HashSet<Book>();
    author2.books.add(book1);
    author2.books.add(book2);

    //STORE AUTHORS & BOOKS
    authorRepository.save(author1);
    authorRepository.save(author2);

    //RETURN SOMETHING TO BROWSER
    return "Author & Books were stored into DB";

  }

}
