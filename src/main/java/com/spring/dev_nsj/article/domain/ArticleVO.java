package com.spring.dev_nsj.article.domain;

import java.sql.Timestamp;

public class ArticleVO {

	private Integer articleNo;
	private Integer articleLevel;
	private String title;
	private String content;
	private String createUser;
	private Timestamp createDate;
	private String modifyUser;
	private Timestamp modifyDate;
	private String deleteUser;
	private Timestamp deleteDate;
	private String deleteFlg;
	private String lockUser;
	private Timestamp lockDate;
	private String lockFlg;

	public Integer getArticleNo() {
		return articleNo;
	}

	public void setArticleNo(Integer articleNo) {
		this.articleNo = articleNo;
	}

	public Integer getArticleLevel() {
		return articleLevel;
	}

	public void setArticleLevel(Integer articleLevel) {
		this.articleLevel = articleLevel;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

	public Timestamp getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Timestamp modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getDeleteUser() {
		return deleteUser;
	}

	public void setDeleteUser(String deleteUser) {
		this.deleteUser = deleteUser;
	}

	public Timestamp getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(Timestamp deleteDate) {
		this.deleteDate = deleteDate;
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	public String getLockUser() {
		return lockUser;
	}

	public void setLockUser(String lockUser) {
		this.lockUser = lockUser;
	}

	public Timestamp getLockDate() {
		return lockDate;
	}

	public void setLockDate(Timestamp lockDate) {
		this.lockDate = lockDate;
	}

	public String getLockFlg() {
		return lockFlg;
	}

	public void setLockFlg(String lockFlg) {
		this.lockFlg = lockFlg;
	}

	@Override
	public String toString() {
		return "ArticleVO [articleNo=" + articleNo + ", articleLevel=" + articleLevel + ", title=" + title
				+ ", content=" + content + ", createUser=" + createUser + ", createDate=" + createDate + ", modifyUser="
				+ modifyUser + ", modifyDate=" + modifyDate + ", deleteUser=" + deleteUser + ", deleteDate="
				+ deleteDate + ", deleteFlg=" + deleteFlg + ", lockUser=" + lockUser + ", lockDate=" + lockDate
				+ ", lockFlg=" + lockFlg + "]";
	}

}
