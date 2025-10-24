package kr.leeyujin.api.member.service;

import kr.leeyujin.api.member.domain.MemberDTO;

public interface MemberService {
    public void save(MemberDTO memberDTO);
    public void update(MemberDTO memberDTO);
    public void delete(MemberDTO memberDTO);
    public void findeById(MemberDTO memberDTO);
    public void findAll(MemberDTO memberDTO);
}
