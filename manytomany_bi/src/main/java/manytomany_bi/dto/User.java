package manytomany_bi.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	private String name;
	private long phone;
	private String address;
	@ManyToMany
	@JoinTable(joinColumns=@JoinColumn(name = "uid"),inverseJoinColumns = @JoinColumn(name = "aid"))
	List<App>apps;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<App> getApps() {
		return apps;
	}
	public void setApps(List<App> apps) {
		this.apps = apps;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", phone=" + phone + ", address=" + address + ", apps=" + apps
				+ "]";
	}

	}
   

