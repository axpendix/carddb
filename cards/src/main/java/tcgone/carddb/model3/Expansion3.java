package tcgone.carddb.model3;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Expansion3 {
  /**
   * three digit order id, i.e. 111 for base set
   */
  private String orderId;
  /**
   * Full Expansion Name (e.g. Base Set)
   */
  private String name;
  /**
   * url compatible id (e.g. base-set)
   */
  private String seoName;
  /**
   * Enum id: is used by game engine and card implementations. i.e. BASE_SET
   */
  private String enumId;
  /**
   * Abbreviation. i.e. BS
   */
  private String shortName;
  /**
   * pokemontcg.io id
   */
  private String pioId;
  private String series;
  private Integer officialCount;
  private String releaseDate;
  private String imageUrl;
  private String symbolUrl;
  private Boolean isFanMade;

  public String toString() {
    return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
  }
}