package com.app;

import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.entity.User;
import com.app.repos.UserRepos;
import com.app.serviceimpl.UserServiceImpl;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class SpringDemoApplicationTests {

    @InjectMocks
    private UserServiceImpl userServiceImpl;

    @Mock
    private UserRepos userRepos;

    @Test
    void contextLoads() {
    }

    @Test
    public void testUserDetails() {
        //when(userRepos.findById(1L)).thenReturn(Optional.empty());
    	//Mockito.when(userRepos.findById(1L)).thenReturn(Optional.of(new User(1L, "ayam", "sawarn16@gmail.com")));
    }

}
