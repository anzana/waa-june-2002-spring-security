package miu.edu.springsecurity.exception.exp;

import lombok.Getter;

@Getter
public class VulnerableRequestException extends RuntimeException {

    public VulnerableRequestException(String message){
        super(message);
    }
}
