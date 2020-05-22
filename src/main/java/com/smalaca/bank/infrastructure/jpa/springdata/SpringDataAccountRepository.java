package com.smalaca.bank.infrastructure.jpa.springdata;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataAccountRepository extends CrudRepository<SpringDataAccount, Long> {
}
