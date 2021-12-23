package com.purple.book.springboot.domain.honja;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String loginId; // 로그인 ID

    @Column(nullable = false)
    private String password;

    private String phone;
    private String age;

//    @Embedded
//    private Address address; // 카카오 주소 API 맞춰서

}
