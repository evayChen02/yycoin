package com.china.center.oa.sail.bean;

import java.io.Serializable;

import com.china.center.jdbc.annosql.constant.AnoConstant;
import com.china.center.jdbc.annotation.*;
import com.china.center.oa.sail.constanst.OutConstant;

@SuppressWarnings("serial")
@Entity(name = "发货单明细")
@Table(name = "T_CENTER_PACKAGE_ITEM")
public class PackageItemBean implements Serializable
{
	@Id(autoIncrement = true)
	private String id = "";
	
	@FK
	private String packageId = "";
	
	@FK(index = AnoConstant.FK_FIRST)
	private String outId = "";
	
	private String baseId = "";
	
	private String productId = "";
	
	private String productName = "";
	
	private int amount = 0;
	
	private double price = 0.0d;
	
	private double value = 0.0d;
	
	private String outTime = "";
	
	private String description = "";
	
	private String customerId = "";

    /**
     * 2015/9/29 打印回执单增加客户姓名
	 * not save in DB
     */
	@Ignore
    private String customerName = "";

	/**
	 * 2015/10/13 打印回执单增加商品性质/podate
	 */
	@Ignore
	private String itemType = "";

	@Ignore
	private String poDate = "";

	@Ignore
	private int outType = OutConstant.OUTTYPE_OUT_COMMON;
	
	/**
	 * 发票配送时 针对 银行 客户 记录  发票对应的商品明细，客户，销售单对应的银行订单号
	 */
	private String printText = "";
	
	/**
     * 销售单 紧急 标识 1:紧急
     */
    private int emergency = 0;
	
	/**
	 * 合成产品的子产品  <br>
	 */
	@Ignore
	private String showSubProductName = "";
	
	@Ignore
	private String refId = "";

	/**
	 * 2015/11/13 中原银行回执单打印取 out_import表里的商品编码字段productCode
	 */
	@Ignore
	private String productCode = "";

	/**
	 * 2017/1/22 #409
	 */
	@Ignore
	private String lhwd = "";


    /**
     * 2015/11/22 宁波银行回执单材质成色
     * 产品材质为 贵金属纪念章金 的字段值改为Au.999
     产品材质为 贵金属纪念章银 的字段值改为Ag.999
     产品材质为 贵金属纪念章_金银 的字段值改为Au.999+Ag.999
     产品克重 取 新产品申请中的原“外型”字段值，将“外型”改为产品克重，字段类型改为浮点型
     实物、包装、证书数量取对应字段值
     */
    @Ignore
    private String materiaType = "";

	/**2015/11/21 把新产品申请里的销售周期/销售对象/纸币类型/外型栏位，分别改为 实物数量、包装数量、证书数量、产品克重
	 * 实物数量
	 */
	@Ignore
	private int productAmount = 1;

	/**
	 * 包装数量
	 */
	@Ignore
	private int packageAmount = 0;

	/**
	 * 证书数量
	 */
	@Ignore
	private int certificateAmount = 0;

	/**
	 * 产品克重
	 */
	@Ignore
	private double productWeight = 0;
	
	public PackageItemBean()
	{
	}

	public int getOutType() {
		return outType;
	}

	public void setOutType(int outType) {
		this.outType = outType;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getPoDate() {
		return poDate;
	}

	public void setPoDate(String poDate) {
		this.poDate = poDate;
	}

	public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getPackageId()
	{
		return packageId;
	}

	public void setPackageId(String packageId)
	{
		this.packageId = packageId;
	}

	public String getOutId()
	{
		return outId;
	}

	public void setOutId(String outId)
	{
		this.outId = outId;
	}

	public String getBaseId()
	{
		return baseId;
	}

	public void setBaseId(String baseId)
	{
		this.baseId = baseId;
	}

	public String getProductId()
	{
		return productId;
	}

	public void setProductId(String productId)
	{
		this.productId = productId;
	}

	public String getProductName()
	{
		return productName;
	}

	public void setProductName(String productName)
	{
		this.productName = productName;
	}

	public String getShowSubProductName()
	{
		return showSubProductName;
	}

	public void setShowSubProductName(String showSubProductName)
	{
		this.showSubProductName = showSubProductName;
	}

	/**
	 * @return the description
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}

	/**
	 * @return the refId
	 */
	public String getRefId()
	{
		return refId;
	}

	/**
	 * @param refId the refId to set
	 */
	public void setRefId(String refId)
	{
		this.refId = refId;
	}

	/**
	 * @return the price
	 */
	public double getPrice()
	{
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price)
	{
		this.price = price;
	}

	/**
	 * @return the value
	 */
	public double getValue()
	{
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(double value)
	{
		this.value = value;
	}

	/**
	 * @return the amount
	 */
	public int getAmount()
	{
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount)
	{
		this.amount = amount;
	}

	/**
	 * @return the outTime
	 */
	public String getOutTime()
	{
		return outTime;
	}

	/**
	 * @param outTime the outTime to set
	 */
	public void setOutTime(String outTime)
	{
		this.outTime = outTime;
	}

	/**
	 * @return the customerId
	 */
	public String getCustomerId()
	{
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId)
	{
		this.customerId = customerId;
	}

	/**
	 * @return the printText
	 */
	public String getPrintText() {
		return printText;
	}

	/**
	 * @param printText the printText to set
	 */
	public void setPrintText(String printText) {
		this.printText = printText;
	}

	/**
	 * @return the emergency
	 */
	public int getEmergency() {
		return emergency;
	}

	/**
	 * @param emergency the emergency to set
	 */
	public void setEmergency(int emergency) {
		this.emergency = emergency;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

    public String getMateriaType() {
        return materiaType;
    }

    public void setMateriaType(String materiaType) {
        this.materiaType = materiaType;
    }

	public int getProductAmount() {
		return productAmount;
	}

	public void setProductAmount(int productAmount) {
		this.productAmount = productAmount;
	}

	public int getPackageAmount() {
		return packageAmount;
	}

	public void setPackageAmount(int packageAmount) {
		this.packageAmount = packageAmount;
	}

	public int getCertificateAmount() {
		return certificateAmount;
	}

	public void setCertificateAmount(int certificateAmount) {
		this.certificateAmount = certificateAmount;
	}

	public double getProductWeight() {
		return productWeight;
	}

	public void setProductWeight(double productWeight) {
		this.productWeight = productWeight;
	}

	public String getLhwd() {
		return lhwd;
	}

	public void setLhwd(String lhwd) {
		this.lhwd = lhwd;
	}
}
