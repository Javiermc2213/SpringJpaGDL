/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.biblioteca.config;

import gt.edu.umg.biblioteca.service.NotificationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @javiiier
 */
@Configuration
public class CustomBeanConfig {
    
    @Bean
    public NotificationService notificationService() {
        return new NotificationService();
    }   
    

}
