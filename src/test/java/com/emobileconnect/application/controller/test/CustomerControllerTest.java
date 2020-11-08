package com.emobileconnect.application.controller.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.emobileconnect.application.controller.CustomerController;

@RunWith(SpringRunner.class)
//@SpringBootTest(classes = CustomerController.class)
@WebMvcTest
public class CustomerControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private CustomerController customerController;
	
	@Test
	public void getAllCustomersTest() throws Exception {
		this.mvc.perform(get("/customers")).andDo(print()).andExpect(status().isOk());
		
	}

}
