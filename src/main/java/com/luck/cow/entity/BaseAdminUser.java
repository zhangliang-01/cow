package com.luck.cow.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 系统管理员帐号
 * </p>
 *
 * @author zhangliang
 * @since 2021-07-07
 */
@Data
@TableName("base_admin_user")
public class BaseAdminUser extends Model<BaseAdminUser> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 系统用户名称
     */
    @TableField("sys_user_name")
    private String sysUserName;

    /**
     * 系统用户密码
     */
    @TableField("sys_user_pwd")
    private String sysUserPwd;

    /**
     * 角色
     */
    @TableField("role_id")
    private Integer roleId;

    /**
     * 手机号
     */
    @TableField("user_phone")
    private String userPhone;

    /**
     * 登记时间
     */
    @TableField("reg_time")
    private String regTime;

    /**
     * 状态（0：无效；1：有效）
     */
    @TableField("user_status")
    private Integer userStatus;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
