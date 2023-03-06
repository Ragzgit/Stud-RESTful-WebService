package ragav.rest.service.resources;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_SURVEY")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="survey_id")
	private int id;
    
    @Column(name="studentFname")
	private String fname;
    
    @Column(name="studentLname")
	private String lname;
    
    @Column(name="address")
	private String address;
    
    @Column(name="city")
	private String city;
    
    @Column(name="state")
	private String state;
    
    @Column(name="zipcode")
	private String zipcode;
    
    @Column(name="phone")
	private String phoneNumber;
    
    @Column(name="email_id")
	private String email;
    
    @Column(name="submission_date")
	private Date date;
    
    @Column(name="student_likes")
   	private String like;
    
    @Column(name="student_interest")
   	private String interest;
    
    @Column(name="student_recommend")
   	private String recommend;
    
    public Student() {
    	
    }
    
	
//	public Student(int id, String fname, String lname, String address, String city, String state, String zipcode, String phoneNumber, String email, Date date, String like, String interest, String recommend) {
//		super();
//		this.id = id;
//		this.fname = fname;
//		this.lname = lname;
//		this.address = address;
//		this.state = state;
//		this.city = city;
//		this.zipcode = zipcode;
//		this.phoneNumber = phoneNumber;
//		this.email = email;
//		this.date = date;
//		this.like = like;
//		this.interest = interest;
//		this.recommend = recommend;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getZipcode() {
		return zipcode;
	}
	
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getLike() {
		return like;
	}
	
	public void setLike(String like) {
		this.like = like;
	}
	
	public String getInterest() {
		return interest;
	}
	
	public void setInterest(String interest) {
		this.interest = interest;
	}
	
	public String getRecommend() {
		return recommend;
	}
	
	public void setRecommend(String recommend) {
		this.recommend = recommend;
	
	}
}
