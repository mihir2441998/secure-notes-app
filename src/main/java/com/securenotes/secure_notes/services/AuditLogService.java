package com.securenotes.secure_notes.services;

import com.securenotes.secure_notes.model.audit.AuditLog;
import com.securenotes.secure_notes.model.note.Note;

import java.util.List;

public interface AuditLogService {
    void logNoteChange(String username, Note note, String action);

    List<AuditLog> getAuditLogs();

    List<AuditLog> getAuditLogByNoteId(Long noteId);
}
