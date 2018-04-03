package com.ifox.springbootcache.dao;

import com.ifox.springbootcache.entity.Book;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in19:192018/4/3
 * @Modified By:
 */
public interface BookRepository {
    Book getByIsbn(String isbn);
}
