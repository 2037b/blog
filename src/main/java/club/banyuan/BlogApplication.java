package club.banyuan;


import club.banyuan.bean.User;
import club.banyuan.dao.UserDao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan({"club.banyuan.dao"})
public class BlogApplication {

  public static void main(String[] args) {
//    Logger logger = LoggerFactory.getLogger(BlogApplication.class);
    ConfigurableApplicationContext context = SpringApplication.run(BlogApplication.class, args);
    UserDao userDao = context.getBean(UserDao.class);
    User user1 = userDao.findUserByName("Jerry");
//    logger.info("{}", user1);

  }
}
