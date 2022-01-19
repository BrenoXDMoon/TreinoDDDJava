package com.example.TreinoDDD.facade;

import com.example.TreinoDDD.facade.dto.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IUserFacade {

    UserDTO save(UserDTO user);

    UserDTO edit(Long id, UserDTO user);

    UserDTO findUserById(Long id);

    Page<UserDTO> getAllUsers(Pageable pageable);

    UserDTO delete(Long id);
}
