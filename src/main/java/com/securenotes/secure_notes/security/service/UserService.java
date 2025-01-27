package com.securenotes.secure_notes.security.service;


import com.securenotes.secure_notes.Dtos.UserDTO;

import java.util.List;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<UserDTO> getAllUsers();

    UserDTO getUserById(Long id);
}
