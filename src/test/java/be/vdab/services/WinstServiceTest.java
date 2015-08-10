package be.vdab.services;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import be.vdab.dao.KostDAO;
import be.vdab.dao.OpbrengstDAO;

public class WinstServiceTest {
	private WinstService winstService;
	private OpbrengstDAO opbrengstDAO;
	private KostDAO kostDAO;
	
	@Before
	public void before() {
		opbrengstDAO = mock(OpbrengstDAO.class);
		when(opbrengstDAO.findTotaleOpbrengst()).thenReturn(BigDecimal.valueOf(200));
		kostDAO = mock(KostDAO.class);
		when(kostDAO.findTotaleKost()).thenReturn(BigDecimal.valueOf(169));
		winstService = new WinstService(opbrengstDAO, kostDAO);
	}
	
	@Test
	public void winstIsOpbrengstMinKost() {
		assertEquals(0, BigDecimal.valueOf(31).compareTo(winstService.getWinst()));
		verify(opbrengstDAO).findTotaleOpbrengst();
		verify(kostDAO).findTotaleKost();
	}

}
