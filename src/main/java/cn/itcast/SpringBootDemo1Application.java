package cn.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//.创建一个启动类,不可缺少的
@SpringBootApplication
public class SpringBootDemo1Application {
    public static void  main(String[] args){
        SpringApplication.run(SpringBootDemo1Application.class,args);
    }
}
