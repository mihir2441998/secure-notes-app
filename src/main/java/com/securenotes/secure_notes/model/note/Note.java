package com.securenotes.secure_notes.model.note;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "notes")
@Data
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noteId;

    private String noteTitle;

    private String noteContent;

    private String owningUser;
}
