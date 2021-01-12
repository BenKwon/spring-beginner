package hello.hellospring.domain;

import javax.persistence.*;


//jpa가 관리하는 엔티티가 되는것이다
//@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //DB가 알아서 생성해주는것 IDENTITY
    private Long id;

  //  @Column(name = "username") DB의 컬럼명이 만약 USERNAME이면 NAME 과 USERNAME을 이러한 ANNOTATION으로 매핑
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
