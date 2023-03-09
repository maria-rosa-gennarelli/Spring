package co.develhope.deploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
public class BasicController {

    @GetMapping("/")
    public int getRandomSum() {
        int num1 = ThreadLocalRandom.current().nextInt(1, 50);
        int num2 = ThreadLocalRandom.current().nextInt(1, 10 );
        return num1 + num2;
    }

}