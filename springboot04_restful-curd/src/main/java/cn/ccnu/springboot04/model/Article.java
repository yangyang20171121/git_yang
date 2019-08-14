package cn.ccnu.springboot04.model;

import java.util.List;

public class Article {
    private Long id;
    private String author;
    private String title;
    private String content;
    private String createTime;
    private List<Reader> reader;

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createTime='" + createTime + '\'' +
                ", reader=" + reader +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public List<Reader> getReader() {
        return reader;
    }

    public void setReader(List<Reader> reader) {
        this.reader = reader;
    }
}
