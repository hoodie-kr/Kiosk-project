import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index";  // templates/index.html
    }

    @GetMapping("/order")
    public String order() {
        return "order";  // templates/order.html
    }
}
