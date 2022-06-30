package miu.edu.springsecurity.service;

import miu.edu.springsecurity.model.LoginRequest;
import miu.edu.springsecurity.model.LoginResponse;
import miu.edu.springsecurity.model.RefreshTokenRequest;

public interface UaaService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}