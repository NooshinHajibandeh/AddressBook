package com.snapp.contacts.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

    @Query("SELECT c FROM Contact c WHERE (:name is null or c.name = :name) and (:email is null or c.email = :email) and" +
            "(:phone is null or c.phone = :phone) and (:organization is null or c.organization = :organization)")
    List<Contact> findAllBy(@Param("name") String name, @Param("email") String email,
                            @Param("phone") String phone, @Param("organization") String organization);
}
