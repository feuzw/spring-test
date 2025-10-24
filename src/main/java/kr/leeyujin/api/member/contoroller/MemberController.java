package kr.leeyujin.api.member.contoroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.leeyujin.api.member.domain.MemberDTO;
import kr.leeyujin.api.member.service.MemberService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/members") // members 테이블 주소
public class MemberController {

    private final MemberService memberService;

    @PostMapping("")
    public void save(@RequestBody MemberDTO memberDTO) {
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @PutMapping("/{id}")
    public void update(@RequestBody MemberDTO memberDTO) {
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
    }

    @GetMapping("/id/{id}")
    public void findeById(@PathVariable String id) {
    }

    @GetMapping("/all")
    public void findAll() {
    }
}
