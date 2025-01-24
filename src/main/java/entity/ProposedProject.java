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
    private String name;
    private Integer type;
    private String constructionUnit;
    private String legalRepresentative;
    private String phone;
    private String constructionSite;
    private String constructionNature;
    private Integer industryCategoryId;
    private Long totalInvestment;
    private Integer status;
    private String createUser;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/shanghai")
    private Date createTime;
    private String updateUser;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/shanghai")
    private Date updateTime;
    private Boolean isDeleted;

    @TableLogic
    private Integer del_flag;

    // getters and setters
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
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public String getConstructionUnit() {
        return constructionUnit;
    }
    public void setConstructionUnit(String constructionUnit) {
        this.constructionUnit = constructionUnit;
    }
    public String getLegalRepresentative() {
        return legalRepresentative;
    }
    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getConstructionSite() {
        return constructionSite;
    }
    public void setConstructionSite(String constructionSite) {
        this.constructionSite = constructionSite;
    }
    public String getConstructionNature() {
        return constructionNature;
    }
    public void setConstructionNature(String constructionNature) {
        this.constructionNature = constructionNature;
    }
    public Integer getIndustryCategoryId() {
        return industryCategoryId;
    }
    public void setIndustryCategoryId(Integer industryCategoryId) {
        this.industryCategoryId = industryCategoryId;
    }
    public Long getTotalInvestment() {
        return totalInvestment;
    }
    public void setTotalInvestment(Long totalInvestment) {
        this.totalInvestment = totalInvestment;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getCreateUser() {
        return createUser;
    }
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public String getUpdateUser() {
        return updateUser;
    }
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public Boolean getIsDeleted() {
        return isDeleted;
    }
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    public Integer getDel_flag() {
        return del_flag;
    }
    public void setDel_flag(Integer del_flag) {
        this.del_flag = del_flag;
    }
}
