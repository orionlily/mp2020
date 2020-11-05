import com.orion.mp.Quickstart9001Main;
import com.orion.mp.entities.User;
import com.orion.mp.mapper.UserMapper;
import com.orion.mp.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.time.LocalDateTime;

/**
 * @author li.lc
 */

@SpringBootTest(classes = Quickstart9001Main.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class QuickStart9001MainTest {

    @Resource(name = "userMapper")
    private UserMapper userMapper;

    @Test
    public void getAllUsers(){
        userMapper.selectList(null).forEach(System.out::println);
    }

    @Test
    public void add(){
        User user = new User();
        user.setAge(18);
        user.setBirthDay(LocalDateTime.now());
        user.setName("worker");
        user.setNickName("nickWorker");
        userMapper.insert(user);
    }
}
