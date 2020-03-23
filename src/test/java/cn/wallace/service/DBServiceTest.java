package cn.wallace.service;

import cn.wallace.Application;
import cn.wallace.model.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class DBServiceTest {

    @Autowired
    private DBService dbService;

    @Test
    public void getBookList() {
        Book book = dbService.getBookList(1);
        System.out.println(book.getId()+"|"+book.getTitle());
    }
}