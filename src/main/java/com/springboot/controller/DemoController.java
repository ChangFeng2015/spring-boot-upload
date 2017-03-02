package com.springboot.controller;

import com.springboot.Service.DemoService;
import com.springboot.domain.Demo;
import com.springboot.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Dave on 2017/3/2.
 */
@RestController
@RequestMapping(value = "/demo")
public class DemoController
{
    @Autowired
    private DemoRepository demoRepository;

    @Autowired
    private DemoService demoService;

    /**
     * 获取demo列表
     * @return
     */
    @GetMapping(value = "/demoes")
    public List<Demo> demoList()
    {
        return demoRepository.findAll();
    }

    /**
     * 创建一个demo
     * @param userName
     * @param age
     * @return
     */
    @PostMapping(value = "/demoes")
    public Demo demoAdd(@RequestParam(value = "userName")String userName,
                        @RequestParam(value = "age")Integer age)
    {
        Demo demo = new Demo();
        demo.setUserName(userName);
        demo.setAge(age);
       return demoRepository.save(demo);
    }

    /**
     * 根据id获取demo
     * @param id
     * @return
     */
    @GetMapping(value = "/demoes/{id}")
    public Demo getDemoById(@PathVariable(value = "id")long id)
    {
        return demoRepository.findOne(id);
    }

    //全部更新
    @PutMapping(value = "/demoes/{id}")
    public Demo demoUpdateAll(@PathVariable(value = "id")long id,
                              @RequestParam(value = "userName")String userName,
                              @RequestParam(value = "age")Integer age)
    {
        Demo demo = new Demo();
        demo.setId(id);
        demo.setUserName(userName);
        demo.setAge(age);
        return demoRepository.save(demo);
    }

    //部分更新
    @PatchMapping(value = "/demoes/{id}")
    public Demo demoUpdatePart(@PathVariable(value = "id")Long id,
                               @RequestParam(value = "age")Integer age)
    {
        Demo demo = new Demo();
        demo.setId(id);
        demo.setAge(age);
        return demoRepository.save(demo);
    }

    //删除指定的demo
    @DeleteMapping(value = "/demoes/{id}")
    public void demoDelete(@PathVariable(value = "id")Long id)
    {
        if(demoRepository.exists(id))
        {
            demoRepository.delete(id);
        }
    }

    @GetMapping(value = "/demoes/two")
    public void insertTwoDemoes()
    {
        demoService.insrtTwo();
    }

}
