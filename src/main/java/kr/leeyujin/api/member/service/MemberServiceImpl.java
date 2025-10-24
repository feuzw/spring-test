package kr.leeyujin.api.member.service;

import org.springframework.stereotype.Service;

import kr.leeyujin.api.member.domain.MemberDTO;
import kr.leeyujin.api.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;
    
    @Override
    public void save(MemberDTO memberDTO) {
    }
    @Override
    public void update(MemberDTO memberDTO) {
    }
    @Override
    public void delete(MemberDTO memberDTO) {
    }
    @Override
    public void findeById(MemberDTO memberDTO) {
    }
    @Override
    public void findAll(MemberDTO memberDTO) {
    }

}
