package com.securenotes.secure_notes.services.impl;

import com.securenotes.secure_notes.model.audit.AuditLog;
import com.securenotes.secure_notes.model.note.Note;
import com.securenotes.secure_notes.repository.AuditLogRepository;
import com.securenotes.secure_notes.services.AuditLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AuditLogServiceImpl implements AuditLogService {

    @Autowired
    private AuditLogRepository auditLogRepository;

    @Override
    public void logNoteChange(String username, Note note, String action){
        AuditLog log = new AuditLog();
        log.setAction(action);
        log.setUsername(username);
        log.setNoteId(note.getNoteId());
        log.setNoteContent(note.getNoteContent());
        log.setTimestamp(LocalDateTime.now());
        auditLogRepository.save(log);
    }

    @Override
    public List<AuditLog> getAuditLogs() {
        return auditLogRepository.findAll();
    }

    @Override
    public List<AuditLog> getAuditLogByNoteId(Long noteId) {
        return auditLogRepository.findByNoteId(noteId);
    }
}
