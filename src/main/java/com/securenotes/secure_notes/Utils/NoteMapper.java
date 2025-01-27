package com.securenotes.secure_notes.Utils;

import com.securenotes.secure_notes.model.note.Note;
import com.securenotes.secure_notes.Dtos.NoteDto;

public class NoteMapper {

    public static Note mapToNote(NoteDto noteDto) {
        Note note = new Note();
        note.setNoteTitle(noteDto.getNoteTitle());
        note.setNoteContent(noteDto.getNoteContent());
        note.setOwningUser(noteDto.getOwningUser());
        return note;
    }

    public static NoteDto MapToNoteDto(Note note) {
        NoteDto noteDto = new NoteDto();
        noteDto.setNoteId(note.getNoteId());
        noteDto.setNoteTitle(note.getNoteTitle());
        noteDto.setNoteContent(note.getNoteContent());
        noteDto.setOwningUser(note.getOwningUser());
        return noteDto;
    }
}
