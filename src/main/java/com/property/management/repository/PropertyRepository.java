package com.property.management.repository;

import com.property.management.entity.PropertyEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PropertyRepository extends CrudRepository<PropertyEntity, Long> {
    List<PropertyEntity> findAllByUserEntityId(@Param("userId") Long userId);

}
