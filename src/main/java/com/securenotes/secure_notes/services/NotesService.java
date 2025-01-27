package com.securenotes.secure_notes.services;

import com.securenotes.secure_notes.Dtos.NoteDto;

import java.util.List;


public interface NotesService {

    NoteDto createNoteForUser(String username, String content, String noteTitle);

    NoteDto updateNoteForUser(Long noteId, String content, String username, String noteTitle);

    void deleteNoteForUser(Long noteId, String username);

    List<NoteDto> getNotesForUser(String username);
}
