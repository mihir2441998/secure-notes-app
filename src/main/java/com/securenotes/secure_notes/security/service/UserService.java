package com.securenotes.secure_notes.security.service;


import com.securenotes.secure_notes.Dtos.UserDTO;
import com.securenotes.secure_notes.model.note.security.User;

import java.util.List;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<UserDTO> getAllUsers();

    UserDTO getUserById(Long id);

    User findByUsername(String username);
}
