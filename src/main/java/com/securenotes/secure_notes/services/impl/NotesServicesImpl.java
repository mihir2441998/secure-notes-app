package com.securenotes.secure_notes.services.impl;

import com.securenotes.secure_notes.Dtos.NoteDto;
import com.securenotes.secure_notes.Utils.NoteMapper;
import com.securenotes.secure_notes.model.note.Note;
import com.securenotes.secure_notes.repository.NotesRepository;
import com.securenotes.secure_notes.services.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesServicesImpl implements NotesService {

    @Autowired
    private NotesRepository noteRepository;

    @Override
    public NoteDto createNoteForUser(String username, String content, String noteTitle) {
        Note note = new Note();
        note.setNoteContent(content);
        note.setOwningUser(username);
        note.setNoteTitle(noteTitle);
        Note savedNote = noteRepository.save(note);
        return NoteMapper.MapToNoteDto(savedNote);
    }

    @Override
    public NoteDto updateNoteForUser(Long noteId, String content, String username,String noteTitle) {
        Note note = noteRepository.findById(noteId).orElseThrow(()
                -> new RuntimeException("Note not found"));
        note.setNoteContent(content);
        note.setNoteTitle(noteTitle);
        Note updatedNote = noteRepository.save(note);
        return NoteMapper.MapToNoteDto(updatedNote);
    }

    @Override
    public void deleteNoteForUser(Long noteId, String username) {
        Note note = noteRepository.findById(noteId).orElseThrow(
                () -> new RuntimeException("Note not found")
        );
        noteRepository.delete(note);
    }

    @Override
    public List<NoteDto> getNotesForUser(String username) {
        List<Note> personalNotes = noteRepository
                .findByOwningUser(username);
        return personalNotes.stream().map(NoteMapper::MapToNoteDto).toList();
    }
}
