package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 工作人员
 *
 * @author 
 * @email
 */
@TableName("gongzuorenyuan")
public class GongzuorenyuanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GongzuorenyuanEntity() {

	}

	public GongzuorenyuanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 工作人员姓名
     */
    @TableField(value = "gongzuorenyuan_name")

    private String gongzuorenyuanName;


    /**
     * 头像
     */
    @TableField(value = "gongzuorenyuan_photo")

    private String gongzuorenyuanPhoto;


    /**
     * 手机号
     */
    @TableField(value = "gongzuorenyuan_phone")

    private String gongzuorenyuanPhone;


    /**
     * 电子邮箱
     */
    @TableField(value = "gongzuorenyuan_email")

    private String gongzuorenyuanEmail;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 假删
     */
    @TableField(value = "gongzuorenyuan_delete")

    private Integer gongzuorenyuanDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：工作人员姓名
	 */
    public String getGongzuorenyuanName() {
        return gongzuorenyuanName;
    }
    /**
	 * 获取：工作人员姓名
	 */

    public void setGongzuorenyuanName(String gongzuorenyuanName) {
        this.gongzuorenyuanName = gongzuorenyuanName;
    }
    /**
	 * 设置：头像
	 */
    public String getGongzuorenyuanPhoto() {
        return gongzuorenyuanPhoto;
    }
    /**
	 * 获取：头像
	 */

    public void setGongzuorenyuanPhoto(String gongzuorenyuanPhoto) {
        this.gongzuorenyuanPhoto = gongzuorenyuanPhoto;
    }
    /**
	 * 设置：手机号
	 */
    public String getGongzuorenyuanPhone() {
        return gongzuorenyuanPhone;
    }
    /**
	 * 获取：手机号
	 */

    public void setGongzuorenyuanPhone(String gongzuorenyuanPhone) {
        this.gongzuorenyuanPhone = gongzuorenyuanPhone;
    }
    /**
	 * 设置：电子邮箱
	 */
    public String getGongzuorenyuanEmail() {
        return gongzuorenyuanEmail;
    }
    /**
	 * 获取：电子邮箱
	 */

    public void setGongzuorenyuanEmail(String gongzuorenyuanEmail) {
        this.gongzuorenyuanEmail = gongzuorenyuanEmail;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：假删
	 */
    public Integer getGongzuorenyuanDelete() {
        return gongzuorenyuanDelete;
    }
    /**
	 * 获取：假删
	 */

    public void setGongzuorenyuanDelete(Integer gongzuorenyuanDelete) {
        this.gongzuorenyuanDelete = gongzuorenyuanDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Gongzuorenyuan{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", gongzuorenyuanName=" + gongzuorenyuanName +
            ", gongzuorenyuanPhoto=" + gongzuorenyuanPhoto +
            ", gongzuorenyuanPhone=" + gongzuorenyuanPhone +
            ", gongzuorenyuanEmail=" + gongzuorenyuanEmail +
            ", sexTypes=" + sexTypes +
            ", gongzuorenyuanDelete=" + gongzuorenyuanDelete +
            ", createTime=" + createTime +
        "}";
    }
}
