package com.example.UberReviewServiceApplication.models;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.event.EventListener;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.xml.crypto.Data;
import java.util.Date;




@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="bookingreview")
public class Review {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;//this annotation makes id property a primary key of a table

    @Column(nullable = false)
    private String content;

    private  Double rating;


    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;


    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;




}
