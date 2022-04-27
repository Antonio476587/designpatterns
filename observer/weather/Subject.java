public interface Subject {
    public void registryObserver(Observer ob);
    public void removeObserver(Observer ob);
    public void notifyObservers();
}