package be.vdab.dao;

import java.math.BigDecimal;

public class KostDAOStub implements KostDAO{
	
	@Override
	public BigDecimal findTotaleKost() {
		return BigDecimal.valueOf(169);
	}

}
