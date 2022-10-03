package com.practice.springpractice.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass //상속받을 경우 필드들을 컬럼으로 인식하게하는것
@EntityListeners(AuditingEntityListener.class)
//Entity의 상위클래스가 되어 entity들의 createDate, modifiedDate를 자동으로 관린하는 역할
public abstract class BaseTimeEntity {
    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;
}
