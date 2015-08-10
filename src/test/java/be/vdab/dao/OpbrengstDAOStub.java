package be.vdab.dao;

import java.math.BigDecimal;

public class OpbrengstDAOStub implements OpbrengstDAO {

	@Override
	public BigDecimal findTotaleOpbrengst() {
		return BigDecimal.valueOf(200);
	}

}
