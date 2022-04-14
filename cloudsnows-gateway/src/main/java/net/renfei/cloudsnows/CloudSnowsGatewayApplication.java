package net.renfei.cloudsnows;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务网关启动类
 *
 * @author renfei
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudSnowsGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudSnowsGatewayApplication.class, args);
    }
}
