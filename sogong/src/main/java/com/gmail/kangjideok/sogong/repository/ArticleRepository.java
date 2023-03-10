package com.gmail.kangjideok.sogong.repository;

import com.gmail.kangjideok.sogong.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    List<Article> findArticleByArticleId(Long articleId);
}
