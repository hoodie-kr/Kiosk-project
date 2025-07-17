package com.aloha.kiosk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.aloha.kiosk.mapper")  // ✅ 꼭 있어야 MyBatis가 RamenMapper 찾음
public class kioskApplication {
    public static void main(String[] args) {
        SpringApplication.run(kioskApplication.class, args);
    }
}
