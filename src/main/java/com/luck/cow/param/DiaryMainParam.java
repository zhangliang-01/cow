package com.luck.cow.param;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zhangliang
 * @date 2021/07/07 16:44
 * @Copyright (C) 杭州同基汽车科技有限公司
 */
@Data
public class DiaryMainParam {

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
    /**
     * 用户名称
     */

    private Long userId;

}