package com.practice.springpractice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> {

    //springDataJpa에서 제공하지 않는 메소드는 위처럼 쿼리를 작성해 사용한다.
    @Query("SELECT p from Posts p order by p.id desc ")
    List<Posts> findAllDesc();
}
