package com.example.Druid;

import com.example.Druid.mapper.DemoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DruidApplicationTests {

	@Autowired
	DemoMapper demoMapper;

	@Test
	void contextLoads() {
		demoMapper.testSelect();
	}

}
