import com.alilestera.dao.UserDao;
import com.alilestera.domain.User;
import com.alilestera.service.UserService;
import com.alilestera.service.impl.TestServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

/**
 * @author Alilestera
 * @date 2/3/2022
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringTest {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    @Autowired
    private TestServiceImpl testService;

    @Test
    public void testJunit() {
        System.out.println("test测试成功");
    }

    @Test
    public void testMybatis() {
        List<User> list = userDao.findAll();
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void updateUserAge() {
        userService.updateUserAge(9, 18);
    }

    @Test
    public void testPropagation() {
        testService.test();
    }
}
