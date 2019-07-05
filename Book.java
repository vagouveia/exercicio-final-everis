package br.com.everis.exerciciofinal;
/**
 * Classe Book para cadastro de livros
 * @author Vitor Alves
 *
 */


public class Book implements Comparable<Book>{

	private String title;
	private String author;
	private String ibsn;
	private int year;

	public Book() {
		super();
	}

	public Book(String title, String author, String ibsn, int year) {
		super();
		this.title = title;
		this.author = author;
		this.ibsn = ibsn;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIbsn() {
		return ibsn;
	}

	public void setIbsn(String ibsn) {
		this.ibsn = ibsn;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((ibsn == null) ? 0 : ibsn.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (ibsn == null) {
			if (other.ibsn != null)
				return false;
		} else if (!ibsn.equals(other.ibsn))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", ibsn=" + ibsn + ", year=" + year + "]";
	}

	public int compareTo(Book codigoBarras) {
		if (Integer.parseInt(getIbsn()) > Integer.parseInt(codigoBarras.getIbsn())) {
			return 1;
		} else if (Integer.parseInt(getIbsn()) < Integer.parseInt(codigoBarras.getIbsn())) {
			return -1;
		} else {
			return 0;
		}

	}
}
