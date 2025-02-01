package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
@TableName("proposed_project")
@Data
public class ProposedProject {
    @TableId(type = IdType.ASSIGN_ID)
    private Integer id;
    private String project_name;
    private Integer project_type;
    private String construction_unit;
    private String legal_representative;
    private String phone;
    private String construction_site;
    private String construction_nature;
    private Integer industry_category_id;
    private Long total_investment;
    private Integer status;
    private String creator;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/beijing")
    private Date create_time;
    private String updater;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/beijing")
    private Date update_time;
    private Boolean deleted;

    @TableLogic
    private Integer del_flag;


}
