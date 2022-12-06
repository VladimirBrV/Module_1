package org.example.Homework4.advanced;

public class Watch  {
    private boolean work;
    public Watch(boolean work) {
        this.work = work;
    }
    public void Tik () throws WatchBrokenError {
        if (!work) {
            throw new WatchBrokenError("Ошибка часы сломаны");}
        if (work) {System.out.println("Часы тикают");
        }
    }
}
