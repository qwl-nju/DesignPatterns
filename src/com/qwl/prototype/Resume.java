package com.qwl.prototype;

public class Resume implements CloneAble{
    private String name;

    private Work work;

    @Override
    public Object clone() {
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + " ");
        sb.append(work.getWorkPlace());
        return sb.toString();
    }
}
