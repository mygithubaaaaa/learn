package com.example.springjpalearn;

import com.example.springjpalearn.entity.User;
import com.example.springjpalearn.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import javax.transaction.Transactional;

/**
 * Copyright(C),2021-2022,Liupan 刘攀
 * FileName:UserTest
 * Author:  Liu pan 刘攀
 * Date:    2022/7/27 23:39
 */
@Slf4j
@SpringBootTest
public class UserTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    public void userTest() {
        User user = new User();
        user.setUsername("liupan");
        user.setPassword("123456");
        user.setAge(18);
        userRepository.save(user);
        User inDdb = userRepository.findByUsername("liupan");
        log.info("user:{}", inDdb);
    }

    @Test
    public void testBaseQuery() throws Exception {
        User user = new User();
        userRepository.findAll();
    }

    @Test
    public void testPageQuery() throws Exception {
        int page = 1;
        int size = 10;
        Pageable pageable = PageRequest.of(page, size);
        Page<User> all = userRepository.findAll(pageable);
        log.info("page:{}", all.getContent());
        Page<User> liupan = userRepository.findByUsername("liupan", pageable);
        log.info("liupan:{}", liupan.getContent());
    }
}
