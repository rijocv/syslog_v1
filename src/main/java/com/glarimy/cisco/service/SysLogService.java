package com.glarimy.cisco.service;

import org.springframework.stereotype.Service;

import com.glarimy.cisco.api.SysLogCollector;
import com.glarimy.cisco.api.exception.InvalidSysLogException;
import com.glarimy.cisco.api.exception.SysLogException;
import com.glarimy.cisco.api.exception.SysLogNotFoundException;
import com.glarimy.cisco.api.model.DashBoardProperties;
import com.glarimy.cisco.api.model.SysLog;

@Service
public class SysLogService implements SysLogCollector {
//	@Autowired
//	private SysLogRepository repo;

	public SysLog find(int id) throws InvalidSysLogException, SysLogNotFoundException, SysLogException {
		return null;
	}

	public SysLog find(int id, long timeStamp, String messageLevel, String ipAddress, String description)
			throws InvalidSysLogException, SysLogNotFoundException, SysLogException {
		return null;
	}

	public Long count(int id, long timeStamp, String messageLevel, String ipAddress, String description)
			throws InvalidSysLogException, SysLogNotFoundException, SysLogException {
//		SysLog book = null;
		return 0l;
	}

	public DashBoardProperties find(DashBoardProperties dbp)
			throws InvalidSysLogException, SysLogNotFoundException, SysLogException {
		return null;
	}

	public DashBoardProperties find(String name)
			throws InvalidSysLogException, SysLogNotFoundException, SysLogException {
		return null;
	}

}
