/* ========================================================================
 * Copyright 2014 SportGroup
 *
 * Licensed under the MIT, The MIT License (MIT)
 * Copyright (c) 2014 SportGroup
  
 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:
  
 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.
  
 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 * ========================================================================
  
  
 Source generated by CrudMaker version 1.0.0.201411201032*/
package co.edu.uniandes.csw.SportGroup.sport.logic.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProviderDTO {
	
	private Long transactionId;
	
	private Long buyerId;
	
	private Long sellerId;
	
	private Long offerId;
	
	private Date date;
	
	private Long value;
	
	private Integer quantity;
	
	public Long getTransactionId(){
		return transactionId;
	}
	
	public Long getBuyerId(){
		return buyerId;
	}
	
	public Long getSellerId(){
		return sellerId;
	}
	
	public Long getOfferId(){
		return offerId;
	}
	
	public Date getDate(){
		return date;
	}
	
	public Long getValue(){
		return value;
	}
	
	public Integer getQuantity(){
		return quantity;
	}
	
	public void setTransactionId(Long transactionId){
		this.transactionId=transactionId;
	}
	
	public void setBuyerId(Long buyerId){
		this.buyerId=buyerId;
	}
	
	public void setSellerId(Long sellerId){
		this.sellerId=sellerId;
	}
	
	public void setOfferId(Long offerId){
		this.offerId=offerId;
	}
	
	public void setDate(Date date){
		this.date=date;
	}
	
	public void setValue(Long value){
		this.value=value;
	}
	
	public void setQuantity(Integer quantity){
		this.quantity=quantity;
	}
}