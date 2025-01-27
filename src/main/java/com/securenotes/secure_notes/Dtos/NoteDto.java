package com.securenotes.secure_notes.Dtos;

import lombok.Data;

@Data
public class NoteDto {

    private Long noteId;

    private String noteTitle;

    private String noteContent;

    private String owningUser;
}
