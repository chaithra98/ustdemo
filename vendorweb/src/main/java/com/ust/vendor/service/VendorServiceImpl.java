package com.ust.vendor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.vendor.entities.Vendor;
import com.ust.vendor.repos.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorRepository respository;
	
	@Override
	public Vendor saveVendor(Vendor vendor) {
		return respository.save(vendor);
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		return respository.save(vendor);
	}

	@Override
	public void deleteVendor(Vendor vendor) {
		respository.delete(vendor);
	}

	@Override
	public Vendor getVendorById(int id) {
		return respository.findById(id).get();
	}

	@Override
	public List<Vendor> getAllVendors() {
		return (List<Vendor>) respository.findAll();
	}
	
	public VendorRepository getRespository() {
		return respository;
	}

	
}
