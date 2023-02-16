package com.gmail.kangjideok.sogong;

import com.gmail.kangjideok.sogong.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SogongApplicationTests {
    @Autowired
    ArticleRepository articleRepository;

    // DB 데이터 삽입
}
