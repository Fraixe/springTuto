package com.afpa.springTest;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import com.afpa.springTest.beans.Ville;
import com.afpa.springTest.services.ServiceVilleInterface;
import com.afpa.springTest.servicesImpl.PersonneService;
import com.afpa.springTest.servicesImpl.VoitureService;
import com.google.common.net.HttpHeaders;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@Transactional
public class Testlulu {

	@Autowired
	ServiceVilleInterface villeService;

	@Autowired
	VoitureService voitureServ;

	@Autowired
	PersonneService personneServ;

	@Autowired
	MockMvc mockMvc;

	@Test
	public void getAllVilles() throws Exception {
		System.out.println(villeService.allVille());
		
		ArrayList<Ville> villes = (ArrayList<Ville>) villeService.allVille();
		System.out.println(villes);
		
		
		mockMvc.perform(get("http://localhost:8080/api/allVille")
				.content("{json}")
				.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)).andExpect(status().isOk());
		
		assertEquals(2, villes.size());
	}
}
