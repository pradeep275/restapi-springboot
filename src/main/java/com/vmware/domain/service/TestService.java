package com.vmware.domain.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.vmware.domain.dto.InputDTO;
import com.vmware.domain.dto.ResultDTO;

@Service
public class TestService {

	private static final Logger LOG = LoggerFactory.getLogger(TestService.class);

	public ResultDTO add(InputDTO inputDTO) {

		int result = Integer.valueOf(inputDTO.getX()) + Integer.valueOf(inputDTO.getY());
		LOG.info("TestService.add(): Addition Result: "+result);
		ResultDTO resultDTO = new ResultDTO();
		resultDTO.setResult(String.valueOf(result));		 
		return resultDTO;
	}

	public ResultDTO diff(InputDTO inputDTO) {

		int result = Integer.valueOf(inputDTO.getX()) - Integer.valueOf(inputDTO.getY());
		LOG.info("TestService.diff(): Difference is: "+result);
		ResultDTO resultDTO = new ResultDTO();
		resultDTO.setResult(String.valueOf(Math.abs(result)));		 
		return resultDTO;

	}
}
