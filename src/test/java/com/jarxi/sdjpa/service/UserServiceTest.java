package com.jarxi.sdjpa.service;

import com.jarxi.sdjpa.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = com.jarxi.sdjpa.RepositoryTestConfig.class)
@Transactional
@DirtiesContext
public class UserServiceTest {
	@Autowired
	UserService userService;

	@Test
	public void testSaveUser() {
		List<User> users = userService.getUserList();
		assertThat(users, is(notNullValue()));
		User user = new User();
		user.setAge(11);
		user.setUserName("na");
		user.setPassword("pa");
		userService.save(user);
		List<User> users2 = userService.getUserList();
		assertThat(users2, notNullValue());
		assertThat(users2.size(), is(1));
	}
}
