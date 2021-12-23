package com.purple.book.springboot.domain.honja;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Dog extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //자동생성 - 전략: db에 위임
    private Long id;

    private String name;
    private String picture;

    @Enumerated(EnumType.STRING)
    private GenderStatus gender; // M(수컷), F(암컷)

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @ManyToOne(fetch = FetchType.LAZY) //지연로딩으로 필요한 시점에만 쿼리가 나감 (프록시 객체로만 갖고있음)
    @JoinColumn(name="user_id")
    private User owner; //주인

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User carer; //임시주인


}
