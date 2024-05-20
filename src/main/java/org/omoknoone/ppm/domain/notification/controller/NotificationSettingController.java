package org.omoknoone.ppm.domain.notification.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.omoknoone.ppm.domain.notification.dto.NotificationSettingRequestDTO;
import org.omoknoone.ppm.domain.notification.dto.NotificationSettingResponseDTO;
import org.omoknoone.ppm.domain.notification.service.NotificationSettingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/notification-settings")
public class NotificationSettingController {

    private final NotificationSettingService notificationSettingService;

    @GetMapping("/{employeeId}")
    public ResponseEntity<NotificationSettingResponseDTO> viewNotificationSetting(@PathVariable String employeeId) {
        NotificationSettingResponseDTO responseDTO = notificationSettingService.viewNotificationSetting(employeeId);
        return ResponseEntity.ok(responseDTO);
    }

    @PutMapping
    public ResponseEntity<NotificationSettingResponseDTO> updateNotificationSettings
            (@RequestBody NotificationSettingRequestDTO requestDTO) {
        NotificationSettingResponseDTO responseDTO = notificationSettingService.updateNotificationSettings(requestDTO);
        return ResponseEntity.ok(responseDTO);
    }
}
