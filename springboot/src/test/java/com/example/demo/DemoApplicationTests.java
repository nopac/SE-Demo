package com.example.demo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.mapper.UsersMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private UsersMapper usersMapper;

	@Test
	public void testPage(){
		Page page = new Page<>(1,5);
		usersMapper.selectPage(page, null);
		for (Object record : page.getRecords()) {
			System.out.println(record);
		}
	}

}
