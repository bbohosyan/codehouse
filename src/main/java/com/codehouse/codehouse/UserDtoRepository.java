package com.codehouse.codehouse;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDtoRepository extends JpaRepository<UserDto, Integer> {
}
