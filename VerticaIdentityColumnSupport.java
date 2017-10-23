package org.hibernate.dialect;

import org.hibernate.MappingException;
import org.hibernate.dialect.identity.IdentityColumnSupportImpl;

public class VerticaIdentityColumnSupport extends IdentityColumnSupportImpl {

	@Override
	public boolean supportsIdentityColumns() {
		return true;
	}

	@Override
	public String getIdentitySelectString(String table, String column, int type) throws MappingException {
		return "select last_insert_id()";
	}
	
	@Override
	public String getIdentityColumnString(int type) {
		return "not null auto_increment";
	}
}
