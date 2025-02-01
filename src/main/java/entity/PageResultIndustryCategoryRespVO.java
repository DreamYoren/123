package entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PageResultIndustryCategoryRespVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<IndustryCategoryRespVO> list;
    private Integer total;


}
