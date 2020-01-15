package club.banyuan.bean;

import java.util.Date;
import lombok.Data;

@Data
public class Blog {

  private Integer id;
  private String title;
  private String content;
  private Date created_time;
  private String user_id;
}
