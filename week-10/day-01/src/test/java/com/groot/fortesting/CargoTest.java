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
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@RunWith(SpringRunner.class)
@WebMvcTest(RestGuardianController.class)
public class CargoTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void showTheAmmo_testCase_expectedResponse_isOk() throws Exception {
    mockMvc.perform(get("/rocket"))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.caliber25", is(0)))
        .andExpect(jsonPath("$.caliber30", is(0)))
        .andExpect(jsonPath("$.caliber50", is(0)))
        .andExpect(jsonPath("$.shipstatus", is("empty")))
        .andExpect(jsonPath("$.ready", is(false)));
  }

  @Test
  public void fillTheShip_testCase_missingParameters_resultBadRequest() throws Exception {
    mockMvc.perform(get("/rocket/fill"))
        .andDo(print())
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error",
            is("You are an asshole, Quill!")));
  }

  @Test
  public void fillTheShip_testCase_missingOnlyOneParameter_resultBadRequest() throws Exception {
    mockMvc.perform(get("/rocket/fill")
        .param("caliber", ".25"))
        .andDo(print())
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error",
            is("You are an asshole, Quill!")));
  }

  @Test
  public void fillTheShip_testCase_expectedHttpStatus_isOk_filledWithParams_returnJsonObjectValuesCorrectly()
      throws Exception {
    mockMvc.perform(get("/rocket/fill")
        .param("caliber", ".30")
        .param("amount", "2000"))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.recieved", is(".30")))
        .andExpect(jsonPath("$.amount", is(2000)))
        .andExpect(jsonPath("$.shipstatus", is("16%")))
        .andExpect(jsonPath("$.ready", is(false)));
  }

  @Test
  public void fillTheShip_testCase_expectedHttpStatus_isOk_filledWithParams_saveAmmo()
      throws Exception {
    mockMvc.perform(get("/rocket/fill")
        .param("caliber", ".50")
        .param("amount", "10000"));
    mockMvc.perform(get("/rocket"))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.caliber25", is(0)))
        .andExpect(jsonPath("$.caliber30", is(0)))
        .andExpect(jsonPath("$.caliber50", is(10000)))
        .andExpect(jsonPath("$.shipstatus", is("80%")))
        .andExpect(jsonPath("$.ready", is(false)));
  }

  @Test
  public void fillTheShip_testCase_expectedHttpStatus_isOk_filledWithParams_cargoFull()
      throws Exception {
    mockMvc.perform(get("/rocket/fill")
        .param("caliber", ".50")
        .param("amount", "12500"));
    mockMvc.perform(get("/rocket"))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.caliber25", is(0)))
        .andExpect(jsonPath("$.caliber30", is(0)))
        .andExpect(jsonPath("$.caliber50", is(12500)))
        .andExpect(jsonPath("$.shipstatus", is("full")))
        .andExpect(jsonPath("$.ready", is(true)));
  }
}
