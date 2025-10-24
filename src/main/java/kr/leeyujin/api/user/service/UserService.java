package kr.leeyujin.api.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.leeyujin.api.common.domain.Messenger;
import kr.leeyujin.api.user.domain.UserDTO;
import kr.leeyujin.api.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;


public interface UserService {
    Messenger save(List<UserDTO> user);
    Messenger saveAll(List<UserDTO> users);
    Messenger update(UserDTO user);
    Messenger delete(String id);
    Messenger findById(String id);
    Messenger findAll();

}
