package gt.edu.umg.biblioteca.service;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public String sendNotification(String message) {
        return "Notificación enviada: " + message;
    }
}
