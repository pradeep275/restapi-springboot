package com.vmware.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vmware.domain.dto.InputDTO;
import com.vmware.domain.dto.ResultDTO;
import com.vmware.domain.service.TestService;


@RestController
public class TestController {
	
	private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

	@Autowired
	TestService testService;

	
	
	@RequestMapping(value = "/api/add", method = RequestMethod.POST)
	public ResponseEntity<ResultDTO> add(@RequestBody InputDTO inputDTO) throws Exception {

		LOG.info("TestController.add(): request received");
		ResultDTO result = testService.add(inputDTO);
		return new ResponseEntity<ResultDTO>(result, new HttpHeaders(), HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value = "/api/diff", method = RequestMethod.POST)
	public ResponseEntity<ResultDTO> diff(@RequestBody InputDTO inputDTO) throws Exception {

		LOG.info("TestController.add(): request received");
		ResultDTO result = testService.diff(inputDTO);
		return new ResponseEntity<ResultDTO>(result, new HttpHeaders(), HttpStatus.OK);
	}


}
