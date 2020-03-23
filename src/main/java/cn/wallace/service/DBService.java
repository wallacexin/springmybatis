package cn.wallace.service;

import cn.wallace.mapper.BookMapper;
import cn.wallace.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    @Autowired
    private BookMapper bookMapper;

    public Book getBookList(long index) {
        return bookMapper.selectByPrimaryKey(index);
    }
}
