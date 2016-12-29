package com.china.center.oa.sail.constanst;

import com.china.center.jdbc.annotation.Defined;

public interface ShipConstant
{
	/**
	 * 发货状态 初始
	 */
	@Defined(key = "shipStatus", value = "初始")
	int SHIP_STATUS_INIT = 0;
	
	/**
	 * 发货状态 已拣配
	 */
	@Defined(key = "shipStatus", value = "已拣配")
	int SHIP_STATUS_PICKUP = 1;
	
	/**
	 * 发货状态 已发货
	 */
	@Defined(key = "shipStatus", value = "已发货")
	int SHIP_STATUS_CONSIGN = 2;
	
	/**
	 * 发货状态 已打印
	 */
	@Defined(key = "shipStatus", value = "已打印")
	int SHIP_STATUS_PRINT = 3;

	/**
	 * #328
	 */
	@Defined(key = "shipStatus", value = "打印发票")
	int SHIP_STATUS_PRINT_INVOICEINS = 5;

    /**
     * 2015/3/19 "商品拣配”增加查询条件 “发票单发”
     * CK单中只有A或FP开头的单号
     */
    @Defined(key = "invoiceShipStatus", value = "发票单发")
    int INVOICE_SHIP_ALONE = 0;

    @Defined(key = "invoiceShipStatus", value = "非发票单发")
    int INVOICE_SHIP_FOLLOW_OUT = 1;

    @Defined(key = "zsShipStatus", value = "赠品单发")
    int ZS_SHIP_ALONE = 0;

    @Defined(key = "zsShipStatus", value = "混合")
    int ZS_SHIP_FOLLOW_OUT = 1;

	@Defined(key = "pickupStatus", value = "已捡配")
	int PICKUP_YES = 0;

	@Defined(key = "pickupStatus", value = "未捡配")
	int PICKUP_NO = 1;
}
