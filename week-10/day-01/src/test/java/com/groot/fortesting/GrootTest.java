package com.groot.fortesting;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.groot.fortesting.controllers.RestGuardianController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(RestGuardianController.class)
public class GrootTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void translateGroot_testCase_expected_statusOk() throws Exception{
    mockMvc.perform(get("/groot")
    .param("message", "somemessage"))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.translated", is("I am Groot!")));
  }

  @Test
  public void translateGroot_testCase_missing_parameter() throws Exception{
    mockMvc.perform(get("/groot"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error",
            is("I am Groot!")));
  }
}
