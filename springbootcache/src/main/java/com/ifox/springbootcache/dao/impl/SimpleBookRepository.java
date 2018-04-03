package com.ifox.springbootcache.dao.impl;

import com.ifox.springbootcache.dao.BookRepository;
import com.ifox.springbootcache.entity.Book;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in19:202018/4/3
 * @Modified By:
 */

@Component
public class SimpleBookRepository implements BookRepository {
    @Override
    @Cacheable("books")

    public Book getById(String isbn) {
        simulateSlowService();
        return new Book(isbn,"Some book");
    }
    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
