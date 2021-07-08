package com.luck.cow.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhangliang
 * @since 2021-07-07
 */
@Data
@TableName("diary_main")
public class DiaryMain extends Model<DiaryMain> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 终止价格
     */
    @TableField("closing_price")
    private BigDecimal closingPrice;

    /**
     * 期望买入价格
     */
    @TableField("expect_buy_price")
    private BigDecimal expectBuyPrice;

    /**
     * 真实买入价格
     */
    @TableField("buy_price")
    private BigDecimal buyPrice;

    /**
     * 期望卖出价格
     */
    @TableField("expect_sell_price")
    private BigDecimal expectSellPrice;

    /**
     * 真实卖出价格
     */
    @TableField("sell_price")
    private BigDecimal sellPrice;

    /**
     * 0：未买 1 ：已买
     */
    private Integer type;

    /**
     * 创建时间
     */
    @TableField("create_date")
    private Date createDate;

    /**
     * 买入时间
     */
    @TableField("buy_date")
    private Date buyDate;

    /**
     * 卖出时间
     */
    @TableField("sell_date")
    private Date sellDate;

    /**
     * 代码

     */
    private Integer code;

    /**
     * 名称
     */
    @TableField("code_name")
    private String codeName;

    /**
     * 用户名称
     */
    @TableField("user_id")
    private Long userId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
