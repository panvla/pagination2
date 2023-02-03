package com.vladimirpandurov.pagination2B.service;

import com.vladimirpandurov.pagination2B.domain.User;
import org.springframework.data.domain.Page;

public interface UserService {
    Page<User> getUsers(String name, int page, int size);
}
