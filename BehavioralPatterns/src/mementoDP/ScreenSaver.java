package mementoDP;

public class ScreenSaver
{
    public String Theme;
    public int TimeInterval;

    public ScreenSaver(String theme, int timeInterval) {
        Theme = theme;
        TimeInterval = timeInterval;
    }

    public Memento Save()
    {
        return new Memento(this.Theme, this.TimeInterval);
    }
    public void Restore(Memento memento)
    {
        this.Theme = memento.Theme;
        this.TimeInterval = memento.TimeInterval;
    }
}
