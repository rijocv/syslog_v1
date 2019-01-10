package com.glarimy.cisco.api;

import com.glarimy.cisco.api.model.DashBoardProperties;
import com.glarimy.cisco.api.model.SysLog;

public interface SysLogCollector {
	
	public SysLog find(int id);

	public SysLog find(int id,
			long timeStamp,
			String messageLevel,
			String ipAddress,
			String description);
	
	public Long count(int id,
			long timeStamp,
			String messageLevel,
			String ipAddress,
			String description);
	
	
	
	public DashBoardProperties find(DashBoardProperties dbp) ;
	
	public DashBoardProperties find(String name);
	
}