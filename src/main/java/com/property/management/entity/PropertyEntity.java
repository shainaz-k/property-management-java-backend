package com.property.management.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "PROPERTY_TABLE")
@Getter
@Setter
@NoArgsConstructor
public class PropertyEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "PROPERTY_TITLE", nullable = false)
    private String propertyTitle;
    private String description;
    private String price;
    private String address;

    @ManyToOne (fetch = FetchType.LAZY) //it will fetch the data in a lazy way
    @JoinColumn(name = "USER_ID", nullable = false)
    private UserEntity userEntity;

}
