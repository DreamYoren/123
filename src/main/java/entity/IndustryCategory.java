package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

@TableName
public class IndustryCategory {
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


    //get & set
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getCreator() {
        return creator;
    }
    public void setCreator(Integer creator) {
        this.creator = creator;
    }
    public Date getCreate_time() {
        return create_time;
    }
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
    public String getUpdateUser() {
        return updater;
    }
    public void setUpdateUser(String updateUser) {
        this.updater = updateUser;
    }
    public Date getUpdate_time() {
        return update_time;
    }
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
    public Boolean getDeleted() {
        return deleted;
    }
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

}
