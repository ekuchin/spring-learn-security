package ru.projectosnova.springlearnsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.projectosnova.springlearnsecurity.entity.UserAccount;
import ru.projectosnova.springlearnsecurity.model.JwtRequest;

public interface UserAccountRepository extends JpaRepository<UserAccount, String> {
}
