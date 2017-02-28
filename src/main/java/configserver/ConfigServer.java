package configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.ConfigServerApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by chenzhichao on 2017/2/28.
 *
 * @author chenzhichao
 * @date 2017/02/28
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer {

    public static void main(String[] args) {

        SpringApplication.run(ConfigServerApplication.class, args);

    }
}
