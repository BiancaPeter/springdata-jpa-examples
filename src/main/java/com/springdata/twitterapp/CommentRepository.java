package com.springdata.twitterapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {

    List<Comment>findAllByTweet(Tweet tweet);

    List<Comment>findAllByTweet_User(User user);
}
