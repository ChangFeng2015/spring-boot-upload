package com.baitu.shop.repository;

import com.baitu.shop.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Dave on 2017/5/24.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer>
{
    List<Girl> findByAge(Integer age);
}
