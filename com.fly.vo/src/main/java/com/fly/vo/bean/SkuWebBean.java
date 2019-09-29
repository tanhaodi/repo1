package com.fly.vo.bean;

import java.util.Date;
import java.util.List;

public class SkuWebBean {
	private String skuId;
	private String productId;
	private String skuCode;
	private String barCode;
	private String skuName;
	private String thumbUrl;
	private String bannerImage;
	private String weight;
	private Integer unitType;
	private String costPrice;
	private String marketPrice;
	private String salePrice;
	private String groupPrice;
	private String lcPrice;
	private String platformProfit;
	private String firstProfit;
	private String secondProfit;
	private Integer saleCount;
	private Integer status;
	private Integer stock;
	private Integer syncStatus;
	private Integer defaultProduct;
	private Date createDate;
	private Date updateDate;
	private long deleteFlag;

	private String storeId;
	private Integer productType;
	private String productName;
	private Integer isLimit;
	private Integer limitMinCount;
	private Integer limitMaxCount;
	private Date limitBegin;
	private Date limitEnd;
	
	private String storeName;
	
	private Integer isShippingFree; 
	private Integer freeQuantity;

	private List<APISpecInfoBean> specNames;

	private String specValues;

	private String specIdVaule1;

	private String specIdVaule2;

	public String getSpecValues() {
		return specValues;
	}

	public void setSpecValues(String specValues) {
		this.specValues = specValues;
	}

	public String getSpecIdVaule2() {
		return specIdVaule2;
	}

	public void setSpecIdVaule2(String specIdVaule2) {
		this.specIdVaule2 = specIdVaule2;
	}

	public String getSpecIdVaule1() {
		return specIdVaule1;
	}

	public void setSpecIdVaule1(String specIdVaule1) {
		this.specIdVaule1 = specIdVaule1;
	}

	public List<APISpecInfoBean> getSpecNames() {
		return specNames;
	}

	public void setSpecNames(List<APISpecInfoBean> specNames) {
		this.specNames = specNames;
	}

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getSkuName() {
		return skuName;
	}

	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	public String getThumbUrl() {
		return thumbUrl;
	}

	public void setThumbUrl(String thumbUrl) {
		this.thumbUrl = thumbUrl;
	}

	public String getBannerImage() {
		return bannerImage;
	}

	public void setBannerImage(String bannerImage) {
		this.bannerImage = bannerImage;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public Integer getUnitType() {
		return unitType;
	}

	public void setUnitType(Integer unitType) {
		this.unitType = unitType;
	}

	public String getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(String costPrice) {
		this.costPrice = costPrice;
	}

	public String getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(String marketPrice) {
		this.marketPrice = marketPrice;
	}

	public String getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getGroupPrice() {
		return groupPrice;
	}

	public void setGroupPrice(String groupPrice) {
		this.groupPrice = groupPrice;
	}



	public String getLcPrice() {
		return lcPrice;
	}

	public void setLcPrice(String lcPrice) {
		this.lcPrice = lcPrice;
	}

	public String getPlatformProfit() {
		return platformProfit;
	}

	public void setPlatformProfit(String platformProfit) {
		this.platformProfit = platformProfit;
	}

	public String getFirstProfit() {
		return firstProfit;
	}

	public void setFirstProfit(String firstProfit) {
		this.firstProfit = firstProfit;
	}

	public String getSecondProfit() {
		return secondProfit;
	}

	public void setSecondProfit(String secondProfit) {
		this.secondProfit = secondProfit;
	}

	public Integer getSaleCount() {
		return saleCount;
	}

	public void setSaleCount(Integer saleCount) {
		this.saleCount = saleCount;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getSyncStatus() {
		return syncStatus;
	}

	public void setSyncStatus(Integer syncStatus) {
		this.syncStatus = syncStatus;
	}

	public Integer getDefaultProduct() {
		return defaultProduct;
	}

	public void setDefaultProduct(Integer defaultProduct) {
		this.defaultProduct = defaultProduct;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public long getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(long deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public Integer getProductType() {
		return productType;
	}

	public void setProductType(Integer productType) {
		this.productType = productType;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getIsLimit() {
		return isLimit;
	}

	public void setIsLimit(Integer isLimit) {
		this.isLimit = isLimit;
	}

	public Integer getLimitMinCount() {
		return limitMinCount;
	}

	public void setLimitMinCount(Integer limitMinCount) {
		this.limitMinCount = limitMinCount;
	}

	public Integer getLimitMaxCount() {
		return limitMaxCount;
	}

	public void setLimitMaxCount(Integer limitMaxCount) {
		this.limitMaxCount = limitMaxCount;
	}

	public Date getLimitBegin() {
		return limitBegin;
	}

	public void setLimitBegin(Date limitBegin) {
		this.limitBegin = limitBegin;
	}

	public Date getLimitEnd() {
		return limitEnd;
	}

	public void setLimitEnd(Date limitEnd) {
		this.limitEnd = limitEnd;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public Integer getIsShippingFree() {
		return isShippingFree;
	}

	public void setIsShippingFree(Integer isShippingFree) {
		this.isShippingFree = isShippingFree;
	}

	public Integer getFreeQuantity() {
		return freeQuantity;
	}

	public void setFreeQuantity(Integer freeQuantity) {
		this.freeQuantity = freeQuantity;
	}
}
