import com.orion.mp.Quickstart9001Main;
import com.orion.mp.entities.User;
import com.orion.mp.enums.StatusEnum;
import com.orion.mp.mapper.UserMapper;
import com.orion.mp.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author li.lc
 */

@SpringBootTest(classes = Quickstart9001Main.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class QuickStart9001MainTest {

    @Resource(name = "userMapper")
    private UserMapper userMapper;

    @Resource(name = "userService")
    private UserService userService;

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
        user.setMail("test5@baomidou.com");
        user.setStatus(StatusEnum.INACTIVE);
        userMapper.insert(user);
    }

    @Test
    public void update(){
        User user = new User();
        user.setId(1324542630725541894L);
        user.setMail("updateTest@baomidou.com");
        userMapper.updateById(user);
    }

    @Test
    public void batchAdd(){
        List<User> users = new ArrayList<>();
        for (int i =0;i<20;i++){
            User user = new User();
            user.setAge(10+i);
            user.setBirthDay(LocalDateTime.now());
            user.setName("worker"+i);
            user.setNickName("nickWorker"+i);
            user.setMail("testBatch"+i+"@baomidou.com");
            user.setStatus(StatusEnum.ACTIVE);
            users.add(user);
        }
    }

    @Test
    public void logicDelete(){
        userMapper.deleteById(2);
    }
}
