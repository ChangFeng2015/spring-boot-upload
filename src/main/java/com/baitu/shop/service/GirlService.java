package com.baitu.shop.service;

import com.baitu.shop.domain.Girl;
import com.baitu.shop.enums.ResultEnum;
import com.baitu.shop.exception.GirlException;
import com.baitu.shop.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Dave on 2017/5/25.
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setAge(18);
        girlA.setCupSize("A");
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setAge(22);
        girlB.setCupSize("B");
        girlRepository.save(girlB);
    }

    /**
     * 通过ID查询一个女生的信息
     * @param id
     * @return
     */
    public Girl findOne(Integer id){
        return girlRepository.findOne(id);
    }

    public void getAge(Integer id) throws Exception{
        Girl girl = girlRepository.findOne(id);
        Integer age = girl.getAge();
        if(age < 10){
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }
        if(age < 18){
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }

}
