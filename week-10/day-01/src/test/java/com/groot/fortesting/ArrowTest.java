package com.groot.fortesting;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
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
public class ArrowTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void respondSpeedOfArrow_testCase_expectedResponseStatus_Ok() throws Exception{
    mockMvc.perform(get("/yondu")
    .param("distance", "100.0")
    .param("time", "10.0"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.speed", is(10.0)));
  }

  @Test
  public void respondSpeedOfArrow_testCase_expectedResponseStatus_isNotOk() throws Exception{
    mockMvc.perform(get("/yondu"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error",
            is("Missing something, pal?")));
  }
}
//Write a test where you check:
//With giving a parameter the status is ok,
//and the given response is the same as expected
//That without giving a parameter the status is not ok,
//and the given error response is the same as expected
