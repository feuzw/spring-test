package kr.leeyujin.api.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.leeyujin.api.common.domain.Messenger;
import kr.leeyujin.api.user.domain.UserDTO;
import kr.leeyujin.api.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public Messenger registerUsers(List<UserDTO> users) {

        // 레포지토리로 데이터 전달
        Messenger messenger = userRepository.saveUsers(users);

        return messenger;
    }

}
