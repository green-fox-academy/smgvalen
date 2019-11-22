package com.smgvalen.alias.models;

import java.util.Random;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Link {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String url;
  private String alias;
  private Integer secretCode;
  private int hitcount;

 /* konstruktorok nélkül is köszöni szépen, jól van .......
 public Link(String url, String alias) {
 //   Random random = new Random();
    this.url = url;
    this.alias = alias;
    this.hitcount = 0;
  }

  public Link() {
  }
 */

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public int getHitcount() {
    return hitcount;
  }

  public void setHitcount(int hitcount) {
    this.hitcount = hitcount;
  }

  public Integer getSecretCode() {
    return secretCode;
  }

  public void setSecretCode(Integer secretCode) {
    this.secretCode = secretCode;
  }

  // mentésnél szükség van egy secretCodera, és azt generáló methodra
  // service-ben save methodusnál mentés előtt repoba generál egy számot a linknek
  public void generateSecretCode() {
   Random random= new Random();
    this.secretCode = random.nextInt(10000);
  }
}
