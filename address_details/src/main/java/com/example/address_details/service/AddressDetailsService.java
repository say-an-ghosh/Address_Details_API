package com.example.address_details.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.address_details.entity.AddressDetailsEntity;
import com.example.address_details.exception.AddressDetailsNotFoundException;

import jakarta.transaction.Transactional;

@Service
public class AddressDetailsService {


	@Autowired com.example.address_details.repository.AddressDetailsRepository
	AddressDetailsRepository;
	
	public List<AddressDetailsEntity> getAllAddressDetailsEntitys() {
		return AddressDetailsRepository.findAll();
	}
	
	public AddressDetailsEntity createAddressDetailsEntity(AddressDetailsEntity AddressDetailsEntity) {
		return AddressDetailsRepository.save(AddressDetailsEntity);
	}
	
	public AddressDetailsEntity getAddressDetailsEntity(String partnerKey) throws AddressDetailsNotFoundException {
		Optional<AddressDetailsEntity> optionalAddressDetailsEntity = AddressDetailsRepository.findByPartnerKey(partnerKey);
		return optionalAddressDetailsEntity.orElseThrow(() ->  new AddressDetailsNotFoundException("AddressDetails not found with the partnerKey..."));
	}
	
	public AddressDetailsEntity updateAddressDetailsEntity(AddressDetailsEntity AddressDetailsEntity, String partnerKey) throws AddressDetailsNotFoundException {
		Optional<AddressDetailsEntity> optionalAddressDetailsEntity = AddressDetailsRepository.findByPartnerKey(partnerKey);
		if(!optionalAddressDetailsEntity.isEmpty()) {
			AddressDetailsEntity existingEntity = optionalAddressDetailsEntity.get();
			existingEntity.setPartnerKey(AddressDetailsEntity.getPartnerKey());
			existingEntity.setHouseNumber(AddressDetailsEntity.getHouseNumber());
			existingEntity.setStreet(AddressDetailsEntity.getStreet());
			existingEntity.setPostalCode(AddressDetailsEntity.getPostalCode());
			existingEntity.setTown(AddressDetailsEntity.getTown());
			return AddressDetailsRepository.save(existingEntity);
		}else {
			throw new AddressDetailsNotFoundException("AddressDetailsEntity not found with the id...");
		}
	}
	@Transactional
	public void deleteAddressDetailsEntity(String partnerKey) throws AddressDetailsNotFoundException{
		Optional<AddressDetailsEntity> optionalAddressDetailsEntity = AddressDetailsRepository.findByPartnerKey(partnerKey);
		if(!optionalAddressDetailsEntity.isEmpty()) {
			AddressDetailsRepository.deleteByPartnerKey(partnerKey);
		}else {
			throw new AddressDetailsNotFoundException("AddressDetailsEntity not found with the id, please provide correct id...");
		}	
	}
	
}
