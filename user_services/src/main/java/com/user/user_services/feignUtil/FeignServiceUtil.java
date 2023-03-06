//package com.user.user_services.feignUtil;
//
//import java.util.List;
//
//import org.springframework.cloud.netflix.feign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import com.user.user_services.entity.Contact;
//
//@FeignClient(value = "feignDemo" , url = "http://localhost:9091/contact")
//public interface FeignServiceUtil {
//
//	@GetMapping("/getContactsByUserId/{id}")
//	List<Contact> getContactsByUserId(@PathVariable("id") Long id);
//}
