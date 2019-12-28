package net.rebeche.mithrarugby.mmatch.dao.impl;

import java.sql.Date;
import java.util.List;

public interface MatchDaoCustom {

	List<Date>  findDistinctDate();
}
