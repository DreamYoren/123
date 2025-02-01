package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@TableName
@Data
public class IndustryCategory implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(type = IdType.ASSIGN_ID)
    private Integer id;
    private String name;
    private Integer creator;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/beijing")
    private Date create_time;
    private String updater;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/beijing")
    private Date update_time;
    @TableLogic
    private Boolean deleted;

}
