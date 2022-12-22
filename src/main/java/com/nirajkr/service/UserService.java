package com.nirajkr.service;

import java.util.Map;

import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;

import com.nirajkr.dto.LocalUser;
import com.nirajkr.dto.UserRegistrationForm;
import com.nirajkr.exception.UserAlreadyExistAuthenticationException;
import com.nirajkr.model.User;

/**
 * @author Nirajkr
 * 
 */
public interface UserService {

	public User registerNewUser(UserRegistrationForm UserRegistrationForm) throws UserAlreadyExistAuthenticationException;

	User findUserByEmail(String email);

	LocalUser processUserRegistration(String registrationId, Map<String, Object> attributes, OidcIdToken idToken, OidcUserInfo userInfo);
}
