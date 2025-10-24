package kr.leeyujin.api.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.leeyujin.api.common.domain.Messenger;
import kr.leeyujin.api.user.domain.UserDTO;
import kr.leeyujin.api.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Messenger save(List<UserDTO> user) {
        Messenger messenger = userRepository.save(user);
        return messenger;
    }

    @Override
    public Messenger saveAll(List<UserDTO> users) {
        // 레포지토리로 데이터 전달
        Messenger messenger = userRepository.saveAll(users);
        return messenger;
    }

    @Override
    public Messenger update(UserDTO user) {
        Messenger messenger = userRepository.update(user);
        return messenger;
    }

    @Override
    public Messenger delete(String id) {
        Messenger messenger = userRepository.delete(id);
        return messenger;
    }

    @Override
    public Messenger findById(String id) {
        Messenger messenger = userRepository.findById(id);
        return messenger;
    }

    @Override
    public Messenger findAll() {
       Messenger messenger = userRepository.findAll();
       return messenger;
    }

}
