package club.banyuan;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BlogApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(BlogApplication.class, args);

  }
}
