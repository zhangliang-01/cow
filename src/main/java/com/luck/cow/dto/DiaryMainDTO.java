package com.luck.cow.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author qinzx
 * @date 2021/07/13 14:39
 * @Copyright (C) 杭州同基汽车科技有限公司
 */
@Data
public class DiaryMainDTO {


    private Long id;

    /**
     * 终止价格
     */

    private BigDecimal closingPrice;

    /**
     * 期望买入价格
     */

    private BigDecimal expectBuyPrice;

    /**
     * 真实买入价格
     */

    private BigDecimal buyPrice;

    /**
     * 期望卖出价格
     */

    private BigDecimal expectSellPrice;

    /**
     * 真实卖出价格
     */

    private BigDecimal sellPrice;

    /**
     * 0：未买 1 ：已买
     */
    private Integer type;

    /**
     * 创建时间
     */

    private Date createDate;

    /**
     * 买入时间
     */

    private Date buyDate;

    /**
     * 卖出时间
     */

    private Date sellDate;

    /**
     * 代码

     */
    private Integer code;

    /**
     * 名称
     */

    private String codeName;



}