package com.example.TreinoDDD.strategy;

import com.example.TreinoDDD.dto.DTOEntity;
import com.example.TreinoDDD.entity.User;

public class ValidateLastName implements IStrategy{
    @Override
    public Object process(DTOEntity entity) {

        User user = (User) entity.convertToEntity();

        if(user.getFirstName().contains(" ")){
            String[] arrayName = user.getFirstName().split(" ");
            StringBuilder sb = new StringBuilder();
            for(int i = 1; i < arrayName.length; i++){
                if(i==1){
                    sb.append(arrayName[i]);
                }
                sb.append(" " + arrayName[i]);
            }
            user.setLastName(sb.toString());
        }

        return user.convertToDto();
    }
}
