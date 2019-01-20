package com.fujitsu.springboot;

import com.fujitsu.entity.Dog;
import com.fujitsu.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    private Dog dog;
    @Test
    public void contextLoads() {
        System.out.println(person);
    }

    @Test
    public void dog() {
        System.out.println(dog);
    }

}

