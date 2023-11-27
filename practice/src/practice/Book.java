package practice;
import java.util.Date;

import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Book implements Comparable<Book>,Cloneable{
	private String title;
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private Date publishDate;
	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	private String comment;
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	//①書名と発行日とコメントが同じであれば等価
	public boolean equals(Object o) {		
		 return EqualsBuilder.reflectionEquals(this, o);
	}
	//①HashSet対応
//	public int hashcode() {
//		return Objects.hash(this.title,this.publishDate,this.comment);
//	}
	public int hashcode(){
	return HashCodeBuilder.reflectionHashCode(this);
}
	//②発行日が古い順を自然順序とする
	public int compareTo(Book o) {
		return CompareToBuilder.reflectionCompare(this, o);
	}
	
	//③深いコピー
	public Book clone() {
		Book result = new Book();
		result.comment = this.comment;
		result.publishDate = this.publishDate;
		result.title = this.title;
		return result.clone();
	}
	
}
