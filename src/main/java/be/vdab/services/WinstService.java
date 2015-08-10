package be.vdab.services;

import java.math.BigDecimal;

import be.vdab.dao.KostDAO;
import be.vdab.dao.OpbrengstDAO;

public class WinstService {
	private final OpbrengstDAO opbrengstDAO;
	private final KostDAO kostDAO;
	public WinstService(OpbrengstDAO opbrengstDAO, KostDAO kostDAO) {
		this.opbrengstDAO = opbrengstDAO;
		this.kostDAO = kostDAO;
	}
	
	public BigDecimal getWinst() {
		return opbrengstDAO.findTotaleOpbrengst().subtract(kostDAO.findTotaleKost());
	}

}
