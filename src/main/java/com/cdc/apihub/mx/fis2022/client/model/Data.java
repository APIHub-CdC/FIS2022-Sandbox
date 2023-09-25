package com.cdc.apihub.mx.fis2022.client.model;

import java.util.Objects;

import com.cdc.apihub.mx.fis2022.client.model.ScoreNoHit;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;


public class Data {
  @SerializedName("scoreNoHit")
  private ScoreNoHit score = null;

  @SerializedName("folioOtorgante")
  private String folioOtorgante = null;

  @SerializedName("folioConsulta")
  private String folioConsulta = null;

  public Data score(ScoreNoHit score) {
    this.score = score;
    this.folioOtorgante = folioOtorgante;
    this.folioConsulta = folioConsulta;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ScoreNoHit getScoreNoHit() {
    return score;
  }
  public void setScoreNoHit(ScoreNoHit score) {
    this.score = score;
  }

  @ApiModelProperty(value = "20210301")
  public String getFolioOtorgante(){return folioOtorgante;}
  public void setFolioOtorgante(String folioOtorgante){this.folioOtorgante = folioOtorgante;}

  @ApiModelProperty(value = "293547861")
  public String getFolioConsulta(){return folioConsulta;}
  public void setFolioConsulta(String folioConsulta) {this.folioConsulta = folioConsulta;}

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Data data = (Data) o;
    return Objects.equals(this.score, data.score);
  }
  @Override
  public int hashCode() {
    return Objects.hash(score);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Data {\n");
    
    sb.append("    scoreNoHit: ").append(toIndentedString(score)).append("\n");
    sb.append("    folioOtorgante: ").append(toIndentedString(folioOtorgante)).append("\n");
    sb.append("    folioConsulta: ").append(toIndentedString(folioConsulta)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
