package com.afpa.springTest;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.afpa.springTest.beans.Ville;
import com.afpa.springTest.servicesImpl.PersonneService;
import com.afpa.springTest.servicesImpl.VilleService;
import com.afpa.springTest.servicesImpl.VoitureService;
import com.google.common.net.HttpHeaders;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
@Transactional
public class SpringTestApplicationTests {


	@Autowired
	VilleService villeService;

	@Autowired
	VoitureService voitureServ;

	@Autowired
	PersonneService personneServ;

	@Autowired
	MockMvc mockMvc;

	@Test
	public void contextLoads() {
	}

	@Test
	public void getAllVilles() throws Exception {
		ArrayList<Ville> villes = (ArrayList<Ville>) villeService.allVille();
		
		
		mockMvc.perform(get("http://localhost:8080/api/allVille")
				.content("{json}")
				.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)).andExpect(status().isOk());
		
		assertEquals(2, villes.size());
	}



}