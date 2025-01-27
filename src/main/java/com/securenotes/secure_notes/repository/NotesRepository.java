package com.securenotes.secure_notes.repository;

import com.securenotes.secure_notes.model.note.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface NotesRepository extends JpaRepository<Note, Long> {

    List<Note> findByOwningUser(String username);
}
