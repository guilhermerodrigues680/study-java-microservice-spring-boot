package com.example.demo.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.jacksonxml.SimpleBean;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class RequestResource {
	
	private static final Logger logger = LoggerFactory.getLogger(RequestResource.class);
	private RestTemplate restTemplate = new RestTemplate();
	
	@GetMapping("/sendrequest")
	public String sendrequest() {
		
		logger.info("/sendrequest solicitado");
		
		//String url = "https://jsonplaceholder.typicode.com/posts";
		String url = "https://testapi.maxipago.net/ReportsAPI/servlet/ReportsAPI";
		String res = restTemplate.getForObject(url, String.class);
		
		return res;
	}
	
	@GetMapping("/sendrequest2")
	public String sendrequest2() throws JsonProcessingException {
		
		logger.info("/sendrequest2 solicitado");
		
		SimpleBean simpleBean = new SimpleBean();
		
		String body = simpleBean.whenJavaSerializedToXmlStr_thenCorrect();
		
		HttpHeaders headers = new HttpHeaders();
		//headers.add(headerName, headerValue);
		headers.setContentType(MediaType.APPLICATION_XML);
		
		//String body = "<transaction-request>\n    <version>3.1.1.15</version>\n    <verification>\n        <merchantId>100</merchantId>\n        <merchantKey>secret-key</merchantKey>\n    </verification>\n    <order>\n        <auth>\n            <processorID>1</processorID>\n            <fraudCheck>N</fraudCheck>\n            <referenceNum>123456789</referenceNum>\n            <transactionDetail>\n                <payType>\n                    <creditCard>\n                        <number>4111111111111111</number>\n                        <expMonth>12</expMonth>\n                        <expYear>2020</expYear>\n                        <cvvNumber>999</cvvNumber>\n                    </creditCard>\n                </payType>\n            </transactionDetail>\n            <payment>\n                <currencyCode>BRL</currencyCode>\n                <chargeTotal>10.00</chargeTotal>\n                <iataFee>1.00</iataFee>\n                <creditInstallment>\n                    <numberOfInstallments>2</numberOfInstallments>\n                    <chargeInterest>N</chargeInterest>\n                </creditInstallment>\n            </payment>\n        </auth>\n    </order>\n</transaction-request>";
		String url = "https://postman-echo.com/post";
		
		HttpEntity<String> request = new HttpEntity<>(body, headers);
		ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);
		
		return response.getBody();
	}
}
