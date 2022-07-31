package com.example.springjpalearn.repository;

import com.example.springjpalearn.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * Copyright(C),2021-2022,Liupan 刘攀
 * FileName:UserRepository
 * Author:  Liu pan 刘攀
 * Date:    2022/7/27 23:38
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    Page<User> findAll(Pageable pageable);

    Page<User> findByUsername(String username, Pageable pageable);

    @Transactional
    @Modifying
    @Query("update User u set u.age = ?1 where u.username = ?2")
    int updateAgeByUsername(int age, String username);

    /**
     * 通过年龄查找用户
     * @param age
     */
    void findByAge(int age);


}
