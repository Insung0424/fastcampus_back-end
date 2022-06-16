package com.fastcampus.jpa.bookmanager.domain;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;


@Data
@Builder
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue //순차적으로 데이터값이 증가
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String email;


    private LocalDateTime createdAt;


    private LocalDateTime updatedAt;
}
