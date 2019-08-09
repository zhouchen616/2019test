/** 
 * Project Name:holyrobot-common 
 * File Name:ProductInfoVO.java 
 * Package Name:com.jingjie.vo 
 * Date:2018年3月26日 下午7:04:05 
 * author 汤玉林
 */ 
package com.holyrobot.dto;

import com.holyrobot.bo.ModifyProductBo;
import com.holyrobot.con_product.pojo.ProProductFile;
import com.holyrobot.con_product.pojo.ProProductStoreImage;
import com.holyrobot.con_product.pojo.ProProductTraffic;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @Description: 产品业务对象
 * @author 汤玉林
 * @date 2018年3月26日 下午7:04:05 
 */
public class ProductInfoVo implements Serializable{

	private static final long serialVersionUID = -6209866640267830525L;

	private ModifyProductBo product;//产品信息
	
	private String supplier;//供应商
	
	private String destination;//目的地

	private List<String> tags;//标签

	private List<ProProductTraffic> trafficList;
	
	private BigDecimal salesPrice;

	private BigDecimal directPrice;

	private List<ProProductStoreImage> imageList;//产品图片

	private ProductDetailPriceDto newPrice;

	private Integer producttype; //1-详细填写 2-整体填写 3-附件方式

	private String routedescription; //文档里的值

	private List<ProProductFile> proProductFiles; //产品对应文件

	private List<ProProductFile> proProductImages; //产品对应图片

	public Integer getProducttype() {
		return producttype;
	}

	public void setProducttype(Integer producttype) {
		this.producttype = producttype;
	}

	public String getRoutedescription() {
		return routedescription;
	}

	public void setRoutedescription(String routedescription) {
		this.routedescription = routedescription;
	}

	public List<ProProductFile> getProProductFiles() {
		return proProductFiles;
	}

	public void setProProductFiles(List<ProProductFile> proProductFiles) {
		this.proProductFiles = proProductFiles;
	}

	public List<ProProductFile> getProProductImages() {
		return proProductImages;
	}

	public void setProProductImages(List<ProProductFile> proProductImages) {
		this.proProductImages = proProductImages;
	}

	public ProductDetailPriceDto getNewPrice() {
		return newPrice;
	}

	public void setNewPrice(ProductDetailPriceDto newPrice) {
		this.newPrice = newPrice;
	}

	public List<ProProductStoreImage> getImageList() {
		return imageList;
	}

	public void setImageList(List<ProProductStoreImage> imageList) {
		this.imageList = imageList;
	}

	public BigDecimal getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}

	public BigDecimal getDirectPrice() {
		return directPrice;
	}

	public void setDirectPrice(BigDecimal directPrice) {
		this.directPrice = directPrice;
	}

	private List<TourPricePolicyBo> priceList;//日期价格对应的数据
	
	private List<ProductScheduleBo> scheduleList;//团期每天的行程信息

	public ModifyProductBo getProduct() {
		return product;
	}

	public void setProduct(ModifyProductBo product) {
		this.product = product;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public List<TourPricePolicyBo> getPriceList() {
		return priceList;
	}

	public void setPriceList(List<TourPricePolicyBo> priceList) {
		this.priceList = priceList;
	}

	public List<ProductScheduleBo> getScheduleList() {
		return scheduleList;
	}

	public void setScheduleList(List<ProductScheduleBo> scheduleList) {
		this.scheduleList = scheduleList;
	}

	public List<ProProductTraffic> getTrafficList() {
		return trafficList;
	}

	public void setTrafficList(List<ProProductTraffic> trafficList) {
		this.trafficList = trafficList;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}
}
