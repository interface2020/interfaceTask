package com.common.model;

import java.util.Date;

public interface SaveInfoInterface {
	void setAddUserId(String userId);
	void setAddUser(String userName);
	void setAddDttm(Date date);

	void setLastUpdUserId(String userId);
	void setLastUpdUser(String userName);
	void setLastUpdDttm(Date date);
}
