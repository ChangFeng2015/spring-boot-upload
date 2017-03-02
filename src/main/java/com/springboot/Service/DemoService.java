package com.springboot.Service;

import com.springboot.domain.Demo;
import com.springboot.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Dave on 2017/3/2.
 */
@Service
public class DemoService
{
    @Autowired
    private DemoRepository demoRepository;

    @Transactional
    public void insrtTwo()
    {
        Demo demoA = new Demo();
        demoA.setUserName("a");
        demoA.setAge(12);
        demoRepository.save(demoA);

        Demo demoB = new Demo();
        demoB.setUserName("bfsdf");
        demoB.setAge(89);
        demoRepository.save(demoB);
    }
}
