package com.cy.pj.common.cache;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CacheTests {
    /**
     * Spring 容器为此属性按照怎样的规则进行依赖注入(赋值)
     * 1)首先按类型从spring容器进行查找，假如找到一个则直接注入，
     * 没找到则抛出NoSuchBeanDefinition异常。
     * 2)其次假如此类型的对象有多个，此时还会基于属性名进行匹配,
     * 名字匹配的对象可直接注入，名字不匹配则直接抛出NoUniqueBeanDefinitionException异常。
     * 3)再次，我们也可以显式为属性要注入的对象指定其名字，
     * 可以通过@Qualifier注解进行指定(此注解配合@Autowired注解使用)。
     */
	@Autowired
	@Qualifier("softCache")
	private Cache cache;
	
	@Test
	void testCache() {
		System.out.println(cache);
	}
	
}
