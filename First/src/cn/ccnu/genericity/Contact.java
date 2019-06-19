package cn.ccnu.genericity;

public class Contact implements Info01 {
	private String address;
	private String telphone;
	private String zipcode;
	public Contact(String address,String telphone,String zipcode){
		this.setAddress(address);
		this.setTelphone(telphone);
		this.setZipcode(zipcode);
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String toString(){
		return "联系方式："+"\n"+"联系电话："+this.telphone
				+"\n"+"联系地址:"+this.address
				+"\n"+"邮政编码:"+this.zipcode;
	}
	

}
