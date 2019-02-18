package com.glarimy.cisco.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.glarimy.cisco.api.SysLogCollector;
import com.glarimy.cisco.api.model.DashBoardProperties;
import com.glarimy.cisco.api.model.SysLog;

@RestController
public class SysLogResource {
	@Autowired
	private SysLogCollector sysLogCollector;

	@RequestMapping(value = "/syslog/{id}", method = RequestMethod.GET)
	public ResponseEntity<SysLog> find(@PathVariable("id") int id) {
		SysLog syslog = sysLogCollector.find(id);
		return new ResponseEntity<SysLog>(syslog, HttpStatus.OK);
	}

	@RequestMapping(value = "/syslog", method = RequestMethod.GET)
	public ResponseEntity<SysLog> find(@RequestParam("id") int id,
			@RequestParam("timeStamp") long timeStamp,
			@RequestParam("messageLevel") int messageLevel,
			@RequestParam("ipAddress") int ipAddress,
			@RequestParam("description") int description) {
		SysLog book = null;
		return new ResponseEntity<SysLog>(book, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/syslog/count", method = RequestMethod.GET)
	public ResponseEntity<Long> count(@RequestParam("id") int id,
			@RequestParam("timeStamp") long timeStamp,
			@RequestParam("messageLevel") int messageLevel,
			@RequestParam("ipAddress") int ipAddress,
			@RequestParam("description") int description) {
//		SysLog book = null;
		return new ResponseEntity<Long>(0l, HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value = "/dashboardProperties", method = RequestMethod.POST)
	public ResponseEntity<DashBoardProperties> find(@RequestBody DashBoardProperties dbp, UriComponentsBuilder builder) {
		HttpHeaders headers = new HttpHeaders();
//		headers.setLocation(builder.path("/syslog/{id}").buildAndExpand(book.getIsbn()).toUri());
		return new ResponseEntity<DashBoardProperties>(dbp, headers, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/dashboardProperties", method = RequestMethod.GET)
	public ResponseEntity<DashBoardProperties> find(@RequestParam("name") String name) {
		DashBoardProperties dbp = null;
		return new ResponseEntity<DashBoardProperties>(dbp, HttpStatus.OK);
	}
}
