package online.yaqian.zhiqiunode.model;
// default package
// Generated 2016-4-14 0:47:51 by Hibernate Tools 4.3.1.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


/**
 * Wish generated by hbm2java
 */
@Entity
@Table(name = "wish", catalog = "zhiqiunode", uniqueConstraints = @UniqueConstraint(columnNames = { "isbn",
		"user_id" }))
@DynamicInsert(true)
@DynamicUpdate(true)
public class Wish implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4573059281803840336L;
	private Integer wishId;
	private int userId;
	private String isbn;
	private Date updateTime;

	public Wish() {
	}

	public Wish(int userId, String isbn) {
		this.userId = userId;
		this.isbn = isbn;
	}
	
	public Wish(Integer wishId, int userId, String isbn) {
		this.wishId = wishId;
		this.userId = userId;
		this.isbn = isbn;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	
	@Column(name = "wish_id", unique = true, nullable = false)
	public Integer getWishId() {
		return this.wishId;
	}

	public void setWishId(Integer wishId) {
		this.wishId = wishId;
	}

	@Column(name = "user_id", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "isbn", updatable = false, length = 13)
	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_time", updatable = false, length = 19)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}