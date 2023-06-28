package hello.servlet.domain.member;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Member {

    private Long id;
    private String username;
    private int age;

    public Member() {
    }

    //생성자 등등 만드는거 cmd + n
    public Member(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
