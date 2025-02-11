package com.property.management.converter;

import com.property.management.dto.UserDTO;
import com.property.management.entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    public UserEntity convertDTOtoEntity(UserDTO userDTO) {
        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName(userDTO.getFirstName());
        userEntity.setFirstName(userDTO.getLastName());
        userEntity.setOwnerEmail(userDTO.getEmail());
        userEntity.setPassword(userDTO.getPassword());
        userEntity.setMobileNumber(userDTO.getMobileNumber());
        return userEntity;
    }

    public UserDTO convertEntityToDTO(UserEntity userEntity) {
        UserDTO userDTO = new UserDTO();
        userDTO.setFirstName(userEntity.getFirstName());
        userDTO.setLastName(userEntity.getLastName());
        userDTO.setEmail(userEntity.getOwnerEmail());
        userDTO.setPassword(userEntity.getPassword());
        userDTO.setMobileNumber(userEntity.getMobileNumber());
        return userDTO;
    }
}
