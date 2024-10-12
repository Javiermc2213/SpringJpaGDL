/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.biblioteca.controller;

import gt.edu.umg.biblioteca.service.NotificationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author javiiier
 */
@RestController 
public class NotificationController {
    
    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    
    @GetMapping("/sendNotification")
    public String sendNotification() {
        notificationService.sendNotification("Hey este es mi mensaje, debe verse en el log tambien");
        return "Mensaje enviado";
    }
    
    
    
}
