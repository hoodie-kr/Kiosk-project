import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.aloha.kiosk.mapper")  // ✅ 이거 반드시 있어야 함
public class kioskApplication {
    public static void main(String[] args) {
        SpringApplication.run(kioskApplication.class, args);
    }
}
