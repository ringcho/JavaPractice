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
//@EntityListeners(value = AuditingEntityListener.class)
public class Book extends BaseEntity implements Auditable {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String author;

//    @Column(updatable = false)
//    @CreatedDate
//    private LocalDateTime createdAt;
//
//    @Column(insertable = false)
//    @LastModifiedDate
//    private LocalDateTime updatedAt;

//    @PrePersist
//    public void prePersist(){
//        this.createdAt = LocalDateTime.now();
//        this.updatedAt = LocalDateTime.now();
//    }
//
//    @PreUpdate
//    public void preUpdate(){
//        this.updatedAt = LocalDateTime.now();
//    }
}
