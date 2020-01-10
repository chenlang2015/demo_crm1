package com.snow.dto;

import java.util.List;

public class Page<T> {

    private List<T> page;
    private boolean hasPre;
    private boolean hasNext;
    private int pageCount;
    private int pageNo;

    public List<T> getPage() {
        return page;
    }

    public void setPage(List<T> page) {
        this.page = page;
    }

    public boolean isHasPre() {
        return hasPre;
    }

    public void setHasPre(boolean hasPre) {
        this.hasPre = hasPre;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    @Override
    public String toString() {
        return "Page{" +
                "page=" + page +
                ", hasPre=" + hasPre +
                ", hasNext=" + hasNext +
                ", pageCount=" + pageCount +
                ", pageNo=" + pageNo +
                '}';
    }
}
