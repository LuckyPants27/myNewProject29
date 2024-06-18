package pro.sky.mynewproject29.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import pro.sky.mynewproject29.exception.ValidationFailedException;
import pro.sky.mynewproject29.service.ValidationService;

@Service
public class ValidationServiceImpl implements ValidationService {

    public String validateCheckName(String name){
        if(!StringUtils.isAlpha(name)){
            throw new ValidationFailedException();
        }
        return StringUtils.capitalize(name.toLowerCase());
    }
}
