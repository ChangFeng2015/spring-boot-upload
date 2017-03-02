package com.springboot.repository;


import com.springboot.domain.Demo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Dave on 2017/3/2.
 */
public interface DemoRepository extends JpaRepository<Demo,Long>
{

}