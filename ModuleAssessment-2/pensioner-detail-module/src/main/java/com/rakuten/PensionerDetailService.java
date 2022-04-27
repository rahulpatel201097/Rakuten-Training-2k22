package com.rakuten;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class PensionerDetailService {
	
	List<PensionerDetail> details = new ArrayList<>();
	PensionerDetailService() {
	
		details.add(new PensionerDetail("Ram", "7690999", "47583782", 80000, 5000, "self", "public"));
		details.add(new PensionerDetail("Raj", "9573624", "2647382", 30000, 2000, "self", "private"));
		details.add(new PensionerDetail("Krishna", "747264", "45672839", 70000, 6000, "family", "public"));
		details.add(new PensionerDetail("Nandan", "8755642", "87649567", 60000, 3500, "family", "private"));
		
	}
	
	
	PensionerDetail getPensionerDetails(String aadharNumber) {
		List<PensionerDetail> detail = details.stream().filter(pensionDetail -> pensionDetail.getAadharNumber().equals(aadharNumber)).collect(Collectors.toList());
		if(detail.size() == 0) {
			return new PensionerDetail(false);
		}
		System.out.println(detail.get(0));
		return detail.get(0);
	}
}
