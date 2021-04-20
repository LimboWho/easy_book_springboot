package com.domain;

import java.util.Date;

/**
 * @author xinting
 * @date 2021/2/27
 */
public class CatalogueOfGoods {
    private Integer categoryid;

    private String categorylevel;

    private Integer parentid;

    private String categorynmae;

    public CatalogueOfGoods(Integer categoryid, String categorylevel, Integer parentid, String categorynmae, Integer categoryrank) {
        this.categoryid = categoryid;
        this.categorylevel = categorylevel;
        this.parentid = parentid;
        this.categorynmae = categorynmae;
        this.categoryrank = categoryrank;
    }

    private Integer categoryrank;

    private Integer isdeleted;

    private Date createtime;

    private Integer createuser;

    private Date updatetime;

    private Integer updateuser;

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getCategorylevel() {
        return categorylevel;
    }

    public void setCategorylevel(String categorylevel) {
        this.categorylevel = categorylevel;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getCategorynmae() {
        return categorynmae;
    }

    public void setCategorynmae(String categorynmae) {
        this.categorynmae = categorynmae;
    }

    public Integer getCategoryrank() {
        return categoryrank;
    }

    public void setCategoryrank(Integer categoryrank) {
        this.categoryrank = categoryrank;
    }

    public Integer getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getCreateuser() {
        return createuser;
    }

    public void setCreateuser(Integer createuser) {
        this.createuser = createuser;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(Integer updateuser) {
        this.updateuser = updateuser;
    }
}