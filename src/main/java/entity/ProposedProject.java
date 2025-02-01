package entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
@TableName("proposed_project")
public class ProposedProject {
    @TableId
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

    // getters and setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getProject_name() {
        return project_name;
    }
    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }
    public Integer getProject_type() {
        return project_type;
    }
    public void setProject_type(Integer project_type) {
        this.project_type = project_type;
    }
    public String getConstruction_unit() {
        return construction_unit;
    }
    public void setConstruction_unit(String construction_unit) {
        this.construction_unit = construction_unit;
    }
    public String getLegal_representative() {
        return legal_representative;
    }
    public void setLegal_representative(String legal_representative) {
        this.legal_representative = legal_representative;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getConstruction_site() {
        return construction_site;
    }
    public void setConstruction_site(String construction_site) {
        this.construction_site = construction_site;
    }
    public String getConstruction_nature() {
        return construction_nature;
    }
    public void setConstruction_nature(String construction_nature) {
        this.construction_nature = construction_nature;
    }
    public Integer getIndustry_category_id() {
        return industry_category_id;
    }
    public void setIndustry_category_id(Integer industry_category_id) {
        this.industry_category_id = industry_category_id;
    }
    public Long getTotal_investment() {
        return total_investment;
    }
    public void setTotal_investment(Long total_investment) {
        this.total_investment = total_investment;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }
    public Date getCreate_time() {
        return create_time;
    }
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
    public String getUpdater() {
        return updater;
    }
    public void setUpdater(String updater) {
        this.updater = updater;
    }
    public Date getUpdate_time() {
        return update_time;
    }
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
    public Boolean getIsDeleted() {
        return deleted;
    }
    public void setIsDeleted(Boolean isDeleted) {
        this.deleted = isDeleted;
    }
    public Integer getDel_flag() {
        return del_flag;
    }
    public void setDel_flag(Integer del_flag) {
        this.del_flag = del_flag;
    }
}
