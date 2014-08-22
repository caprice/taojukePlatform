package test;




import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.taojuk.platform.dao.UserDao;

/**
 * 单元测试
 * @author marker 
 * @version 1.0
 * @blog www.yl-blog.com
 * @weibo http://t.qq.com/wuweiit
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = "classpath:/config/spring/*.xml")
public class UserDaoTest extends AbstractJUnit4SpringContextTests {
 
	
	@Autowired UserDao userDao;
	
	@Test
	public void test(){
		int a = userDao.countAll();
		System.out.println(a); 
		
		
	}
	 
 
}
 