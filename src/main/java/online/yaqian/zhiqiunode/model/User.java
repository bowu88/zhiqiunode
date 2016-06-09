package online.yaqian.zhiqiunode.model;
// default package
// Generated 2016-4-4 21:51:03 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * User generated by hbm2java
 */
@Entity(name="User")
@Table(name = "user", catalog = "zhiqiunode")
@DynamicInsert(true)
@DynamicUpdate(true)
public class User implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4305372508611919634L;
	private Integer userId;
	private String nickName;
	private Integer gender;
	private String major;
	private String am;
	private String college;
	private Integer enrolYear;
	private Integer profileId;
	private String wcQrcode;
	private String minor;
	private boolean flag;
	private Date updateTime;
	private Date datetime;

	public User() {
	}
	
	public User(String nickName, Integer gender, String major, String am, String college, Integer enrolYear, Integer profileId,
			String wcQrcode, String minor, boolean flag) {
		this.am = am;
		this.nickName = nickName;
		this.gender = gender;
		this.major = major;
		this.college = college;
		this.enrolYear = enrolYear;
		this.profileId = profileId;
		this.wcQrcode = wcQrcode;
		this.minor = minor;
		this.flag = flag;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "user_id", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "nick_name", length = 10)
	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Column(name = "gender")
	public Integer getGender() {
		return this.gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	@Column(name = "major", length = 2)
	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Column(name = "am", length = 45)
	public String getAm() {
		return this.am;
	}

	public void setAm(String am) {
		this.am = am;
	}
	
	@Column(name = "college", length = 2)
	public String getCollege() {
		return this.college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	//@Temporal(TemporalType.DATE)
	@Column(name = "enrol_year", length = 0)
	public Integer getEnrolYear() {
		return this.enrolYear;
	}

	public void setEnrolYear(Integer enrolYear) {
		this.enrolYear = enrolYear;
	}

	@Column(name = "profile_id")
	public Integer getProfileId() {
		return this.profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}
	
	@Column(name = "wc_qrcode", length = 20)
	public String getWcQrcode() {
		return this.wcQrcode;
	}

	public void setWcQrcode(String wcQrcode) {
		this.wcQrcode = wcQrcode;
	}

	@Column(name = "minor", length = 2)
	public String getMinor() {
		return this.minor;
	}

	public void setMinor(String minor) {
		this.minor = minor;
	}

	@Column(name = "flag")
	public boolean getFlag() {
		return this.flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_time", length = 19,updatable = false)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "datetime", length = 19,updatable = false)
	public Date getDatetime() {
		return this.datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	/**
	 * @Title:merge
	 * @Description:接收到的user对象剔除null值后，更新数据库中取出的，不会更改profileId
	 * @param update :接受到的user对象
	 * @return void
	 */
	public void merge(User update) {
		this.flag = update.getFlag();
		if (update.getCollege() != null) {
			this.college = update.getCollege();
		}
		if (update.getAm() != null) {
			this.am = update.getAm();
		}
		if (update.getEnrolYear() != null) {
			this.enrolYear =update.getEnrolYear();
		}
		if (update.getGender() != null) {
			this.gender =update.getGender();
		}
		if (update.getMajor() != null) {
			this.major =update.getMajor();
		}
		if (update.getMinor() != null) {
			this.minor =update.getMinor();
		}
		if (update.getNickName() != null) {
			this.nickName =update.getNickName();
		}
		if (update.getWcQrcode() != null) {
			this.wcQrcode =update.getWcQrcode();
		}
	}
}