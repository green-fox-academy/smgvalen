package com.smgvalen.reddit.services;

import com.smgvalen.reddit.models.User;
import com.smgvalen.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements InterUserService {

  @Autowired
  private UserRepository userRepository;

  public UserServiceImp(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public UserServiceImp() {
  }

  @Override
  public void save(User user) {
    userRepository.save(user);
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
