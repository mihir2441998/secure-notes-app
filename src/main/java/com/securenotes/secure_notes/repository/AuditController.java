package com.securenotes.secure_notes.repository;

import com.securenotes.secure_notes.model.audit.AuditLog;
import com.securenotes.secure_notes.services.AuditLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/audit")
public class AuditController {

    @Autowired
    private AuditLogService auditLogService;

    @GetMapping
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    List<AuditLog> getAuditLogs(){
        return auditLogService.getAuditLogs();
    }

    @GetMapping("/note/{id}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    List<AuditLog> getAuditLogByNoteId(@PathVariable Long id){
        return auditLogService.getAuditLogByNoteId(id);
    }
}
