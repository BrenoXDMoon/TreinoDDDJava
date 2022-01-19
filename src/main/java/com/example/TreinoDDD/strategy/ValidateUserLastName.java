package com.example.TreinoDDD.strategy;

import com.example.TreinoDDD.entity.DomainEntity;
import com.example.TreinoDDD.entity.User;
import org.springframework.stereotype.Component;

@Component
public class ValidateUserLastName implements IStrategy{
    @Override
    public Object process(DomainEntity entity) {
        User user = (User) entity;

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

        return user;
    }
}
