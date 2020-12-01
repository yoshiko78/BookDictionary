package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookDao;
import com.example.demo.entity.Book;

@Service
public class BookService {

    @Autowired
    BookDao bookDao;

    //1件検索
    public Book findById(Integer id) {
        Book book = new Book();
        book.setId(id);
        return this.bookDao.findById(book);
    }

    //全件取得
    public List<Book> getBookList(){
        return this.bookDao.findAll();
    }
}