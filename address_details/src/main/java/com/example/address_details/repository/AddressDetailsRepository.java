package com.example.address_details.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.address_details.entity.AddressDetailsEntity;

@Repository
public interface AddressDetailsRepository extends JpaRepository<AddressDetailsEntity, Long>{

	Optional<AddressDetailsEntity> findByPartnerKey(String partnerKey);
	Long deleteByPartnerKey(String partnerKey);
}
