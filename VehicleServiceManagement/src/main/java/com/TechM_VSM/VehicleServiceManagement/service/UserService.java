package com.TechM_VSM.VehicleServiceManagement.service;

import com.TechM_VSM.VehicleServiceManagement.dto.SignupRequest;
import com.TechM_VSM.VehicleServiceManagement.dto.UserDto;
import com.TechM_VSM.VehicleServiceManagement.model.User;

public interface UserService {
    public UserDto saveUser(SignupRequest signupRequest);

    public boolean hasUserwithEmail(String email);
}
