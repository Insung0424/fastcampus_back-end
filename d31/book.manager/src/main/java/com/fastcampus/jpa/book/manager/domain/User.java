package com.fastcampus.jpa.book.manager.domain;

import lombok.*;

import java.time.LocalDateTime;

//@Getter //lombok 을 이용할때
//@Setter //lombok 을 이용할때
//@ToString //toString도 lombok 과 리팩터로 만들수 있음
@NoArgsConstructor//인자가 없는 기본 생성자
@AllArgsConstructor// 모든 인자를 받는 생성자
@RequiredArgsConstructor//꼭 필요한 인자만 받아서 생성하는 생성자
//@EqualsAndHashCode //동등성 비교를 위해 필요 디롬복에 있음

@Data // 엔티티 객체를 사용할때 가장 많이 사용하게 되는 것
//@Getter,@Setter,@ToString,@RequiredArgsConstructor,@EqualsAndHashCode 와 동일한 효과를 제공함
//oop 객체지향의 법칙을 위반하는 기능이다

@Builder //@AllArgsConstructor와 비슷함
public class User {//클래스위에 선언해야 해당 클래스안 변수 모두 적용됨
    // 오른쪽 클릭 - 리펙터 - 롬복,디롬복이 있음

    @NonNull //lombok 에서 제공해주는 것,생성자에 반드시 들어가야하는 변수라는 표시
    private String name;
    @NonNull //lombok 에서 제공해주는 것,생성자에 반드시 들어가야하는 변수라는 표시
    private String email;

    private LocalDateTime createdAt; //생성된 시간

    private LocalDateTime updatedAt; //수정된 시간

//    //디롬복을 사용한 생성자 만들기(@All)
//    public User(@NonNull String name, @NonNull String email, LocalDateTime createdAt, LocalDateTime updatedAt) {
//        this.name = name;
//        this.email = email;
//        this.createdAt = createdAt;
//        this.updatedAt = updatedAt;
//    }
//    //디롬복을 사용한 생성자 만들기(@No)
//    public User() {
//    }
//    //디롬복을 사용한 생성자 만들기(@Required)
//    public User(@NonNull String name, @NonNull String email) {
//        this.name = name;
//        this.email = email;
//    }


//lombok 을 이용할때 직접작성되어있지 않아도 됨
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public LocalDateTime getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(LocalDateTime createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public LocalDateTime getUpdatedAt() {
//        return updatedAt;
//    }
//
//    public void setUpdatedAt(LocalDateTime updatedAt) {
//        this.updatedAt = updatedAt;
//    }


}
