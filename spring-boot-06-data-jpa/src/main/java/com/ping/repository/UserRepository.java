package com.ping.repository;

import com.ping.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// 集成 jpaRepository 来完成数据库的操作
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
