package com.property.management.converter;

import com.property.management.dto.PropertyDTO;
import com.property.management.entity.PropertyEntity;
import org.springframework.stereotype.Component;

@Component
public class PropertyConverter {
    public PropertyDTO convertEntityToDTO(PropertyEntity propertyEntity) {
        PropertyDTO propertyDTO = new PropertyDTO();
        propertyDTO.setId(propertyEntity.getId());
        propertyDTO.setTitle(propertyEntity.getPropertyTitle());
        propertyDTO.setDescription(propertyEntity.getDescription());
        propertyDTO.setPrice(propertyEntity.getPrice());
        propertyDTO.setAddress(propertyEntity.getAddress());
        propertyDTO.setUserId(propertyEntity.getUserEntity().getId());

        return propertyDTO;
    }

    public static PropertyEntity convertDTOToEntity(PropertyDTO propertyDTO) {
        PropertyEntity propertyEntity = new PropertyEntity();
        propertyEntity.setPropertyTitle(propertyDTO.getTitle());
        propertyEntity.setDescription(propertyDTO.getDescription());
        propertyEntity.setPrice(propertyDTO.getPrice());
        propertyEntity.setAddress(propertyDTO.getAddress());
        propertyEntity.setUserEntity(propertyEntity.getUserEntity());

        return propertyEntity;
    }

}
