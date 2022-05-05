package com.rakuten;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakuten.user.ContactMessage;

public interface ContactRepository extends JpaRepository<ContactMessage, Integer> {

}
