package usedStore.usedStorespring;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class TestController {
    @GetMapping("/test")
    public ArrayList<String> testHandler() {
        System.out.println("ㅎㅇ");
        ArrayList<String> list = new ArrayList<>();
        list.add("김정혁");
        list.add("송민영");
        list.add("조랭이떡");
        list.add("리류릴");
        list.add("anoying-orange");
        list.add("이차로");
        return list;
    }
}
