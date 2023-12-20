package com.example.address_details.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.address_details.api.AddressDetailsApi;
import com.example.address_details.entity.AddressDetailsEntity;
import com.example.address_details.exception.AddressDetailsNotFoundException;
import com.example.address_details.model.AddressDetails;
import com.example.address_details.service.AddressDetailsService;

@RestController
public class AddressDetailsController implements AddressDetailsApi {

	@Autowired
	private AddressDetailsService addressDetailsService;
	
	
	@Override
	public ResponseEntity<AddressDetails> addAddressDetails(AddressDetails body) {
		AddressDetailsEntity addressDetails = new AddressDetailsEntity();
		BeanUtils.copyProperties(body,addressDetails);
		addressDetails =  addressDetailsService.createAddressDetailsEntity(addressDetails);
		AddressDetails addressDetailsDTO = new AddressDetails();
		BeanUtils.copyProperties(addressDetails, addressDetailsDTO);
		return new ResponseEntity<AddressDetails>(addressDetailsDTO,HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<Void> deleteAddressDetails(String partnerKey) {
		try{
			addressDetailsService.deleteAddressDetailsEntity(partnerKey);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}catch (AddressDetailsNotFoundException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@Override
	public ResponseEntity<AddressDetails> getAddressDetailsById(String partnerKey) {
		 try {
				AddressDetailsEntity addressDetails= addressDetailsService.getAddressDetailsEntity(partnerKey);
				AddressDetails addressDetailsDTO = new AddressDetails();
				BeanUtils.copyProperties(addressDetails, addressDetailsDTO);
				return new ResponseEntity<AddressDetails>(addressDetailsDTO,HttpStatus.OK);
			} catch (AddressDetailsNotFoundException e) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
			}
	}

	@Override
	public ResponseEntity<AddressDetails> updateAddressDetails(String partnerKey, AddressDetails body) {
		try {
			AddressDetailsEntity addressDetails = new AddressDetailsEntity();
			BeanUtils.copyProperties(body,addressDetails);
			addressDetails = addressDetailsService.updateAddressDetailsEntity(addressDetails, partnerKey);
			AddressDetails addressDetailsDTO = new AddressDetails();
			BeanUtils.copyProperties(addressDetails,addressDetailsDTO);
			return new ResponseEntity<AddressDetails>(addressDetailsDTO,HttpStatus.OK);
		} catch (AddressDetailsNotFoundException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	
}
