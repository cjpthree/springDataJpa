package com.jarxi.sdjpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = com.jarxi.sdjpa.RepositoryTestConfig.class)
public class SdjpaApplicationTests {

    @Test
    public void contextLoads() {
    }

}
