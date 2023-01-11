package com.example.jpa.bookmanager.domain;

import com.example.jpa.bookmanager.domain.listener.Auditable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper = true)
//@EntityListeners(value = MyEntityListener.class)
public class UserHistory extends BaseEntity implements Auditable {
    @Id
    @GeneratedValue
    private Long id;

    private Long personId;

    private String name;

    // @CreatedBy 누가 작성했는지
    private String email;

//    @CreatedDate
//    private LocalDateTime createdAt;
//
//    @LastModifiedDate
//    private LocalDateTime updatedAt;
}
