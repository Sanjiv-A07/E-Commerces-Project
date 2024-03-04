package org.jsp.ecommerceapp.dao;

import org.jsp.ecommerceapp.Repository.MerchantRepository;
import org.jsp.ecommerceapp.model.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MerchantDao {
	@Autowired
	private MerchantRepository merchantrepo;
	
	public Merchant saveMerchant(Merchant merchant) {
		return merchantrepo.save(merchant);
	}
	
	

}
