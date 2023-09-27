package practice;
import java.util.Date;
import java.util.Objects;

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
	//①書名と発行日が同じであれば等価
	public boolean equals(Object o) {
		if (o == this) return true;
		if(!(o instanceof Account)) return false;
		Book r = (Book)o;
		
		if(!this.title.trim().equals(r.title.trim())){
			return false;
		}
		if(!this.publishDate.equals(r.publishDate)){
			return false;
		}
		
		return true;
	}
	//①HashSet対応
	public int hashcode() {
		return Objects.hash(this.title,this.publishDate,this.comment);
	}
	//②発行日が古い順を自然順序とする
	@Override
	public int compareTo(Book o) {
		// TODO 自動生成されたメソッド・スタブ
		if(this.publishDate.after(o.publishDate)) {
			return -1;
		}
		if(this.publishDate.before(o.publishDate)) {
			return 1;
		}
		return 0;
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
